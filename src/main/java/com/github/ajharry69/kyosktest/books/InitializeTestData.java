package com.github.ajharry69.kyosktest.books;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
class InitializeTestData implements CommandLineRunner {
    private final BookRepository bookRepository;

    public InitializeTestData(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        bookRepository.deleteAll();
        for (int i = 1; i <= new Random().nextInt(5, 15); i++) {
            Book book = new Book(UUID.randomUUID().toString(), "Book " + i);
            bookRepository.save(book);
        }
    }
}
