
import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Devoir {

    private boolean corrige;

    /**
     * Default constructor
     */
    public Devoir(String nom, String description, LocalDate deadline, int points) {
        this.nom = nom;
        this.description = description;
        this.deadline = deadline;
        this.points = points;
        this.corrige = false;
    }

    /**
     * Attribute
     */
    private String nom;

    /**
     * Attribute
     */
    private String description;

    /**
     * Attribute
     */
    private LocalDate deadline;

    /**
     * Attribute
     */
    private int points;


    public void setPoints(int i) {
        points = i;
    }

    public void setCorrige(Boolean b){
        this.corrige = b;
    }

    @Override
    public String toString() {
        return "Devoir{" +
                "corrige=" + corrige +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", points=" + points +
                '}';
    }
}