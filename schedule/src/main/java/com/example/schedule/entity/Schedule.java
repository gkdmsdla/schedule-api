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


public class Schedule extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30, nullable = false)
    private String title; // 제목
    @Column(length = 200, nullable = false)
    private String content; // 내용
    @Column(length = 20, nullable = false)
    private String userId; // 작성자
    @Column(nullable = false)
    private String password; // 비밀번호

    public Schedule(String title, String content, String userId, String password) {
        this.title = title;
        this.content = content;
        this.userId = userId;
        this.password = password;
    }
    public void update(String title, String content, String password) {
        this.title = title;
        this.userId = userId;
        this.password = password;

    }
}
