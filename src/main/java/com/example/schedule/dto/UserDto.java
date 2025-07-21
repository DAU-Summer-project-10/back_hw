package com.example.schedule.dto;

public class UserDto {
    private String id;
    private String pw;

    public UserDto() {}

    public UserDto(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() { return id; }
    public String getPw() { return pw; }

    public void setId(String id) { this.id = id; }
    public void setPw(String pw) { this.pw = pw; }
}
