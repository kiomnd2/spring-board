package com.springpractice.board.controller;


import com.springpractice.board.dto.MemberDto;
import com.springpractice.board.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    //메인페이지
    @GetMapping("/")
    public String index() {
        return "/index";
    }

    //로그인 결과 페이지
    @GetMapping("/user/login/result")
    public String dispLoginResult(){
        return "/loginSuccess";
    }

    @GetMapping("/user/denied")
    public String dispDenied() {
        return "/denied";
    }

    @GetMapping("/user/logout/result")
    public String dispLogout() {
        return "/logout";
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
