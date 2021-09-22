import java.time.LocalDate;

/**
 * 
 */
public class Enseignant extends Utilisateur {

    /**
     * Default constructor
     * @param nom
     * @param prenom
     * @param adresse
     * @param mail
     */
    public Enseignant(String nom, String prenom, String adresse, String mail) {
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
     * @return
     */
    public Devoir creerDevoir(String nom, String description, LocalDate deadline, int points) {
        Devoir newDevoir = new Devoir(nom,description,deadline,points);
        return newDevoir;
    }

    /**
     * Function
     */
    public void corrigerDevoir(Devoir d) {
        d.setCorrige(true);
    }

    /**
     * Function
     */
    public void attribuerPoints(Rendu r,int i) {
        r.setPoints(i);
    }

    /**
     * Function
     */
    public void attribuerAvis(Rendu r,String avis) {
        r.setAvis(avis);
    }

}