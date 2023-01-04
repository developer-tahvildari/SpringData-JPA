package guru.springframework.sdjpaintro;

import guru.springframework.sdjpaintro.domain.Book;
import guru.springframework.sdjpaintro.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by Abdolrahim Tahvildari on 1/4/2023
 */
@DataJpaTest
public class SpringBootJpaTestSlice {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void testJpaTestSplice() {
        //given
        long countBefore = bookRepository.count();

        //when
        bookRepository.save(new Book("My Book", "1235555", "Self"));


        //then
        long countAfter = bookRepository.count();
        assertThat(countBefore).isLessThan(countAfter);
    }
}