package guru.springframework.sdjpaintro.repositories;

import guru.springframework.sdjpaintro.domain.composite.AuthorComposite;
import guru.springframework.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Abdolrahim Tahvildari on 1/16/2023
 */
public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}
