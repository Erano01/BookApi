package me.erano.com;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import me.erano.com.repo.BookRepository;

@SpringBootTest
public class AppTest {
	
	@Autowired
	BookRepository bookRepository;

	@Test
	void testBookRepository() {
		long count = bookRepository.count();
		assertThat(count).isGreaterThan(0);
	}
	
	@Test
	void contextLoad() {
		
	}
}
