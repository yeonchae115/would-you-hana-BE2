package com.hanaro.wouldyouhana.forSignIn.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class CustomerSignInReturnDTO {

    private String token;
    private Long id; //일반회원 or 행원의 id
    private String email;
    private String role; //role: 행원인 경우 “B” 일반회원: “C”
    private String location; // customer 테이블의 location
    private String nickName; //사용자 이름
    private String branchName; // (행원의 경우 사용할 지점명)
    private List<String> interestLocations;
}
