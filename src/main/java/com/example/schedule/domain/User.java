package com.example.schedule.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    private String id;
    private String pw;

    public User() {}

    public User(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public String getId() { return id; }
    public String getPw() { return pw; }

    public void setId(String id) { this.id = id; }
    public void setPw(String pw) { this.pw = pw; }

}
