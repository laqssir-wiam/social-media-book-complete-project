package com.books.book.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author WIAM
 **/
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String username);
}
