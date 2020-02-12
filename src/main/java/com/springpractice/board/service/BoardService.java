package com.springpractice.board.service;

import com.springpractice.board.domain.repository.BoardRepository;
import com.springpractice.board.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    BoardRepository boardRepository;

    @Autowired
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();

    }
}
