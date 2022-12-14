package passion.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import passion.project.demo.model.Author;
import passion.project.demo.service.AuthorService;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/authors")
    public ResponseEntity<?> createAuthor(@RequestBody Author author)  {
        return authorService.createAuthor(author);
    }


    @GetMapping(value = "/authors")
    public ResponseEntity<?> getAllAuthors(){
        return authorService.getAllAuthors();
    }

    @GetMapping(value = "/authors/{id}")
    public ResponseEntity<?> getAuthorById(@PathVariable Long id)  {
        return authorService.getAuthor(id);
    }

    @PutMapping(value = "/authors/{id}")
    public ResponseEntity<?> updateAuthor(@RequestBody Author author, @PathVariable Long id){
        return authorService.updateAuthor(author, id);
    }

    @DeleteMapping(value = "/authors/{id}")
    public ResponseEntity<?> deleteCustomerById(@PathVariable Long id){
        return authorService.deleteAuthor(id);
    }


}





