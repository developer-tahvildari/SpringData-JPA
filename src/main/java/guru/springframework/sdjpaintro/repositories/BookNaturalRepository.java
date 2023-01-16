package guru.springframework.sdjpaintro.repositories;

import guru.springframework.sdjpaintro.domain.BookNatural;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Abdolrahim Tahvildari on 1/16/2023
 */
public interface BookNaturalRepository extends JpaRepository<BookNatural, String> {
}