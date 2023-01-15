package guru.springframework.sdjpaintro.repositories;

import guru.springframework.sdjpaintro.domain.AuthorUuid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


/**
 * Created by Abdolrahim Tahvildari on 1/15/2023
 */
public interface AuthorUuidRepository extends JpaRepository<AuthorUuid, UUID> {
}
