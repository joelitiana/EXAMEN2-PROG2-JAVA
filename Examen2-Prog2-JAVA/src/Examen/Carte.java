package Examen;
import java.util.List;
import java.util.ArrayList;

public class Carte {
    private List<Parc> parcs;

    public Carte(List<Parc> parcs) {
        this.parcs = parcs;
    }

    public void addReview(Lieu lieu, Avis avis) {
        if (lieu instanceof Hotel) {
            Hotel hotel = (Hotel) lieu;
            hotel.addAvis(avis);
        } else if (lieu instanceof Parc) {
            Parc parc = (Parc) lieu;
            parc.addAvis(avis);
        }
    }


    public List<Avis> getAllReviews() {
        List<Avis> allReviews = new ArrayList<>();
        for (Parc parc : parcs) {
            for (Hotel hotel : parc.getHotels()) {
                List<Avis> avisHotel = hotel.getAvis();
                allReviews.addAll(avisHotel);
            }
        }
        return allReviews;
    }

    public Hotel findBestHotel() {
        Hotel bestHotel = null;
        int maxParcs = 0;

        for (Parc parc : parcs) {
            List<Hotel> hotels = parc.getHotels();
            for (Hotel hotel : hotels) {
                int parcsCount = 0;

                for (Parc p : parcs) {
                    if (p.getHotels().contains(hotel)) {
                        parcsCount++;
                    }
                }

                if (parcsCount > maxParcs) {
                    maxParcs = parcsCount;
                    bestHotel = hotel;
                }
            }
        }

        return bestHotel;
    }

    public double findCheapestHotelPrice(List<Parc> parcsToVisit) {
        double totalMinPrix = 0.0;

        for (Parc parc : parcsToVisit) {
            double minPrix = Double.MAX_VALUE;
            List<Hotel> hotels = parc.getHotels();
            for (Hotel hotel : hotels) {
                List<Chambre> chambres = hotel.getChambres();
                for (Chambre chambre : chambres) {
                    double tarif = chambre.getTarifNuitee();
                    if (tarif < minPrix) {
                        minPrix = tarif;
                    }
                }
            }
            totalMinPrix += minPrix;
        }

        return totalMinPrix;
    }

    public List<Lieu> getAllReviewedItems() {
        List<Lieu> reviewedItems = new ArrayList<>();

        for (Parc parc : parcs) {
            List<Hotel> hotels = parc.getHotels();
            for (Hotel hotel : hotels) {
                if (!hotel.getAvis().isEmpty()) {
                    reviewedItems.add(hotel);
                }
                List<Chambre> chambres = hotel.getChambres();
            }
        }
        return reviewedItems;
    }
}
