package passion.project.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import passion.project.demo.exception.ResourceNotFoundException;
import passion.project.demo.model.Author;
import passion.project.demo.model.Image;
import passion.project.demo.repository.AuthorRepository;
import passion.project.demo.repository.ImageRepository;
import passion.project.demo.responsehandler.ResponseHandler;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private ImageRepository imageRepository;




    public ResponseEntity<?> createAuthor(Author author) {
        Author author1 = authorRepository.save(author);
         return ResponseHandler.generateResponse("Author added!", HttpStatus.OK,author1 );
    }



    public ResponseEntity<?> getAllAuthors() {
        Iterable<Author> authors = authorRepository.findAll();
        return ResponseHandler.generateResponse("Found all authors!", HttpStatus.OK, authors);
    }

    public ResponseEntity<?>  getAuthor(Long author_id) {
       Optional<Author> author = authorRepository.findById(author_id);
        return ResponseHandler.generateResponse("found author!", HttpStatus.OK, author);

    }

    public ResponseEntity<?> updateAuthor(Author author, Long id) {

        Optional<Author> author1 = authorRepository.findById(id);
        if (author1.isEmpty()){
            throw new ResourceNotFoundException("Cant find id");
        }
        else  {
            authorRepository.save(author);
        }
        return ResponseHandler.generateResponse("Updated Author!", HttpStatus.OK, author1);

    }
    public ResponseEntity<?> deleteAuthor( Long id) {
        Optional<Author> author1 = authorRepository.findById(id);
        if (author1.isEmpty()){
            throw new ResourceNotFoundException("Cant find id");
        }
        else  {
            authorRepository.deleteById(id);
        }
        return ResponseHandler.generateResponseNoObj("deleted Author!", HttpStatus.OK);

    }


}
