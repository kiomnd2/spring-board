package com.springpractice.board.service;

import com.springpractice.board.domain.repository.MemberRepository;
import com.springpractice.board.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

@Service
@AllArgsConstructor
public class UserService {
    private MemberRepository memberRepository;

    public Map<String,String> validateHandling(Errors errors) {
            Map<String,String> validatorResult = new HashMap<>();

            for(FieldError error : errors.getFieldErrors()) {
                String validKeyName = String.format("valid_%s", error.getField());
                validatorResult.put(validKeyName, error.getDefaultMessage());
            }
            return validatorResult;
    }

    //회원가입
    public void signUp(UserDto userDto) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        memberRepository.save(userDto.toEntity());
    }
}
