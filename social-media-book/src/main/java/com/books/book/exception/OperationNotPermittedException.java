package com.books.book.exception;

/**
 * @author WIAM
 **/
public class OperationNotPermittedException extends RuntimeException {

    public OperationNotPermittedException() {
    }

    public OperationNotPermittedException(String message) {
        super(message);
    }
}
