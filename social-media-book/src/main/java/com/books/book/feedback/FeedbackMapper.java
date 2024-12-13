package com.books.book.feedback;

import com.books.book.book.Book;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author WIAM
 **/
@Service
public class FeedbackMapper {
    public Feedback toFeedback(FeedbackRequest request) {
        return Feedback.builder()
                .note(request.note())
                .comment(request.comment())
                .book(Book.builder()
                        .id(request.bookId())
                        .shareable(false)
                        .archived(false)
                        .build()
                )
                .build();
    }

}
