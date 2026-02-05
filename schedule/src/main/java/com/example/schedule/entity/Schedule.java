package com.example.schedule.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@Table(name = "Schedules")
@NoArgsConstructor(access = AccessLevel.PROTECTED)


public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50, nullable = false)
    private String title; // 제목
    @Column(length = 500, nullable = false)
    private String content; // 내용
    @Column(nullable = false, length = 20)
    private String userId; // 작성자
    @Column(nullable = false)
    private String password; // 비밀번호
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private LocalDateTime modifiedAt;

    public Schedule(String title, String content, String userId, String password, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.title = title;
        this.content = content;
        this.userId = userId;
        this.password = password;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
    public void update(String title, String content, String password) {
        this.title = title;
        this.userId = userId;
        this.password = password;

    }
}
