package com.books.book.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author WIAM
 **/
@Getter
@Setter
@Builder
public class AuthenticationResponse {
    private String token;
}