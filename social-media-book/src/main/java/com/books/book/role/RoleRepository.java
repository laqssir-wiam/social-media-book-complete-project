package com.books.book.role;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author WIAM
 **/
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String roleStudent);
}
