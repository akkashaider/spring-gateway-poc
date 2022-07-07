package com.example.bookservice;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Akkas Haider
 */
record Book(String title) {}

@RestController
@Log4j2
public class BookController {
    @GetMapping("/books")
    public List<Book> getBooks() {
        log.info("returning books");
        return List.of(
                new Book("The Lord of the Rings"),
                new Book("The Hobbit")
        );
    }
}
