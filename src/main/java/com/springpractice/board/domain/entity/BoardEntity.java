package com.springpractice.board.domain.entity;


import javax.persistence.*;

@Entity
@Table(name = "board")
public class BoardEntity extends TimeEntity{

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 10, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
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
}
