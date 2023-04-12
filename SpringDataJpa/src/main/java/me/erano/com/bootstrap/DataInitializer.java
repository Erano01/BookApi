package me.erano.com.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import me.erano.com.domain.Book;
import me.erano.com.repo.BookRepository;

@Profile({"local","default"})
@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    
    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book bookDDD = new Book("Domain Driven Design", "123", "RandomHouse",null);

        System.out.println("Id: " + bookDDD.getId() );

        Book savedDDD = bookRepository.save(bookDDD);

        System.out.println("Id: " + savedDDD.getId() );

        Book bookSIA = new Book("Spring In Action", "234234", "Oriely",null);
        Book savedSIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });

    }
}