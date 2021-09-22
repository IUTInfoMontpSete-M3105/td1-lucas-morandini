
import java.util.*;

/**
 * 
 */
public abstract class Utilisateur {

    /**
     * Default constructor
     */
    public Utilisateur(String nom, String prenom, String adresse, String mail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
    }

    /**
     * Attribute
     */
    private String nom;

    /**
     * Attribute
     */
    private String prenom;

    /**
     * Attribute
     */
    private String adresse;

    /**
     * Attribute
     */
    private String mail;

    /**
     * Function
     */
    public void gererDonnees() {
        // TODO implement here
    }

    /**
     * Function
     */
    public void afficherCours() {
        // TODO implement here
    }

    /**
     * Function
     */
    public void afficherDevoirs() {
        // TODO implement here
    }

    /**
     * Function
     */
    public void afficherRendus() {
        // TODO implement here
    }

    /**
     * Function
     */
    public void afficherPoints() {
        // TODO implement here
    }

}