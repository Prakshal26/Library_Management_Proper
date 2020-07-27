package com.library_management_proper.demo.bootstrap;

import com.library_management_proper.demo.models.Book;
import com.library_management_proper.demo.models.BookType;
import com.library_management_proper.demo.models.User;
import com.library_management_proper.demo.services.BookService;
import com.library_management_proper.demo.services.BookTypeService;
import com.library_management_proper.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {


   private final BookService bookService;
   private final BookTypeService bookTypeService;
   private final UserService userService;

    @Autowired
    public DataLoader(BookService bookService, BookTypeService bookTypeService,UserService userService) {
        this.bookService = bookService;
        this.bookTypeService = bookTypeService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {



        BookType bookType1 = new BookType();
        bookType1.setType("Fiction");
        bookTypeService.save(bookType1);


        BookType bookType2 = new BookType();
        bookType2.setType("Non-Fiction");
        bookTypeService.save(bookType2);


        Book book1 = new Book();

        book1.setName("ML Aggarwal");
        book1.setPrice(500);
        book1.setIsbn("111BN");
        book1.setIssueDate(LocalDate.now());
        book1.setBookType(bookType1);


        Book book2 = new Book();

        book2.setName("RS Sharma");
        book2.setPrice(1000);
        book2.setIsbn("2200N");
        book2.setIssueDate(LocalDate.now());
        book2.setBookType(bookType2);



        User user1 = new User();
        user1.setName("Prakshal");
        user1.setAddress("Chaman Vihar");


        user1.getBook().add(book1);
        user1.getBook().add(book2);

        book1.setUser(user1);
        book2.setUser(user1);

        userService.save(user1);

        bookService.save(book1);
        bookService.save(book2);

    }
}
