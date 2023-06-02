package com.bubuwork.jf.om.service;

import com.bubuwork.jf.om.dao.UserRepository;
import com.bubuwork.jf.om.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("try to load user from db");
        SysUser dbUser = repo.findByMobile(username);
        if (dbUser == null){
           dbUser = repo.findByEmail(username);
           if(dbUser == null){
               dbUser = repo.findByUsername(username);
           }
        }
        if(dbUser != null){
//            return org.springframework.security.core.userdetails.User.withUsername(dbUser.getEmail()).password(dbUser.getPassword()).authorities("USER").build();
            return dbUser;
        }else{
            throw new UsernameNotFoundException("Username " + username + " not found");
        }
    }
}
