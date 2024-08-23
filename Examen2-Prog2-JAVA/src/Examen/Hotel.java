package Examen;

import java.util.ArrayList;
import java.util.List;

public class Hotel extends Lieu {
    private String contact;
    private List<Chambre> chambres;
    private List<Avis> avis;

    public Hotel(String nom, double latitude, double longitude, String description, String contact, List<Chambre> chambres) {
        super(nom, description, longitude, latitude);
        this.contact = contact;
        this.chambres = chambres;
        this.avis = new ArrayList<>();
    }

    public String getContact() {
        return contact;
    }

    public List<Chambre> getChambres() {
        return chambres;
    }

    public void addAvis(Avis avis) {
        this.avis.add(avis);
    }

    public List<Avis> getAvis() {
        return avis;
    }
}
