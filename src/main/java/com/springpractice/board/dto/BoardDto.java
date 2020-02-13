package com.springpractice.board.dto;

import com.springpractice.board.domain.entity.BoardEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BoardDto {
    private Long id;
    private String username;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

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

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(LocalDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public BoardEntity toEntity(){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setId(this.id);
        boardEntity.setContent(this.content);
        boardEntity.setTitle(this.title);
        boardEntity.setUsername(this.username);
        boardEntity.setCreateDate(this.createdDate);
        boardEntity.setModifyDate(this.modifiedDate);

        return boardEntity;
    }

}
