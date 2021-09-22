import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Devoir devoir1 = new Devoir("","", LocalDate.EPOCH,0);
        Devoir devoir2 = new Devoir("","",LocalDate.EPOCH,0);
        Admin admin1 = new Admin("","","","");
        Enseignant e1 = new Enseignant("","","","");
        Enseignant e2 = new Enseignant("","","","");
        Etudiant etu1 = new Etudiant("","","","","ETU1");
        Etudiant etu2 = new Etudiant("","","","","ETU2");

        Devoir nouveau = e1.creerDevoir("","",LocalDate.EPOCH,0);

    }
}
