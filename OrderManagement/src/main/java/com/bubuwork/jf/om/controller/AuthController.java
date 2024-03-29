package com.bubuwork.jf.om.controller;

import com.bubuwork.jf.om.bean.LoginForm;
import com.bubuwork.jf.om.bean.SimpleResponse;
import com.bubuwork.jf.om.dao.UserRepository;
import com.bubuwork.jf.om.entity.SysUser;
import com.bubuwork.jf.om.exception.AppException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.DependsOn;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@DependsOn("securityFilterChain")
public class AuthController {

    private final RememberMeServices rememberMeServices;

    private final UserRepository userRepo;

    private final PasswordEncoder passwordEncoder;

    @PostMapping("/logon")
    public CurrentUser login(@RequestBody LoginForm form, BindingResult bindingResult,
                             HttpServletRequest request, HttpServletResponse response) {

        if (request.getUserPrincipal() != null) {
            throw new AppException("Please logout first.");
        }

        if (bindingResult.hasErrors()) {
            throw new AppException("Invalid username or password");
        }

        try {
            request.login(form.getUsername(), form.getPassword());
        } catch (ServletException e) {
            throw new AppException(e.getMessage());
        }

        var auth = (Authentication) request.getUserPrincipal();
        var user = (SysUser) auth.getPrincipal();

        rememberMeServices.loginSuccess(request, response, auth);
        return new CurrentUser(user.getId(), user.getNickname());
    }

    @PostMapping("/logout")
    public LogoutResponse logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return new LogoutResponse();
    }

    @PostMapping("/register")
    public SimpleResponse register(HttpServletRequest request, @RequestBody SysUser user) throws ServletException {
        user.setCreateAt(new Date());

        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);

        SysUser dbUser = userRepo.save(user);
        SimpleResponse srp = new SimpleResponse();
        if(dbUser.getId() > 0){
            srp.setCode(0);
            srp.setMessage("Success");
        }else{
            srp.setMessage("Failed");
            srp.setCode(500);
        }
        return srp;
    }

    @GetMapping("/currentUser")
    public CurrentUser getCurrentUser(@AuthenticationPrincipal SysUser user) {
        return new CurrentUser(user.getId(), user.getNickname());
    }

    @GetMapping("/csrf")
    public CsrfResponse csrf(HttpServletRequest request) {
        var csrf = (CsrfToken) request.getAttribute("_csrf");
        return new CsrfResponse(csrf.getToken());
    }

    public record CurrentUser(Integer id, String nickname) {}
    public record LogoutResponse() {}
    public record CsrfResponse(String token) {}
}