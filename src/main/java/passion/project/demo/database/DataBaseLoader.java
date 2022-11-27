package passion.project.demo.database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import passion.project.demo.model.Image;
import passion.project.demo.repository.ImageRepository;

import javax.swing.text.View;

@Configuration
public class DataBaseLoader {



        @Bean
        CommandLineRunner init(ImageRepository repository) {   // description ultra color

            return args -> {
                repository.deleteAll();
                repository.alterImageAutoincrement();
              repository.save(new Image("https://images.unsplash.com/photo-1559583985-c80d8ad9b29f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxjb2xsZWN0aW9uLXBhZ2V8MXwxMDY1OTc2fHxlbnwwfHx8fA%3D%3D&w=1000&q=80", "A palm tree in the sunset", false, new String[]{"Pink", "Tan"}));
              repository.save(new Image("https://mobimg.b-cdn.net/v3/fetch/62/62e3ce60fc426fe6f475764cd99779b9.jpeg", "A stary night in the woods", false, new String[]{"Blue", "Black"}));
              repository.save(new Image("https://www.androidguys.com/wp-content/uploads/2015/12/Wave-Wallpapers-1.jpg", "Majestic wave at sunrise", true, new String[]{"Blue", "Orange"}));
               repository.save(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQE_iPkP5PoQ813rowOH-lgjgIgN_MkJcU9tXYz0as2vrCRmp7DcYG0ylvWdf56tasLwjk&usqp=CAU", "Roaring Lion", false, new String[]{"Red", "Black"}));
                repository.save(new Image("https://4kwallpapers.com/images/walls/thumbs_2t/1003.jpg", "Mcclaren traveling through Neon-art city", true, new String[]{"neon", "blue", "black", "purple"}));
                repository.save(new Image("https://api.time.com/wp-content/uploads/2014/05/wallpaperfx.jpg", "Explosion of vibrant contrasting colors", true, new String[]{"red", "blue", "gray", "black", "white", "orange"}));
                 repository.save(new Image("https://images.unsplash.com/photo-1608501078713-8e445a709b39?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8d2FsbHBhcGVyJTIwNGt8ZW58MHx8MHx8&w=1000&q=80", "New York City in Sunset", false, new String[]{"Pink", "Purple", "Orange"}));
                repository.save(new Image("https://images.unsplash.com/photo-1669158424143-3be4e002b36d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=775&q=80", "Birds Eye View of Waterfall", false, new String[]{"Blue", "Green"}));
                repository.save(new Image("https://images.unsplash.com/photo-1669172460021-cf270d946e56?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80", "Hot Air Balloons Raising Across City Terrain ", true, new String[]{"Brown", "Orange"}));
                repository.save(new Image("https://4kwallpapers.com/images/walls/thumbs_2t/8769.jpg", "Space View of Earth", true, new String[]{"Black", "Blue", "White"}));
                repository.save(new Image("https://wallpaperaccess.com/full/269413.jpg", "Man Looking at New York City View at Night", false, new String[]{"Blue", "Black"}));
                repository.save(new Image("https://images.unsplash.com/photo-1554502785-b8b0724b4cbd?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8&w=1000&q=80", "Bridge in Sunset", false, new String[]{"Orange", "Brown"}));
                repository.save(new Image("https://wallpaperaccess.com/full/2159510.jpg", "Side-View of Volcanic Eruption in Sunset", true, new String[]{"Orange", "Purple", "Blue"}));
                repository.save(new Image("https://c4.wallpaperflare.com/wallpaper/108/140/869/digital-digital-art-artwork-fantasy-art-drawing-hd-wallpaper-preview.jpg", "Girl starring into a galaxy", false, new String[]{"Pink", "Purple"}));
                repository.save(new Image("https://4kwallpapers.com/images/walls/thumbs_2t/5630.jpg", "Blue Design", true, new String[]{"Blue"}));
                repository.save(new Image("https://images.wallpapersden.com/image/download/4k-talking-to-the-moon_a2pubmuUmZqaraWkpJRobWllrWdma2U.jpg", "Boy Looking into the Starry Night With Moon Background", false, new String[]{"Black", "Gray"}));
                repository.save(new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2AuXNmmZ9jgq1MZ5r033BHNxvOYfMEYjLrw&usqp=CAU", "New York City in Sunset", false, new String[]{"Pink", "Purple", "Orange"}));
                repository.save(new Image("https://i.pinimg.com/originals/58/2d/96/582d96a1df2d94bb439af1594639ccfe.jpg", "Landscape of Woods with Sunset", false, new String[]{"Green", "Orange"}));
                repository.save(new Image("https://wallpaperwoo.com/uploads/pictures/wallpapers/original/110671_53e75f9dfa3d61dff2ad36e4832d3406.jpg", "Ground View of Terrain With Sunset", true, new String[]{ "Purple", "Orange"}));
                repository.save(new Image("https://wallpapers.com/images/hd/retrowave-car-4k-08j907mahnj4b6jt.jpg", "Retro Wave Car Driving Through Vice City Landscape", true, new String[]{"Pink", "Purple", "Neon", "Blue"}));
                repository.save(new Image("https://wallpaperaccess.com/full/799794.jpg", "Cloudy City", true, new String[]{"Gray", "Blue"}));
                repository.save(new Image("https://photos.smugmug.com/Wallpapers/i-9f7H7SN/0/01c72b86/O/HDRshooter-4K-wallpaper-053-3840x2160.jpg", "Lighthouse on Beach During Sunset", false, new String[]{"Pink", "Purple", "Orange"}));
                repository.save(new Image("https://www.guidingtech.com/wp-content/uploads/Stunning-Space-Wallpapers-11_4d470f76dc99e18ad75087b1b8410ea9.png", "New York City During Sunset", false, new String[]{"Pink", "Purple", "Orange"}));
                repository.save(new Image("https://wallpaperaccess.com/full/17520.jpg", "Dark and Cloudy Sky", true, new String[]{"Blue", "Gray"}));
                repository.save(new Image("https://wallpaperaccess.com/full/435988.jpg", "Splitting Image of Night and Day", true, new String[]{"Blue", "Gray", "Orange"}));
                repository.save(new Image("https://photos.smugmug.com/Wallpapers/i-Lw6hnGq/0/f91236c1/O/HDRshooter-4K-wallpaper-066-3840x2160.jpg", "City on Italian Coast", true, new String[]{"Blue", "Yellow"}));
                repository.save(new Image("https://wallpapers.com/images/featured/9w27dqmc4nrs3xwd.jpg", "Astronaut in Space", true, new String[]{"Black", "White", "Blue"}));
                repository.save(new Image("https://free4kwallpapers.com/uploads/originals/2020/11/14/artistic-landscape-wallpaper.jpg", "Tree in Cloudy Terrain", true, new String[]{"Orange", "Blue", "White"}));
                repository.save(new Image("https://wallpapers.com/images/hd/4k-minimalist-mountains-9oitratl6gd996za.jpg", "Man Fishing Next to Island", false, new String[]{"Blue", "Red", "Yellow"}));
                repository.save(new Image("https://www.pixelstalk.net/wp-content/uploads/images5/4K-PC-Desktop-Wallpapers-scaled.jpg", "City at Night", true, new String[]{"Yellow", "Blue"}));
                repository.save(new Image("https://c4.wallpaperflare.com/wallpaper/952/536/1006/winter-4k-pc-desktop-wallpaper-thumb.jpg", "Snowy Night in the Woods ", true, new String[]{"Black", "White", "Gray", "Yellow"}));
                repository.save(new Image("https://images.unsplash.com/photo-1491466424936-e304919aada7?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1169&q=80", "Northern Lights Canyon at Night ", false, new String[]{"Black", "Blue"}));
                repository.save(new Image("https://images.unsplash.com/photo-1501949997128-2fdb9f6428f1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80", "Breaking Sea Wave ", false, new String[]{"White", "Blue"}));
                repository.save(new Image("https://images.unsplash.com/photo-1500673922987-e212871fec22?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80", "Golden forest pathway", false, new String[]{"Gold", "Brown"}));
                repository.save(new Image("https://images.unsplash.com/photo-1473800447596-01729482b8eb?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80", "Snowy Mountains With Sunrise", false, new String[]{"Blue", "White", "Orange"}));
                repository.save(new Image("https://images.unsplash.com/photo-1499678329028-101435549a4e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80", "Vernazza sunset", false, new String[]{"Orange", "Blue", "Gray"}));
                repository.save(new Image("https://images.unsplash.com/photo-1476610182048-b716b8518aae?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1259&q=80", "Idyllic landscape with a waterfall in Iceland", false, new String[]{"Green", "Blue"}));
                repository.save(new Image("https://images.unsplash.com/photo-1501854140801-50d01698950b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1275&q=80", "Grasslands in China", false, new String[]{"Green"}));
                repository.save(new Image("https://images.unsplash.com/photo-1518098268026-4e89f1a2cd8e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80", "Amazing Sunset in Tuscany", false, new String[]{"Green", "Orange", "Blue"}));
                repository.save(new Image("https://images.unsplash.com/photo-1497436072909-60f360e1d4b1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1332&q=80", "Blue lake and green shore", false, new String[]{"Green", "Blue"}));
                repository.save(new Image("https://images.unsplash.com/photo-1560131324-735a23ea0304?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80", "Texture Photo of Sand dunes", false, new String[]{"Tan"}));
                repository.save(new Image("https://images.unsplash.com/photo-1559762412-627400abeec1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80", "Sunny Day Under Palm Trees", false, new String[]{"Blue", "Green"}));
                repository.save(new Image("https://images.unsplash.com/photo-1474524955719-b9f87c50ce47?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1172&q=80", "San Diego Beach Sunrise", false, new String[]{"Orange", "Blue"}));
                repository.save(new Image("https://images.unsplash.com/photo-1452274381522-521513015433?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1174&q=80", "Bear Family in YellowStone", false, new String[]{"Yellow", "Blue"}));
                repository.save(new Image("https://images.unsplash.com/photo-1510024288543-f0f81b48f82d?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80", "Sierra Nevada Snow Capped Mountains", false, new String[]{"Brown", "Blue", "Green"}));
                repository.save(new Image("https://images.unsplash.com/photo-1503788760144-795d5cdf0f56?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=870&q=80", "Kirkjufell Mountain in Iceland", false, new String[]{"Brown", "Blue", "Green"}));
                repository.save(new Image("https://images.unsplash.com/photo-1487028463993-b7f901a8c2eb?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80", "Mount Tamalpais Sunset", false, new String[]{"Green", "Orange", "White"}));
                repository.save(new Image("https://images.unsplash.com/photo-1481647619655-8fd4de94e775?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80", "Coastline of Kauai", false, new String[]{"Green", "Blue", "White"}));
                repository.save(new Image("https://images.unsplash.com/photo-1479819893311-9c362f79976e?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=774&q=80", "Stormy Mountain Sky", false, new String[]{"Gray", "Blue", "White"}));
                repository.save(new Image("https://images.unsplash.com/photo-1477573893384-10fa704dfbd9?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80", "Eroded Icelandic mountain", false, new String[]{"Brown", "Green"}));




            };
        }
  }

