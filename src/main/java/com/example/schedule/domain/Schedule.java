// com.example.schedule.domain.Schedule.java

package com.example.schedule.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private LocalDate date;
    private String content;

    public Schedule() {}

    public Schedule(String userId, LocalDate date, String content) {
        this.userId = userId;
        this.date = date;
        this.content = content;
    }

    // getter/setter 생략 가능하면 lombok 써도 됨
    public Long getId() { return id; }
    public String getUserId() { return userId; }
    public LocalDate getDate() { return date; }
    public String getContent() { return content; }

    public void setId(Long id) { this.id = id; }
    public void setUserId(String userId) { this.userId = userId; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setContent(String content) { this.content = content; }
}