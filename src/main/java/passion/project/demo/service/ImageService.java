package passion.project.demo.service;

import passion.project.demo.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import passion.project.demo.model.Image;
import passion.project.demo.repository.ImageRepository;
import passion.project.demo.responsehandler.ResponseHandler;

import java.util.*;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;


    private final static Random RANDOMIZER = new Random();

    public ResponseEntity<?> getAll() {
        List<Image> images = (List<Image>) imageRepository.findAll();
        if (images.isEmpty()) {
            throw new ResourceNotFoundException("No wallpapers available");
        }
        return ResponseHandler.generateResponse("Here's all of our wallpapers!", HttpStatus.OK, images);

    }

    //
    public ResponseEntity<?> getOne(Long id) {
        Optional<Image> image = imageRepository.findById(id);
        if (image.isEmpty()) {
            throw new ResourceNotFoundException("Image Id doesn't exist");
        }
        return ResponseHandler.generateResponse("Here's your wallpaper!", HttpStatus.OK, image);
    }


    public ResponseEntity<?> getRandomOne() {
        Optional<Image> image = imageRepository.findById(nextLong(1, imageRepository.count() + 1));
        if (image.isEmpty()) {
            throw new ResourceNotFoundException("No wallpapers available");
        }
        return ResponseHandler.generateResponse("Here's your wallpaper!", HttpStatus.OK, image);
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

    public ResponseEntity<?> createImaage(Image image) {
        Image image1 = imageRepository.save(image);
        if (image.getUltraresoulution() == null){
            throw new ResourceNotFoundException("Wallpaper Ultraresoulution must be true or false");
        }else if (image.getImage() == null){
            throw new ResourceNotFoundException("Wallpaper must have url");
        }else if (image.getColor() == null){
            throw new ResourceNotFoundException("Wallpaper must have a color");
        }else if (image.getDescription() == null){
            throw new ResourceNotFoundException("Wallpaper must have a description");
        }
        return ResponseHandler.generateResponse("All Wallpapers Found With Regular Quality!", HttpStatus.OK, image1);

    }
    public ResponseEntity<?> updateImage(Image image, Long id) {
        Optional<Image> image1 = imageRepository.findById(id);
        if (image1.isEmpty()){
            throw new ResourceNotFoundException("Cant find id");
        }
        else  {
            imageRepository.save(image);
        }
        return ResponseHandler.generateResponse("Updated Wallpaper!", HttpStatus.OK, image1);

    }
    public ResponseEntity<?> deleteImage(Image image, Long id) {
        Optional<Image> image1 = imageRepository.findById(id);
        if (image1.isEmpty()){
            throw new ResourceNotFoundException("Cant find id");
        }
        else  {
            imageRepository.deleteById(id);
        }
        return ResponseHandler.generateResponseNoObj("deleted Wallpaper!", HttpStatus.OK);

    }
}











