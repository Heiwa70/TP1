public class Matrice {
    private int nbLignes;
    private int nbColonnes;
    private double[][] elements;

    public Matrice(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.elements = new double[nbLignes][nbColonnes];
    }

    public void setElement(int i, int j, double valeur) {
        this.elements[i][j] = valeur;
    }

    public double getElement(int i, int j) {
        return this.elements[i][j];
    }

    public Matrice addition(Matrice autre) {
        if (this.nbLignes != autre.nbLignes || this.nbColonnes != autre.nbColonnes) {
            throw new IllegalArgumentException("Les matrices doivent avoir la même taille.");
        }

        Matrice resultat = new Matrice(this.nbLignes, this.nbColonnes);
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                resultat.setElement(i, j, this.getElement(i, j) + autre.getElement(i, j));
            }
        }
        return resultat;
    }

    public Matrice multiplication(Matrice autre) {
        if (this.nbColonnes != autre.nbLignes) {
            throw new IllegalArgumentException(
                    "Le nombre de colonnes de la première matrice doit être égal au nombre de lignes de la deuxième matrice.");
        }

        Matrice resultat = new Matrice(this.nbLignes, autre.nbColonnes);
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < autre.nbColonnes; j++) {
                double somme = 0;
                for (int k = 0; k < this.nbColonnes; k++) {
                    somme += this.getElement(i, k) * autre.getElement(k, j);
                }
                resultat.setElement(i, j, somme);
            }
        }
        return resultat;
    }

    public boolean equal(Matrice autre) {
        if (this.nbLignes != autre.nbLignes || this.nbColonnes != autre.nbColonnes) {
            System.out.println("Les matrices doivent avoir la même taille. Echec de la comparaison.");
            return false;
        }

        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                if (this.getElement(i, j) != autre.getElement(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void afficher() {
        for (int i = 0; i < this.nbLignes; i++) {
            for (int j = 0; j < this.nbColonnes; j++) {
                System.out.print(this.getElement(i, j) + " ");
            }
            System.out.println();
        }
    }
}