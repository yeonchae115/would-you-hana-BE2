package com.hanaro.wouldyouhana.dto.question;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QnaListDTO {

    private Long questionId;
    private Long customerId;
    private String answerBanker;
    private String categoryName;
//    private Long categoryId;
    private String title;
    private String location;
    private LocalDateTime createdAt;
    private Long commentCount;
    private Long likeCount;
    private Long scrapCount;
    private Long viewCount;

}
