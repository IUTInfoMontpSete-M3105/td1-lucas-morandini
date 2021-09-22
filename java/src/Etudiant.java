
import java.util.*;

/**
 * 
 */
public class Etudiant extends Utilisateur {

    /**
     * Default constructor
     */
    public Etudiant(String nom, String prenom, String adresse, String mail, String numEtu) {
        super(nom, prenom, adresse, mail);
        this.numEtu = numEtu;
    }

    /**
     * Attribute
     */
    private String numEtu;




    /**
     * Function
     */
    public void telechargerDevoir(Devoir d) {
        d.toString();
    }

}