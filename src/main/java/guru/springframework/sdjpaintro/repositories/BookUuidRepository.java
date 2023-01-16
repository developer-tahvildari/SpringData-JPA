package guru.springframework.sdjpaintro.repositories;

import guru.springframework.sdjpaintro.domain.Book;
import guru.springframework.sdjpaintro.domain.BookUuid;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Abdolrahim Tahvildari on 1/3/2023
 */
public interface BookUuidRepository extends JpaRepository<BookUuid, Long> {
}
