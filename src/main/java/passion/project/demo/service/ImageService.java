package passion.project.demo.service;

import passion.project.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import passion.project.demo.model.Image;
import passion.project.demo.repository.AuthorRepository;
import passion.project.demo.repository.ImageRepository;
import passion.project.demo.responsehandler.ResponseHandler;

import java.util.*;

@Service
public class ImageService {
   // INSERT INTO image(id, image, description, ultraresoulution, colors)
//   VALUES((1, ''), ('city'), ('a', TRUE),('{"blue", "red"}') );




    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private AuthorRepository authorRepository;



    public ResponseEntity<?> createImage(Long authorid, Image image)  {
         return authorRepository.findById(authorid).map(author -> {
            image.setAuthor(author);
             imageRepository.save(image);
             return ResponseHandler.generateResponse("Author added!", HttpStatus.OK ,image );

        }).orElseThrow(() -> new ResourceNotFoundException("categoryid " + authorid + " not found"));

    }



    public ResponseEntity<?> getAllimages() {

        List<Image> images = (List<Image>) imageRepository.findAll();
         if (images.isEmpty()){
             throw new ResourceNotFoundException("No images exist!");
         }
        return ResponseHandler.generateResponse("Got all images!", HttpStatus.OK ,images );

    }

    public ResponseEntity<?> getImage(Long id) {
        Optional<Image> image = imageRepository.findById(id);
if (image.isEmpty()){
    throw new ResourceNotFoundException("image id not found");
}
        return ResponseHandler.generateResponse("got image!", HttpStatus.OK ,image);
    }



    public ResponseEntity<?> updateImage(Long author_id, Image image)  {
        return authorRepository.findById(author_id).map(author -> {
            image.setAuthor(author);
            imageRepository.save(image);
            return ResponseHandler.generateResponse("got image!", HttpStatus.OK ,image );

        }).orElseThrow(() -> new ResourceNotFoundException("authorid " + author_id + " not found"));

    }

    public ResponseEntity<?> deleteImage(Long imageid){
        Optional <Image> image  = imageRepository.findById(imageid);
        if (image.isEmpty()) {
            throw new ResourceNotFoundException("Error deleting image");
        }else {
            imageRepository.deleteById(imageid);
        }
        return ResponseHandler.generateResponseNoObj("Image has been deleted", HttpStatus.OK);
    }

//    public Iterable<Image> findCategorybyId(Long categoryId){
//        return imageRepository.findBooksByCategoryId(categoryId);
//    }



    private final static Random RANDOMIZER = new Random();



    public ResponseEntity<?> getRandomOne(Long authorid) {
        Optional<Image> image = imageRepository.findById(nextLong(1, imageRepository.count() + 1));
        if (image.isEmpty()) {
            throw new ResourceNotFoundException("No wallpapers available");
        }
        return ResponseHandler.generateResponse("Wallpapers Found by Your Requested Color!", HttpStatus.OK, image);
    }

    private long nextLong(long lowerRange, long upperRange) {

        return (long) ((RANDOMIZER.nextDouble() * (upperRange - lowerRange)) + lowerRange);
        // 8                             50 - 1

// finding the random number                      // in the range of 1 and repository.count       1               1
    }

    public ResponseEntity<?> searchColors(String query) {
        List<Image> images = (List<Image>) imageRepository.findByColorContaining(query);
        if (images.isEmpty()) {
            throw new ResourceNotFoundException("Wallpapers with requested color not found");
        }
        return ResponseHandler.generateResponse("Wallpapers Found by Your Requested Color!", HttpStatus.OK, images);

    }

    public ResponseEntity<?> searchDescription(String query) {
        List<Image> images = (List<Image>) imageRepository.findByDescriptionContaining(query);
        {
            if (images.isEmpty()) {
                throw new ResourceNotFoundException("Wallpapers with requested description not found");

            }
        }
        return ResponseHandler.generateResponse("Wallpapers Found by Your Requested Description!", HttpStatus.OK, images);

    }

    public ResponseEntity<?> findAllUltraresoulutionWallpapers() {
        List<Image> images = (List<Image>) imageRepository.findAllEnabled();
        if (images.isEmpty()) {
            throw new ResourceNotFoundException("No Wallpapers with 4k Found");
        }
        return ResponseHandler.generateResponse("All Wallpapers Found With 4K!", HttpStatus.OK, images);
    }

    public ResponseEntity<?> findAllRegularQualityWallpapers() {
        List<Image> images = (List<Image>) imageRepository.findByEnabledFalse();
        if (images.isEmpty()) {
            throw new ResourceNotFoundException("No Wallpapers with 4k Found");
        }
        return ResponseHandler.generateResponse("All Wallpapers Found With Regular Quality!", HttpStatus.OK, images);
    }



}











