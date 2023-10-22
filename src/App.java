import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static int code = 3;

    public static void main(String[] args) throws Exception {
        if (code == 0) {
            System.out.println("Bonjour ce programme va te permettre de convertire des Celsius en Fahrenheit \n");
            System.out.println(
                    "Vous avez 2 choix \n 11: Convertir des Celsius en Fahrenheit \n 2: Convertir des Fahrenheit en Celsius \n");

            Exo1 exo1 = new Exo1();

            int choix = exo1.SaisieChoix();

            if (choix == 1) {
                System.out.println("Veuillez entrer une temperature en Celsius");
                Double temp = exo1.SaisieTemperature();
                System.out.println("La temperature en Fahrenheit est de " + exo1.CelsiusVersFahrenheit(temp));

            } else if (choix == 2) {
                System.out.println("Veuillez entrer une temperature en Fahrenheit");
                Double temp = exo1.SaisieTemperature();
                System.out.println("La temperature en Celsius est de " + exo1.FahrenheitVersCelsius(temp));

            } else {
                System.out.println("Veuillez entrer un choix valide");
            }
        } else if (code == 1) {
            Exo2 exo2 = new Exo2();
            exo2.exo2();
        }

        else if (code == 2) {

            List<EtudiantExo3> etudiants = new ArrayList<>();
            etudiants.add(new EtudiantExo3("Dup", "Cyril", 12));
            etudiants.add(new EtudiantExo3("Dupont", "Paul", 20));
            etudiants.add(new EtudiantExo3("Seiler", "Toto", 40));
            etudiants.add(new EtudiantExo3("Thomas", "Jack", 80));
            etudiants.add(new EtudiantExo3("Vincent", "Jeanne", 29));

            GroupeEtudiantExo3 groupeUtbm = new GroupeEtudiantExo3(etudiants, "UTBM");

            groupeUtbm.afficher();

            System.out.println("Veuillez entrer un nom d'etudiant");
            Scanner sc = new Scanner(System.in);
            String nom = sc.nextLine();

            EtudiantExo3 etudiant = groupeUtbm.getEtudiantByName(nom);

            if (etudiant != null) {
                System.out.println("L'etudiant " + etudiant + " a ete trouve");
            } else {
                System.out.println("L'etudiant " + nom + " n'a pas ete trouve");
            }

            System.out.println("La moyenne d'age pour le groupe :" + groupeUtbm.nameOfGroup + " est de "
                    + groupeUtbm.getAvaregeAge() + " ans");

            System.out.println("Veuillez entrer un age pour afficher les etudiants ayant cet age");
            int age = sc.nextInt();

            if (groupeUtbm.getEtudiantsByAge(age).size() > 0) {
                System.out.println("Les etudiants ayant " + age + " ans sont :");
                for (int i = 0; i < groupeUtbm.getEtudiantsByAge(age).size(); i++) {
                    System.out.println(groupeUtbm.getEtudiantsByAge(age).get(i));
                }
            } else {
                System.out.println("Aucun etudiant n'a " + age + " ans");
            }

        }

        else if (code == 3) {
            Matrice matrice1 = new Matrice(2, 2);
            matrice1.setElement(0, 0, 1);
            matrice1.setElement(0, 1, 2);
            matrice1.setElement(1, 0, 3);
            matrice1.setElement(1, 1, 4);

            Matrice matrice2 = new Matrice(2, 2);
            matrice2.setElement(0, 0, 5);
            matrice2.setElement(0, 1, 6);
            matrice2.setElement(1, 0, 7);
            matrice2.setElement(1, 1, 8);

            Matrice matrice3 = matrice1.addition(matrice2);
            System.out.println("Addition de matrice1 et matrice2 :");
            matrice3.afficher();

            Matrice matrice4 = matrice1.multiplication(matrice2);
            System.out.println("Multiplication de matrice1 et matrice2 :");
            matrice4.afficher();

            Matrice matrice5 = new Matrice(2, 2);
            matrice5.setElement(0, 0, 1);
            matrice5.setElement(0, 1, 2);
            matrice5.setElement(1, 0, 3);
            matrice5.setElement(1, 1, 4);

            Matrice matrice6 = new Matrice(2, 2);
            matrice6.setElement(0, 0, 1);
            matrice6.setElement(0, 1, 2);
            matrice6.setElement(1, 0, 3);
            matrice6.setElement(1, 1, 4);

            if (matrice5.equal(matrice6)) {
                System.out.println("Les matrices sont egales");
            } else {
                System.out.println("Les matrices ne sont pas egales");
            }

        }

    }
}
