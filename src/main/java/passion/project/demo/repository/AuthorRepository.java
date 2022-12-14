package passion.project.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import passion.project.demo.model.Author;
@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
