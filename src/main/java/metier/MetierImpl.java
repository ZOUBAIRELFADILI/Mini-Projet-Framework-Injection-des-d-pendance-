package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    @Autowired
    //  @Qualifier("vws")
    // Déclaration d'une variable de type IDao pour le couplage faible (injection de dépendance)
    private IDao dao;

    // Constructeur qui reçoit un objet IDao en tant que dépendance
    public MetierImpl(IDao dao) {
        // Initialisation de la variable dao avec l'objet passé en argument
        this.dao = dao;
    }

    @Override
    // Implémentation de la méthode "calcul" de l'interface IMetier
    public double calcul() {
        // Utilisation de l'objet dao pour obtenir des données
        double data = dao.getData();
        // Calcul
        double res = data * 11.4;
        // Renvoie le résultat
        return res;
    }

    /**
     * Pour permettre d'injecter dans la variable dao un objet d'une classe qui implémente l'interface IDao
     * @param dao L'objet IDao à injecter
     */

    // Méthode permettant de modifier l'objet dao (injection de dépendance)
    public void setDao(IDao dao) {
        // Mise à jour de la variable dao avec l'objet passé en argument
        this.dao = dao;
    }
}

