package com.example.schedule.dto;

import jakarta.persistence.Column;
import lombok.Getter;

@Getter
public class CreateScheduleRequest {

    private String title; // 제목
    private String content; // 내용
    private String userId; // 작성자
    private String password; // 비밀번호
}
