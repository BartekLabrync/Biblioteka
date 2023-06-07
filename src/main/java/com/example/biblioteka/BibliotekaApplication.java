package com.example.biblioteka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibliotekaApplication.class, args);
    }

}
/*TODO: 07.06.2023
    1. Na stronie books.html zrobić filtrację listy książek po autorze.
    2. Zrobić usuwanie książek
    3. Logowanie, rpzechowywanie zalogowanego użytkownika
    4. Dodać role użytkownikom
    5. filtrować opcje po rolach użytkownikach

 */