package pres;

// Import de la classe DaoImpl du package "dao"
import dao.DaoImpl;
// Import de la classe MetierImpl du package "metier"
import metier.MetierImpl;

public class Pres1 {
    // Méthode principale (point d'entrée de l'application)
    public static void main(String[] args) {
        // Instanciation statique de la classe DaoImpl (sans injection de dépendance)
        DaoImpl dao = new DaoImpl();
        // Injection de dépendance via le constructeur de MetierImpl
        MetierImpl metier = new MetierImpl(dao);

        // Injection de dépendances à l'aide de la méthode setDao (non utilisée dans ce cas)
        // metier.setDao(dao);

        // Appel de la méthode "calcul" et affichage du résultat
        System.out.println("Res :" + metier.calcul());
    }
}

