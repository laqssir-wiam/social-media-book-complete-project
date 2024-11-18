package com.books.book.book;

import org.springframework.data.jpa.domain.Specification;

/**
 * @author WIAM
 **/
public class BookSpecification {

    public static Specification<Book> withOwnerId(String ownerId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("createdBy"), ownerId);
    }
}
