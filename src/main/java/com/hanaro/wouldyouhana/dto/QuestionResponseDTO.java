package com.hanaro.wouldyouhana.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class QuestionResponseDTO {
    private Long question_id;
    private Long customer_id;
    private Long category_id;
    private String title;
    private String content;
    private String location;
    private LocalDateTime created_at;


}
