package com.library_management_proper.demo.repositories;

import com.library_management_proper.demo.models.BookType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookTypeRepository  extends JpaRepository<BookType,Long> {
}
