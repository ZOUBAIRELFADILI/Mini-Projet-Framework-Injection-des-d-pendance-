// Déclaration du package "dao"
package dao;

// Import de l'annotation @Component de Spring
import org.springframework.stereotype.Repository;


// Annotation indiquant que cette classe est un composant de persistance avec le nom "dao"
@Repository("dao")

// Définition de la classe DaoImpl qui implémente l'interface IDao
public class DaoImpl implements IDao {

    // Annotation indiquant que la méthode suivante est une implémentation d'une méthode de l'interface
    @Override
    // Déclaration de la méthode getData
    public double getData() {
        // Message de journalisation
        System.out.println("version base de données");
        // Déclaration d'une variable "data" initialisée à 20
        double data = 20;
        // Renvoie la valeur stockée dans la variable "data"
        return data;
    }
}
