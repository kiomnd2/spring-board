package com.springpractice.board.controller;


import com.springpractice.board.dto.MemberDto;
import com.springpractice.board.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    private MemberService memberService;


    //메인페이지
    @GetMapping("/")
    public String index() {
        return "/index";
    }

    //회원가입 화면 이동
    @GetMapping("/user/signup")
    public String dispSignup() {
        return "/signup";
    }

    //회원가입 처리
    @PostMapping("/user/signup")
    public String execSignup(MemberDto memberDto) {
        memberService.joinUser(memberDto);

        return "redirect:/user/login";
    }

    //로그인 페이지
    @GetMapping("/user/login")
    public String dispLogin() {
        return "/login";
    }


    //로그인 결과 페이지
    @GetMapping("/user/login/result")
    public String dispLoginResult(){
        return "/loginSuccess";
    }


    //내정보 페이지
    @GetMapping("/user/info")
    public String dispMyInfo() {
        return "/myInfo";
    }

    //어드민 페이지
    @GetMapping("/admin")
    public String dispAdmin() {
        return "/admin";
    }

}
