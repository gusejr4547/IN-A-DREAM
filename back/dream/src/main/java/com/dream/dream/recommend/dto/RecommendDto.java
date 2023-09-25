package com.dream.dream.recommend.dto;

import com.dream.dream.member.dto.MemberDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RecommendDto {
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class DiaryRecommendResponseDto {

        private String id;
        private Long diaryId;
        private String title;
        private String content;
        private String image;
        private String emotion;
        private float positive;
        private float neutral;
        private float negative;
        private int likeCount;
        @JsonFormat(pattern = "yyyy-MM-dd")
        private LocalDateTime createdAt;
        private DiaryRecommendMemberResponseDto member;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class DiaryRecommendMemberResponseDto {
        private long id;
        private String email;
        private String nickname;
        private String gender;
    }

}
