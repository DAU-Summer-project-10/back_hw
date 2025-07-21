package com.example.schedule.controller;

import com.example.schedule.dto.UserDto;
import com.example.schedule.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String login(@RequestBody UserDto loginDto) {
        return userRepository.findByIdAndPw(loginDto.getId(), loginDto.getPw())
                .map(user -> "로그인 성공!")
                .orElse("로그인 실패!");
    }
}

