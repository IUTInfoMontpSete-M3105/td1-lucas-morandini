
import java.util.*;

/**
 * 
 */
public abstract class Utilisateur{

    private String nom;
    private String prenom;
    private String mail;
    private String adresse;

    /**
     * Default constructor
     */
    public Utilisateur(String nom, String prenom, String mail, String adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.adresse = adresse;
    }
}