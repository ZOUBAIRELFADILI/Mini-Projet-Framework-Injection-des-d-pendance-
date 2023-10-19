package pres;
import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres2 {

    public static void main(String[] args) throws Exception {
        // DaoImpl dao = new DaoImpl();

        // Création d'un objet Scanner pour lire le fichier de configuration
        Scanner scanner = new Scanner(new File("config.txt"));
        // Lecture du nom de la classe Dao à partir du fichier de configuration
        String daoClassName = scanner.nextLine();
        // Chargement de la classe correspondant au nom lu
        Class cDao = Class.forName(daoClassName);
        // Création d'une instance de la classe Dao à partir de la classe chargée
        IDao dao = (IDao) cDao.getConstructor().newInstance();

        // MetierImpl metier = new MetierImpl();

        // Lecture du nom de la classe Metier à partir du fichier de configuration
        String metierClassName = scanner.nextLine();
        // Chargement de la classe correspondant au nom lu
        Class cMetier = Class.forName(metierClassName);
        // Création d'une instance de la classe Metier à partir de la classe chargée
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        // metier.setDao(dao);
        // Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
        // Injection de la dépendance à l'aide de la réflexion
        // setDao.invoke(metier, dao);

        // Appel de la méthode "calcul" et affichage du résultat
        System.out.println("Res: " + metier.calcul());
    }
}
