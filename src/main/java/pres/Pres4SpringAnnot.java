package pres;

// Import de l'interface IMetier
import metier.IMetier;
// Import de l'interface ApplicationContext de Spring
import org.springframework.context.ApplicationContext;
// Import de la classe AnnotationConfigApplicationContext de Spring
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// Annotation indiquant que cette classe est un contrôleur Spring
import org.springframework.stereotype.Controller;

// Annotation indiquant que cette classe est un contrôleur Spring
@Controller
public class Pres4SpringAnnot {
    public static void main(String[] args) {
        // Création du contexte Spring à partir des packages "dao" et "metier"
        ApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier");
        // Récupération de l'instance de IMetier gérée par Spring
        IMetier metier = context.getBean(IMetier.class);
        // Appel de la méthode "calcul" de l'instance et affichage du résultat
        System.out.println("RES = " + metier.calcul());
    }
}

