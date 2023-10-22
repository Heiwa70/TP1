import java.util.ArrayList;
import java.util.List;

public class GroupeEtudiantExo3 {

    List<EtudiantExo3> etudiants;
    String nameOfGroup;

    public GroupeEtudiantExo3(List<EtudiantExo3> etudiants, String nameOfGroup) {
        this.etudiants = etudiants;
        this.nameOfGroup = nameOfGroup;
    }

    public List<EtudiantExo3> getEtudiants() {
        return this.etudiants;
    }

    public void setEtudiants(List<EtudiantExo3> etudiants) {
        this.etudiants = etudiants;
    }

    public void afficher() {
        for (int i = 0; i < this.etudiants.size(); i++) {
            System.out.println(etudiants.get(i));
        }
    }

    public EtudiantExo3 getEtudiantByName(String nom) {
        for (int i = 0; i < this.etudiants.size(); i++) {
            if (this.etudiants.get(i).getNom().equals(nom)) {
                return this.etudiants.get(i);
            }
        }
        return null;
    }

    public List<EtudiantExo3> getEtudiantsByAge(int age) {
        List<EtudiantExo3> etudiants = new ArrayList<>();
        for (int i = 0; i < this.etudiants.size(); i++) {
            if (this.etudiants.get(i).getAge() == age) {
                etudiants.add(this.etudiants.get(i));
            }
        }
        return etudiants;
    }

    public float getAvaregeAge() {
        float somme = 0;
        for (int i = 0; i < this.etudiants.size(); i++) {
            somme += this.etudiants.get(i).getAge();
        }
        return somme / this.etudiants.size();
    }

}
