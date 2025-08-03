// com.example.schedule.dto.ScheduleDto.java

package com.example.schedule.dto;

import java.time.LocalDate;

public class ScheduleDto {
    private String userId;
    private LocalDate date;
    private String content;

    public ScheduleDto() {}

    public ScheduleDto(String userId, LocalDate date, String content) {
        this.userId = userId;
        this.date = date;
        this.content = content;
    }

    public String getUserId() { return userId; }
    public LocalDate getDate() { return date; }
    public String getContent() { return content; }

    public void setUserId(String userId) { this.userId = userId; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setContent(String content) { this.content = content; }
}