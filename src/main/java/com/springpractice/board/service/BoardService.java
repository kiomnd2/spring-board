package com.springpractice.board.service;

import com.springpractice.board.domain.entity.BoardEntity;
import com.springpractice.board.domain.repository.BoardRepository;
import com.springpractice.board.dto.BoardDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<BoardDto> getBoardList() {
        List<BoardEntity> boardEntities = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<BoardDto>();

        boardEntities.stream().forEach(boardEntity -> {
            BoardDto boardDto = new BoardDto();

            boardDto.setContent( boardEntity.getContent());
            boardDto.setId( boardEntity.getId());
            boardDto.setTitle( boardEntity.getTitle());
            boardDto.setUsername( boardEntity.getUsername());
            boardDto.setCreatedDate( boardEntity.getCreateDate());
            boardDto.setModifiedDate( boardEntity.getModifyDate());
            boardDtoList.add(boardDto);
        });

        return boardDtoList;
    }

    public BoardDto getPost(Long no) {
        BoardEntity boardEntity = boardRepository.getOne(no);
        BoardDto boardDto = new BoardDto();
        boardDto.setContent(boardEntity.getContent());
        boardDto.setId(boardEntity.getId());
        boardDto.setTitle(boardEntity.getTitle());
        boardDto.setModifiedDate(boardEntity.getModifyDate());
        boardDto.setCreatedDate(boardEntity.getCreateDate());
        boardDto.setUsername(boardEntity.getUsername());
        boardDto.setTitle(boardEntity.getTitle());
        return boardDto;
    }

    public void deletePost(Long no) {
        boardRepository.deleteById(no);
    }
}
