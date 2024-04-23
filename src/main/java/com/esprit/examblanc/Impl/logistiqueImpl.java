package com.esprit.examblanc.Impl;

import com.esprit.examblanc.Dao.EvenementDao;
import com.esprit.examblanc.Dao.logistqueDao;
import com.esprit.examblanc.Services.LogistiqueService;
import com.esprit.examblanc.entities.Evenement;
import com.esprit.examblanc.entities.Participant;
import com.esprit.examblanc.entities.logistique;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class logistiqueImpl  implements LogistiqueService {
    @Resource
    private EvenementDao eDao;
    @Resource
    private logistqueDao lDao;

    @Override
    public logistique ajoutAffectLogEvnm(logistique l, String descriptionEvnmt) {
        Optional<Evenement> chaineOptional = Optional.ofNullable(eDao.findBydescription(descriptionEvnmt));

        if (chaineOptional.isPresent()) {
            Evenement event = chaineOptional.get();
            event.setLogistiques((List<logistique>) l); // Assuming setLogistiques() takes a logistique object

            return lDao.save(l);
        } else {
            return null;
        }
    }


    @Override
    public List<logistique> getLogistiquesDates(Date dateDeb, Date dateFin) {
        return null;
    }

}
   /* public List<logistique> getLogistiquesDates(Date dateDeb, Date dateFin) {
 List<logistique> logistiques = new ArrayList<>();
            List<Evenement> evenements = eDao.findAll();
            for (Evenement evenement : evenements) {
                Date dateDebutEvenement = evenement.getStartDate();
                Date datefinEvenement = evenement.getEndDate();
          if (dateDebutEvenement.equals(dateDeb) && datefinEvenement.equals(dateFin) ) {

              logistique logistique = evenement.getLogistiques().get();
              logistiques.add(logistique);
                }
            }

            return logistiques;
        }
    }*/


