
import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Devoir {



    /**
     * Default constructor
     */
    public Devoir(String nom, String description, LocalDate deadline, int points) {
        this.nom = nom;
        this.description = description;
        this.deadline = deadline;
        this.points = points;
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
}