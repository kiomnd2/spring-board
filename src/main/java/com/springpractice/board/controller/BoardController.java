package com.springpractice.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BoardController
{

    @RequestMapping("/")
    public String list() {
        return "list";
    }

    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String write(){
        return "write";
    }


}
