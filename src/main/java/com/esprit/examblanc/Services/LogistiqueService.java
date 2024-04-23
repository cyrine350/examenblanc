package com.esprit.examblanc.Services;

import com.esprit.examblanc.entities.Evenement;
import com.esprit.examblanc.entities.Participant;
import com.esprit.examblanc.entities.logistique;


import java.util.Date;
import java.util.List;

public interface LogistiqueService {
    public logistique ajoutAffectLogEvnm (logistique l, String descriptionEvnmt) ;


    public List<logistique> getLogistiquesDates (Date dateDeb, Date dateFin);

}
