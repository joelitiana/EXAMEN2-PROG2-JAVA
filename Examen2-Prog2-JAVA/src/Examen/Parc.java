package Examen;

import java.util.List;

public class Parc extends Lieu {
    private List<Hotel> hotel;

    public Parc(String nom, double latitude, double longitude, String description, List<Hotel> hotels) {
        super(nom, description, longitude, latitude);
        this.hotel = hotel;
    }

    public List<Hotel> getHotels() {
        return hotel;
    }

    public void addAvis(Avis avis) {
    }
}

