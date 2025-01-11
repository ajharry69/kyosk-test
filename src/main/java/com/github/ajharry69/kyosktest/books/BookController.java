package com.github.ajharry69.kyosktest.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {
    @GetMapping
    List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            books.add(new Book(String.valueOf(i), "Random book " + i));
        }
        return books;
    }
}
