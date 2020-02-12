package com.springpractice.board.controller;

import com.springpractice.board.dto.BoardDto;
import com.springpractice.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class BoardController
{

    private BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @RequestMapping("/")
    public String list() {
        return "list";
    }

    @RequestMapping(value = "/post" ,method = RequestMethod.GET)
    public String write(){
        return "write";
    }

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String write(BoardDto boardDto){
        boardService.savePost(boardDto);
        return "redirect:/";
    }


}
