package com.github.ajharry69.kyosktest.books;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/books")
class BookController {
    private final BookRepository bookRepository;

    BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    List<Book> findAll() {
        return bookRepository.findAll();
    }

    @PostMapping
    Book save(@RequestBody BookRequest book) {
        return bookRepository.save(new Book(UUID.randomUUID().toString(), book.title()));
    }
}
