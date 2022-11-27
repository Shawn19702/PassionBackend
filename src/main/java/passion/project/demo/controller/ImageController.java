package passion.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import passion.project.demo.model.Image;
import passion.project.demo.service.ImageService;

import java.util.List;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;


    @GetMapping("/images")
    public ResponseEntity<?> getAll() {
        return imageService.getAll();
    }

    @GetMapping("/image/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        return imageService.getOne(id);
    }

    @GetMapping("/image/random")
    public ResponseEntity<?> getRandomOne()  {
        return imageService.getRandomOne();
    }
    @GetMapping("/searchcolor")
    public ResponseEntity<?> searchColor(@RequestParam("query") String query){
        return imageService.searchColors(query);
    }
    @GetMapping("/searchdescription")
    public ResponseEntity<?> searchDescription(@RequestParam("query") String query){
        return imageService.searchDescription(query);
    }
    @GetMapping("/image/ultraresoulution")
    public ResponseEntity<?> findAllUltraresoulutionWallpapers(){
        return imageService.findAllUltraresoulutionWallpapers();
    }

    }
