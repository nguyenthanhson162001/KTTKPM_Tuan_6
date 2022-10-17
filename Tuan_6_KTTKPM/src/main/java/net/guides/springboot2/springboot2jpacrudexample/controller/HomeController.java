package net.guides.springboot2.springboot2jpacrudexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import net.guides.springboot2.springboot2jpacrudexample.jwt.JwtTokenProvider;
import net.guides.springboot2.springboot2jpacrudexample.model.User;
import net.guides.springboot2.springboot2jpacrudexample.service.UserService;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class HomeController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @Autowired
    private PasswordEncoder passwordEncoder;


    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody User user){
        try {
            userService.loadUserByUsername(user.getUsername());
            return ResponseEntity.ok("User had existed");
        } catch (Exception e) {
            System.err.println("----------- Register ---------------");
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            return ResponseEntity.ok(userService.createUser(user));
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user){
        try {
            User user1  = userService.loadUserByUsername(user.getUsername());
            if (!passwordEncoder.matches(user.getPassword(), user1.getPassword())){
                throw new SecurityException();
            }
            return ResponseEntity.ok(jwtTokenProvider.generateToken(user1));
        } catch (Exception e) {
            return ResponseEntity.ok("Username or password not correct");
        }
    }
}
