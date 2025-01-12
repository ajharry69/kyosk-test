package com.github.ajharry69.kyosktest.books;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "books")
record Book(
        @Id
        String id,
        String title
) {
}
