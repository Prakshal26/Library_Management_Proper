package com.library_management_proper.demo.repositories;

import com.library_management_proper.demo.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
