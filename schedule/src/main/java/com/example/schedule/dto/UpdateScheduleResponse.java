package com.example.schedule.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UpdateScheduleResponse {

    private final Long id;
    private final String title; // 제목
    private final String content; // 내용
    private final String userId; // 작성자
    private final LocalDateTime createdAt;
    private final LocalDateTime modifiedAt;


    public UpdateScheduleResponse(Long id, String title, String content, String userId, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.userId = userId;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
