
import java.util.*;

/**
 *
 */
public class Cours {

    /**
     * Default constructor
     */
    public Cours(String nom, int semestre) {
        this.nom = nom;
        this.semestre = semestre;
    }


    /**
     *
     */
    private String nom;

    /**
     *
     */
    private int semestre;

    public String getNom() {
        return nom;
    }

    public int getSemestre() {
        return semestre;
    }

    public void delete() {
        nom = null;
        this.semestre=0;
    }
}