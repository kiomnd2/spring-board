package com.springpractice.board.controller;

import com.springpractice.board.dto.BoardDto;
import com.springpractice.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public String list(Model model) {
        List<BoardDto> boardList = boardService.getBoardList();
        model.addAttribute("boardList",boardList);
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

    @RequestMapping(value = "/post/{no}", method = RequestMethod.GET)
    public String detail(@PathVariable("no") Long no, Model model){
        BoardDto boardDto = boardService.getPost(no);
        model.addAttribute("boardDto", boardDto);
        return "detail";
    }

    @GetMapping("/post/edit/{no}")
    public String edit(@PathVariable("no") Long no, Model model){
        BoardDto boardDto = boardService.getPost(no);
        model.addAttribute("boardDto",boardDto);
        return "update";
    }

    @PostMapping("/post/edit/update/{no}")
    public String update(BoardDto boardDto) {
        boardService.savePost(boardDto);
        return "redirect:/";
    }

    @PostMapping("/post/delete/{no}")
    public String delete(@PathVariable("no") Long no){
        boardService.deletePost(no);
        return "redirect:/";
    }
}
