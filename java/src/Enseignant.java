
import java.util.*;

/**
 * 
 */
public class Enseignant extends Utilisateur {

    /**
     * Default constructor
     */
    public Enseignant() {
        super(nom, prenom, adresse, mail);
        this.numem = numem;
        this.harpege = harpege;
        this.CDC = CDC;
    }

    /**
     * Attribute
     */
    private String numem;

    /**
     * Attribute
     */
    private String harpege;

    /**
     * Attribute
     */
    public Boolean CDC;


    /**
     * Function
     */
    public void creerDevoir() {
        // TODO implement here
    }

    /**
     * Function
     */
    public void corrigerDevoir() {
        // TODO implement here
    }

    /**
     * Function
     */
    public void attribuerPoints() {
        // TODO implement here
    }

    /**
     * Function
     */
    public void attribuerAvis() {
        // TODO implement here
    }

}