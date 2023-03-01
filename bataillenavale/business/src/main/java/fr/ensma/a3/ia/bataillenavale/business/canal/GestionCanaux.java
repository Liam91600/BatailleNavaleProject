package fr.ensma.a3.ia.bataillenavale.business.canal;
// TODO: Documentation

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

/**
 * GestionCanaux
 */
public class GestionCanaux {

    private List<CanalDesc> listCanaux;

    public GestionCanaux() {
        listCanaux = new ArrayList<CanalDesc>();
        // FIXME: Ajout couche DAL, faire le lien genre apeller le DAO etc, ici pour l'exemple on rajoute le canal a la main
        listCanaux.add(new CanalDesc(1, "MikkyPartie", "Partie de Mikky..."));
        listCanaux.add(new CanalDesc(2, "LiamPartie", "Partie de Liam..."));
        listCanaux.add(new CanalDesc(5, "AudranPartie", "Utilisez pas le missile en croix svp.."));

    }

    public Optional<CanalDesc> getCanal(final int idcan) {
        ListIterator<CanalDesc> ite = listCanaux.listIterator();
        boolean fin = false;
        Optional<CanalDesc> res = null;
        CanalDesc elem = null;
        while (ite.hasNext() && !fin) {
            elem = ite.next();
            if (elem.getCanalId().equals(idcan)) {
                fin = true;
                res = Optional.of(elem);
            }
        }
        if (elem == null) {
            res = Optional.empty();
        }
        return res;
    }
    
    public List<CanalDesc> getListCanal(){
    	return listCanaux;
    }

}
