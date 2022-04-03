package ma.topbackend.topbrico.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ville")
public class Ville {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomVille;
    private String cp;

    @OneToMany(mappedBy = "ville")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Artisan> artisan;

    @OneToMany(mappedBy = "ville")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Client> client;

    public Ville(String nomVille,String cp) {
        this.nomVille = nomVille;
        this.cp = cp;
    }
    public Ville(String nomVille) {
        this.nomVille = nomVille;


    }


}
