package Examen;

public abstract class Lieu {
    protected String nom;
    protected String description;
    protected double longitude;
    protected double latitude;

    public Lieu(String nom, String description, double latitude, double longitude) {
        this.nom = nom;
        this.description = description;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
}


