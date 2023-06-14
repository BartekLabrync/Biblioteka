package com.example.biblioteka.controller;

import com.example.biblioteka.entity.BookEntity;
import com.example.biblioteka.model.Author;
import com.example.biblioteka.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public String books(Model model){
        Iterable<BookEntity> books = bookRepository.findAll();
        model.addAttribute("books", books);
        model.addAttribute("author", new Author());

        return "books";
    }

    @PostMapping("/findByAuthor")
    public String findByAuthor(
            Author author,
            Model model){
        List<BookEntity> books = findBooksByAuthor(author);

        model.addAttribute("books", books);

        return "books";
    }

    private List<BookEntity> findBooksByAuthor(Author author){
        Iterable<BookEntity> allBooks = bookRepository.findAll();
        List<BookEntity> books = new ArrayList<>();

        for(BookEntity book : allBooks){
            if(book.getAuthorLastName().equals(author.getLastName())){
                books.add(book);
            }
        }

        return books;
    }

    @PostMapping("/deleteBook")
    public String deleteBook(
            Model model,
            @RequestParam String bookIsbn
            ){
        Iterable<BookEntity> allBooks = bookRepository.findAll();

        for(BookEntity book : allBooks){
            if(bookIsbn.equals(book.getISBN())){
                bookRepository.delete(book);
            }
        }

        return "redirect:books";
    }

    @GetMapping("/addBook")
    public String addBookView(Model model){

        model.addAttribute("newBook", new BookEntity());
        return "addBook";
    }

    @PostMapping("/addBook")
    public String addBook(
            BookEntity newBook,
            Model model){
        bookRepository.save(newBook);

        return "redirect:books";
    }
}
