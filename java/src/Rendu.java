
import java.io.File;
import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class Rendu {


    private String avis;
    /**
     * Default constructor
     */
    public Rendu(File doc, LocalDate date, int points) {
        this.doc = doc;
        this.date = date;
        this.points = points;
        this.avis = "";
    }

    /**
     * Attribute
     */
    private File doc;

    /**
     * Attribute
     */
    private LocalDate date;

    /**
     * Attribute
     */
    private int points;

    public File getDoc() {
        return doc;
    }

    public void setDoc(File doc) {
        this.doc = doc;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getAvis() {
        return avis;
    }

    public void setAvis(String avis) {
        this.avis = avis;
    }
}