package com.library_management_proper.demo.controllers;

import com.library_management_proper.demo.models.BookType;
import com.library_management_proper.demo.services.BookService;
import com.library_management_proper.demo.services.BookTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;
    private  final BookTypeService bookTypeService;

    public BookController(BookService bookService, BookTypeService bookTypeService) {
        this.bookService = bookService;
        this.bookTypeService = bookTypeService;
    }

    @RequestMapping("/")
    public String listbooks(Model model) {

        model.addAttribute("books",bookService.findAll());

        return "book";
    }

}
