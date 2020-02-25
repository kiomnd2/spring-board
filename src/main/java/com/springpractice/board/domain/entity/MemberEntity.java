package com.springpractice.board.domain.entity;

import javax.persistence.*;


@Entity
@Table(name = "member")
public class MemberEntity{

    public MemberEntity() {
    }

    public MemberEntity(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false)
    private String email;
    @Column(length = 100, nullable = false)
    private String password;

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
