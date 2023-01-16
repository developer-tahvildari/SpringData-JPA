package guru.springframework.sdjpaintro.repositories;

import guru.springframework.sdjpaintro.domain.BookUuid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


/**
 * Created by Abdolrahim Tahvildari on 1/3/2023
 */
public interface BookUuidRepository extends JpaRepository<BookUuid, UUID> {
}
