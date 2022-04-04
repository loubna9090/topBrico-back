package ma.topbackend.topbrico.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Data
@NoArgsConstructor

@Entity
@Table(name = "artisan")
public class Artisan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomArtisan;
    private String prenomArtisan;
    private String rsArtisan;
    private String emailArtisan;
    private String adressArtisan;
    private String adressArtisan2;
    private String mdpArtisan;
    private String telArtisan;
    @ManyToOne
    private Ville ville ;

    @OneToMany(mappedBy = "artisan")
    private Collection<Commentaire> commentaire;

    @ManyToMany(mappedBy = "artisans" )
    private Collection<ServiceArt>  serviceArt=new ArrayList<>();

    @OneToMany(mappedBy = "artisan")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Collection<Realisation>  realisation=new ArrayList<>();;

    public Artisan(String nomArtisan, String prenomArtisan, String rsArtisan, String emailArtisan, String adressArtisan, String adressArtisan2, String mdpArtisan, String telArtisan) {
        this.nomArtisan = nomArtisan;
        this.prenomArtisan = prenomArtisan;
        this.rsArtisan = rsArtisan;
        this.emailArtisan = emailArtisan;
        this.adressArtisan = adressArtisan;
        this.adressArtisan2 = adressArtisan2;
        this.mdpArtisan = mdpArtisan;
        this.telArtisan = telArtisan;
    }

    public Artisan(String nomArtisan, String prenomArtisan, String rsArtisan, String emailArtisan, String adressArtisan, String adressArtisan2, String mdpArtisan, String telArtisan, Ville ville) {
        this.nomArtisan = nomArtisan;
        this.prenomArtisan = prenomArtisan;
        this.rsArtisan = rsArtisan;
        this.emailArtisan = emailArtisan;
        this.adressArtisan = adressArtisan;
        this.adressArtisan2 = adressArtisan2;
        this.mdpArtisan = mdpArtisan;
        this.telArtisan = telArtisan;
        this.ville = ville;

    }
    public Artisan(String nomArtisan, String prenomArtisan, String rsArtisan, String emailArtisan, String adressArtisan, String adressArtisan2, String mdpArtisan, String telArtisan, Ville ville, Collection<ServiceArt> serviceArts, Collection<Realisation> realisations, Collection<Commentaire> commentaires) {
        this.nomArtisan = nomArtisan;
        this.prenomArtisan = prenomArtisan;
        this.rsArtisan = rsArtisan;
        this.emailArtisan = emailArtisan;
        this.adressArtisan = adressArtisan;
        this.adressArtisan2 = adressArtisan2;
        this.mdpArtisan = mdpArtisan;
        this.telArtisan = telArtisan;
        this.ville = ville;
        this.serviceArt = serviceArts;
        this.realisation = realisations;
        this.commentaire=commentaires;
    }
    public Artisan(String nomArtisan, String prenomArtisan, String rsArtisan, String emailArtisan, String adressArtisan, String adressArtisan2, String mdpArtisan, String telArtisan, Ville ville, Collection<ServiceArt> serviceArts, Collection<Realisation> realisations) {
        this.nomArtisan = nomArtisan;
        this.prenomArtisan = prenomArtisan;
        this.rsArtisan = rsArtisan;
        this.emailArtisan = emailArtisan;
        this.adressArtisan = adressArtisan;
        this.adressArtisan2 = adressArtisan2;
        this.mdpArtisan = mdpArtisan;
        this.telArtisan = telArtisan;
        this.ville = ville;
        this.serviceArt = serviceArts;
        this.realisation = realisations;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomArtisan() {
        return nomArtisan;
    }

    public void setNomArtisan(String nomArtisan) {
        this.nomArtisan = nomArtisan;
    }

    public String getPrenomArtisan() {
        return prenomArtisan;
    }

    public void setPrenomArtisan(String prenomArtisan) {
        this.prenomArtisan = prenomArtisan;
    }

    public String getRsArtisan() {
        return rsArtisan;
    }

    public void setRsArtisan(String rsArtisan) {
        this.rsArtisan = rsArtisan;
    }

    public String getEmailArtisan() {
        return emailArtisan;
    }

    public void setEmailArtisan(String emailArtisan) {
        this.emailArtisan = emailArtisan;
    }

    public String getAdressArtisan() {
        return adressArtisan;
    }

    public void setAdressArtisan(String adressArtisan) {
        this.adressArtisan = adressArtisan;
    }

    public String getAdressArtisan2() {
        return adressArtisan2;
    }

    public void setAdressArtisan2(String adressArtisan2) {
        this.adressArtisan2 = adressArtisan2;
    }

    public String getMdpArtisan() {
        return mdpArtisan;
    }

    public void setMdpArtisan(String mdpArtisan) {
        this.mdpArtisan = mdpArtisan;
    }

    public String getTelArtisan() {
        return telArtisan;
    }

    public void setTelArtisan(String telArtisan) {
        this.telArtisan = telArtisan;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public Collection<Commentaire> getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(Collection<Commentaire> commentaire) {
        this.commentaire = commentaire;
    }

    public Collection<ServiceArt> getServiceArt() {
        return serviceArt;
    }

    public void setServiceArt(Collection<ServiceArt> serviceArt) {
        this.serviceArt = serviceArt;
    }

    public Collection<Realisation> getRealisation() {
        return realisation;
    }

    public void setRealisation(Collection<Realisation> realisation) {
        this.realisation = realisation;
    }
}
