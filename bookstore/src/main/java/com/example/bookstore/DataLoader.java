package com.example.bookstore;

import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {
    @Bean
    CommandLineRunner loadData(BookRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Book("Book One","Author A",2001,10.0));
                repository.save(new Book("Book Two","Author B",2002,12.0));
                repository.save(new Book("Book Three","Author C",2003,13.5));
                repository.save(new Book("Book Four","Author D",2004,14.0));
                repository.save(new Book("Book Five","Author E",2005,15.0));
                repository.save(new Book("Book Six","Author F",2006,16.0));
                repository.save(new Book("Book Seven","Author G",2007,17.0));
                repository.save(new Book("Book Eight","Author H",2008,18.0));
                repository.save(new Book("Book Nine","Author I",2009,19.0));
                repository.save(new Book("Book Ten","Author J",2010,20.0));
            }
        };
    }
}
