/**
 *
 */
public class Admin extends Utilisateur {

    /**
     * Default constructor
     */
    public Admin(String nom, String prenom, String adresse, String mail) {
        super(nom, prenom, adresse, mail);
    }

    /**
     * @return
     */
    public Cours creerCours(String nom, int semestre) {
        Cours c = new Cours(nom, semestre);
        return c;
    }

    /**
     *
     */
    public void supprimerCours(Cours c) {
        c.delete();
    }

    /**
     *
     */
    public void affecterChargeDeCours(CDC c,Cours co) {
        // TODO implement here
    }

    /**
     *
     */
    public void desaffecterChargeDeCours(CDC c,Cours co) {
        // TODO implement here
    }

    /**
     * @param e1
     * @param c
     */
    public void affecterEnseignant(Enseignant e1, Cours c) {
        // TODO implement here
    }

}