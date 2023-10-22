public class EtudiantExo3 {
    private String nom;
    private String prenom;
    private int age;

    EtudiantExo3(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;

    }

    public String toString() {
        return "Nom: " + this.nom + " Prenom: " + this.prenom + " Age: " + this.age;
    }

    public String getNom() {
        return this.nom;
    }

    public int getAge() {
        return this.age;
    }

}
