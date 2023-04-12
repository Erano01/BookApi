package me.erano.com;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import me.erano.com.repo.BookRepository;


@DataJpaTest
@ComponentScan(basePackages = {"me.erano.com.bootstrap "})

@ActiveProfiles("local")
//mysql dataları üzerine override etmek için yukardaki annatosyonu kullanıyoruz
//fakat bu hata vermesine neden olacaktır
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//o yüzden yukarda belirtilen annatosyonu kullandık
public class MySQLIntegrationTest {
	
	@Autowired
	BookRepository bookRepository;
	

	@Test
	void testJpaTestSliceTransaction() {
		long countBefore = bookRepository.count();
		
		assertThat(countBefore).isEqualTo(2);
		//her çalıştığında 2 artacaktır ona göre yaz.
	}
}
