package passion.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import passion.project.demo.model.Author;
import passion.project.demo.model.Image;
import passion.project.demo.responsehandler.ResponseHandler;
import passion.project.demo.service.AuthorService;
import passion.project.demo.service.ImageService;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class ImageController {

    @Autowired
    private ImageService imageService;
    @Autowired
    private AuthorService authorService;


    @GetMapping("/wallpapers")
    public ResponseEntity<?> getAllImages(){
        return imageService.getAllimages();
    }

    @PostMapping("/wallpapers/{authorId}/accounts")
    public ResponseEntity<?> createImage(@PathVariable(value = "authorId") Long authorId, @Validated @RequestBody Image image){
    return imageService.createImage(authorId, image);
    }

    @GetMapping("/wallpaper/{wallpaperId}")
    public ResponseEntity<?> getImageById(@PathVariable Long wallpaperId) {
        return imageService.getImage(wallpaperId);
    }


    @PutMapping("/wallpapers/{authorId}/wallpapers")
    public ResponseEntity<?> updateImage(@PathVariable(value = "authorId") Long authorId, @Validated @RequestBody Image image){
        return  imageService.updateImage(authorId,image);
    }

    @DeleteMapping("/wallpapers/{wallpapersId}")
    public ResponseEntity<?> deleteImage(@PathVariable Long wallpapersId) {
        return imageService.deleteImage(wallpapersId);
    }




//    @GetMapping("/wallpapers")
//    public ResponseEntity<?> getAll() {
//        return imageService.getAllimages();
//    }
//
//    @GetMapping("/wallpaper/{id}")
//    public ResponseEntity<?> getOne(@PathVariable Long id) {
//        return imageService.getImage(id);
//    }

    @GetMapping("/wallpaper/{authorid}/random")
    public ResponseEntity<?> getRandomOne(@PathVariable Long authorid) {
        return imageService.getRandomOne(authorid);
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

//    @PostMapping("/wallpaper")
//    public ResponseEntity<?> CreateWallpaper(@RequestBody Image image, @PathVariable Long authorid) {
//        return imageService.createImage( authorid, image);
//    }
//
//    @PutMapping("/wallpaper/{authorid}")
//    public ResponseEntity<?> updateWallpaper(@RequestBody Image image, @PathVariable Long authorid) {
//        return imageService.updateImage(authorid, image);
//
//    }

//    @DeleteMapping("/wallpaper/{id}")
//    public ResponseEntity<?> deleteWallpaper( @PathVariable Long id) {
//return imageService.deleteImage(id);
//    }

//    @GetMapping("/countries")
//    public List<Object> getCountries(){
//        String url = "uB196tY4UZrLoHfamvcC3M5OMtidfhYO";
//        RestTemplate restTemplate = new RestTemplate();
//        Object [] countries =  restTemplate.getForObject(url, Object[].class);
//        return Arrays.asList(countries);
//    }
//
//    @Value("uB196tY4UZrLoHfamvcC3M5OMtidfhYO")
//    private String apiKey;
//
//RestTemplate restTemplate = new RestTemplate();
//    @GetMapping(value = "/image", produces = MediaType.IMAGE_PNG_VALUE)
//    public void getImage() {
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("uB196tY4UZrLoHfamvcC3M5OMtidfhYO", apiKey);
//        ResponseEntity<String> response = restTemplate.exchange(
//                "https://developers.giphy.com/",
//                HttpMethod.GET,
//                new HttpEntity<>(headers),
//                String.class
//        );


//        BufferedImage bi = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
//        Graphics2D g2d = bi.createGraphics();
//
//        g2d.setBackground(Color.RED);
//        g2d.clearRect(0, 0, 200, 200);
//
//        g2d.setColor(Color.BLACK);
//        g2d.drawString("Hello, World!", 75, 100);
//
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        ImageIO.write(bi, "png", baos);
//        byte[] bytes = baos.toByteArray();
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.setCacheControl(CacheControl.noCache().getHeaderValue());
//
//      return ResponseHandler.generateResponse("IMage", HttpStatus.OK, headers);

    }


