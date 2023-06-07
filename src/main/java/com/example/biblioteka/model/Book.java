package com.example.biblioteka.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String ISBN;
    private String title;
    private Author author;
    //private String authorName;
    //private String authorLastName;
    private LocalDate publicationDate;
}

