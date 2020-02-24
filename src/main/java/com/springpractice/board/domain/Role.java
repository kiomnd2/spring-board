package com.springpractice.board.domain;

import jdk.nashorn.internal.objects.annotations.Getter;


public enum Role {

    ADMIN("ROLE_ADMIN"),
    MEMBER("ROLE_MEMBER");


    private String value;

    public String getValue() {
        return value;
    }

    Role(String role_member) {
        this.value = role_member;
    }
}
