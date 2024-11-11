package com.books.book.email;

import lombok.Getter;

/**
 * @author WIAM
 **/
@Getter
public enum EmailTemplateName {

    ACTIVATE_ACCOUNT("activate_account")
    ;


    private final String name;
    EmailTemplateName(String name) {
        this.name = name;
    }
}
