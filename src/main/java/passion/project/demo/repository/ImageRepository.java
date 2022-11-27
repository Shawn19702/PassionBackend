package passion.project.demo.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import passion.project.demo.model.Image;

import javax.transaction.Transactional;

@Repository
public interface ImageRepository extends CrudRepository<Image, Long> {
    @Query(value = "Select * From Image WHERE color LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    Iterable<Image> findByColorContaining(String query);

    @Query(value = "Select * From Image WHERE description LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    Iterable<Image> findByDescriptionContaining(String query);

    @Query("SELECT c FROM Image c WHERE c.ultraresoulution = true")
    Iterable<Image> findAllEnabled();

@Modifying
    @Query(value = "ALTER TABLE Image AUTO_INCREMENT = 1", nativeQuery = true)
@Transactional
void alterImageAutoincrement();


}


