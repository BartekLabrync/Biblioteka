package com.example.biblioteka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibliotekaApplication.class, args);
    }

}
/*
TODO: 07.06.2023
    1. Logowanie:
        - przechowywanie zalogowanego użytkownika
        - pobieranie danych do logowania z bazy
    2. Dodać role użytkownikom, filtrować opcje po rolach użytkowników
    3. Oddzielić Menu do osobnego nav.html i ładować na każdej podstronie
        - ładować manu na podstawie posiadanych opcji?
    4. Wypożyczanie książek:
        - dodać do BookEntity informacje o wypożyczeniu
    5. dołączyć API? do strony głównej?
    6. Slider? wyświetlanie wyróżnionych książek...
    7. api księgarni?
    8. testy


 */