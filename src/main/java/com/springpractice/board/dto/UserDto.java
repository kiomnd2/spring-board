package com.springpractice.board.dto;

import com.springpractice.board.domain.entity.MemberEntity;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDto {

    private Long id;

    @NotBlank(message = "닉네입음 필수 입니다")
    private String nickname;

    @NotBlank(message = "이메일은 필수 입니다")
    @Email(message = "이메일 형식에 맞지 않습니다.")
    private String email;

    @NotBlank(message = "비밀번호는 필수 입력 값 입니다.")
    @Pattern(regexp="(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,20}",
    message = "비밀번호는 영문 대 소문자와 숫자, 특수기호가 적어도 1개 이상씩 포함된 8자 ~ 20자의 비밀번호여야 합니다.")
    private String password;

    public MemberEntity toEntity() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(this.id);
        memberEntity.setEmail(this.email);
        memberEntity.setPassword(this.password);
        memberEntity.setNickname(this.nickname);
        return memberEntity;
    }

    @Builder
    public UserDto( Long id, String nickname,String email, String password) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }
}
