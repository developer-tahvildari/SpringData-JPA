package guru.springframework.sdjpaintro.repositories;

import guru.springframework.sdjpaintro.domain.composite.AuthorEmbedded;
import guru.springframework.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Abdolrahim Tahvildari on 1/16/2023
 */
public interface AuthorEmbeddedRepository extends JpaRepository<AuthorEmbedded, NameId> {
}
