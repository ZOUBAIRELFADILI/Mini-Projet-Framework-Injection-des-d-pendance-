package pres;

// Import de l'interface IMetier
import metier.IMetier;
// Import de l'interface ApplicationContext de Spring
import org.springframework.context.ApplicationContext;
// Import de la classe ClassPathXmlApplicationContext de Spring
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres3SpringXml {
    public static void main(String[] args) {
        // Création du contexte Spring à partir du fichier de configuration "config.xml"
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        // Récupération de l'instance de IMetier gérée par Spring
        IMetier metier = springContext.getBean(IMetier.class);
        // Appel de la méthode "calcul" de l'instance et affichage du résultat
        System.out.println("RES " + metier.calcul());
    }
}

