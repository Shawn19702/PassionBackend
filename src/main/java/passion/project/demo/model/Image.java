package passion.project.demo.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Set;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String  image;

    private String description;

    private Boolean ultraresoulution;

    private String [] color;

    public Image() {
    }

    public Image(String image, String description, Boolean ultraresoulution, String[] color) {
        this.image = image;
        this.description = description;
        this.ultraresoulution = ultraresoulution;
        this.color = color;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getUltraresoulution() {
        return ultraresoulution;
    }

    public void setUltraresoulution(Boolean ultraresoulution) {
        this.ultraresoulution = ultraresoulution;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Image{" +
                "image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", ultraresoulution=" + ultraresoulution +
                ", color=" + Arrays.toString(color) +
                '}';
    }
}
