package ma.topbackend.topbrico.services;

import ma.topbackend.topbrico.dao.ArtisanRepository;
import ma.topbackend.topbrico.dao.RealisationRepository;
import ma.topbackend.topbrico.dao.ServiceArtRepository;
import ma.topbackend.topbrico.dao.VilleRepository;
import ma.topbackend.topbrico.entities.Artisan;
import ma.topbackend.topbrico.entities.Ville;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class artisanService {
    @Autowired
    private ArtisanRepository artisanRepository;
    @Autowired
    private ServiceArtRepository serviceArtRepository;
    @Autowired
    private RealisationRepository realisationRepository;
    @Autowired
    private VilleRepository villeRepository;

    public Artisan saveArtisan( Artisan artisan){
        Ville ville= villeRepository.findByNomVille(artisan.getVille());
        Artisan newArtisan= new Artisan();
        newArtisan.setNomArtisan(artisan.getNomArtisan());
        newArtisan.setPrenomArtisan(artisan.getPrenomArtisan());
        newArtisan.setRsArtisan(artisan.getRsArtisan());
        newArtisan.setEmailArtisan(artisan.getEmailArtisan());
        newArtisan.setMdpArtisan(artisan.getMdpArtisan());
        newArtisan.setTelArtisan(artisan.getTelArtisan());
        newArtisan.setAdressArtisan(artisan.getAdressArtisan());
        newArtisan.setAdressArtisan2(artisan.getAdressArtisan2());

        newArtisan.setVille(ville);
    }

}
