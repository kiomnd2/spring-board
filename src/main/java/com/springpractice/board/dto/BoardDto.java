package com.springpractice.board.dto;

import com.springpractice.board.domain.entity.BoardEntity;

public class BoardDto {
    private Long id;
    private String username;
    private String title;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BoardEntity toEntity(){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setId(this.id);
        boardEntity.setContent(this.content);
        boardEntity.setTitle(this.title);
        boardEntity.setUsername(this.username);
        return boardEntity;
    }

}
