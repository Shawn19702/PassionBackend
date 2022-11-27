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
}











