// Déclaration du package "dao"
package dao;

// Définition de la classe DaoImplV2 qui implémente l'interface IDao
public class DaoImplV2 implements IDao {

    // Annotation indiquant que la méthode suivante est une implémentation d'une méthode de l'interface
    @Override
    // Déclaration de la méthode getData
    public double getData() {

        // Message de journalisation
        System.out.println("Version Web Services");
        // Déclaration d'une variable "data" initialisée à 35
        double data = 35;
        // Renvoie la valeur stockée dans la variable "data"
        return data;
    }
}

