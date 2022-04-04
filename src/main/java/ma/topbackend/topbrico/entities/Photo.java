package ma.topbackend.topbrico.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor

@Entity
@Table(name = "photo")
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String urlPhoto;
    @ManyToOne
    private Realisation realisation;

    public Photo(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public Photo(String urlPhoto, Realisation realisation) {
        this.urlPhoto = urlPhoto;
        this.realisation = realisation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public Realisation getRealisation() {
        return realisation;
    }

    public void setRealisation(Realisation realisation) {
        this.realisation = realisation;
    }
}
