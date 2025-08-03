package com.example.schedule.controller;

import com.example.schedule.domain.Schedule;
import com.example.schedule.dto.ScheduleDto;
import com.example.schedule.dto.UserDto;
import com.example.schedule.repository.ScheduleRepository;
import com.example.schedule.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;


    @PostMapping("/login")
    public String login(@RequestBody UserDto loginDto) {
        return userRepository.findByIdAndPw(loginDto.getId(), loginDto.getPw())
                .map(user -> "로그인 성공!")
                .orElse("로그인 실패!");
    }
    @PostMapping("/addSchedule")
    public String addSchedule(@RequestBody ScheduleDto scheduleDto) {
        try {
            // 1. userId로 User 존재 여부 확인
            boolean userExists = userRepository.existsById(scheduleDto.getUserId());
            if (!userExists) {
                return "유저가 존재하지 않습니다.";
            }

            // 2. Schedule 저장
            Schedule schedule = new Schedule(
                    scheduleDto.getUserId(),
                    scheduleDto.getDate(),
                    scheduleDto.getContent()
            );
            scheduleRepository.save(schedule);

            return "일정 저장 성공!";
        } catch (Exception e) {
            return "일정 저장 실패: " + e.getMessage();
        }
    }

}