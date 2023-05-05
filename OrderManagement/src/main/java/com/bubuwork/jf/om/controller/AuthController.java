package com.bubuwork.jf.om.controller;

import com.bubuwork.jf.om.bean.LoginForm;
import com.bubuwork.jf.om.exception.AppException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {
    @PostMapping("/login")
    public CurrentUser login(@RequestBody LoginForm form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new AppException("Invalid username or password");
        }
        return new CurrentUser(1, "Jerry");
    }

    @PostMapping("/logout")
    public LogoutResponse logout() {
        return new LogoutResponse();
    }

    @GetMapping("/current-user")
    public CurrentUser getCurrentUser() {
        return new CurrentUser(1, "Jerry");
    }

    public record CurrentUser(Integer id, String nickname) {}
    public record LogoutResponse() {}
}