package Examen;
import java.util.Date;

public class Avis {
    private String utilisateur;
    private String email;
    private String commentaire;
    private Date date;
    private int note;

    public Avis(String utilisateur, String email, String commentaire, Date date, int note) {
        this.utilisateur = utilisateur;
        this.email = email;
        this.commentaire = commentaire;
        this.date = date;
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public int getNote() {
        return note;
    }
}

