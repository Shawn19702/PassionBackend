package passion.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import passion.project.demo.model.Image;

import javax.transaction.Transactional;

@Repository
public interface ImageRepository extends CrudRepository<Image, Long> {
    @Query(value = "Select * From Image WHERE colors LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    Iterable<Image> findByColorContaining(String query);

    @Query(value = "Select * From Image WHERE description LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    Iterable<Image> findByDescriptionContaining(String query);

    @Query("SELECT c FROM Image c WHERE c.ultraresoulution = true")
    Iterable<Image> findAllEnabled();
    @Query("SELECT c FROM Image c WHERE c.ultraresoulution = false")
    Iterable<Image> findByEnabledFalse();

    @Query(value = "SELECT * FROM Image WHERE Author = ?1", nativeQuery = true)
    String getAllImagesByAuthor(Long author);






//
//    @Modifying
//    @Query(value = "ALTER TABLE Image AUTO_INCREMENT = 1", nativeQuery = true)
//    @Transactional
//    void alterImageAutoincrement();

   // In the declarative approach,
    // we annotate the methods with the @Transactional annotation.
    // The @Transactional annotation makes use of the attributes rollbackFor
    // or rollbackForClassName to rollback the transactions


}


