import java.util.Scanner;

public class Exo2 {
    public void exo2() {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir les deux chaînes
        System.out.println("Veuillez saisir la première chaîne :");
        String chaine1 = scanner.nextLine();

        System.out.println("Veuillez saisir la deuxième chaîne :");
        String chaine2 = scanner.nextLine();

        // Compter le nombre d'occurrences de la première chaîne dans la deuxième chaîne
        int nbOccurrences = 0;
        int index = 0;
        do {
            index = chaine2.indexOf(chaine1, index);
            if (index != -1) {
                nbOccurrences++;
                index += chaine1.length();
            }
        } while (index != -1);
        System.out.println(
                "Le nombre d'occurrences de la première chaîne dans la deuxième chaîne est : " + nbOccurrences);

        // Tester si la deuxième chaîne contient les 6 voyelles
        boolean contientVoyelles = chaine2.contains("a") && chaine2.contains("e") && chaine2.contains("i")
                && chaine2.contains("o") && chaine2.contains("u") && chaine2.contains("y");
        if (contientVoyelles) {
            System.out.println("La deuxième chaîne contient les 6 voyelles.");
        } else {
            System.out.println("La deuxième chaîne ne contient pas les 6 voyelles.");
        }
    }
}
