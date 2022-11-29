package passion.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import passion.project.demo.model.Image;
import passion.project.demo.service.ImageService;

import java.util.List;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;


    @GetMapping("/wallpapers")
    public ResponseEntity<?> getAll() {
        return imageService.getAll();
    }

    @GetMapping("/wallpaper/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        return imageService.getOne(id);
    }

    @GetMapping("/wallpaper/random")
    public ResponseEntity<?> getRandomOne() {
        return imageService.getRandomOne();
    }

    @GetMapping("/searchcolor")
    public ResponseEntity<?> searchColor(@RequestParam("query") String query) {
        return imageService.searchColors(query);
    }

    @GetMapping("/searchdescription")
    public ResponseEntity<?> searchDescription(@RequestParam("query") String query) {
        return imageService.searchDescription(query);
    }

    @GetMapping("/wallpaper/ultraresoulution")
    public ResponseEntity<?> findAllUltraresoulutionWallpapers() {
        return imageService.findAllUltraresoulutionWallpapers();
    }

    @GetMapping("/wallpaper/regular-quality")
    public ResponseEntity<?> findAllRegularQuality() {
        return imageService.findAllRegularQualityWallpapers();
    }

    @PostMapping("/wallpaper")
    public ResponseEntity<?> CreateWallpaper(@RequestBody Image image) {
        return imageService.createImaage(image);
    }

    @PutMapping("/wallpaper/{id}")
    public ResponseEntity<?> updateWallpaper(@RequestBody Image image, @PathVariable Long id) {
        return imageService.updateImage(image, id);

    }

    @DeleteMapping("/wallpaper/{id}")
    public ResponseEntity<?> deleteWallpaper(@RequestBody Image image, @PathVariable Long id) {
return imageService.deleteImage(image, id);
    }
}
