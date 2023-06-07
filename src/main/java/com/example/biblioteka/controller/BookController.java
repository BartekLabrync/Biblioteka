package com.example.biblioteka.controller;

import com.example.biblioteka.entity.BookEntity;
import com.example.biblioteka.model.Author;
import com.example.biblioteka.model.Book;
import com.example.biblioteka.model.User;
import com.example.biblioteka.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public String users(Model model){
        Iterable<BookEntity> books = bookRepository.findAll();
        model.addAttribute("books", books);

        return "books";
    }


    @PostMapping("/addBook")
    public String addBook(
            BookEntity newBook,
            Model model){
        bookRepository.save(newBook);

        return "redirect:books";
    }

    @GetMapping("/addBook")
    public String addBookView(Model model){

        model.addAttribute("newBook", new BookEntity());
        return "addBook";
    }


}
