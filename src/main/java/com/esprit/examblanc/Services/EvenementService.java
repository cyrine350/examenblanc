package com.esprit.examblanc.Services;

import com.esprit.examblanc.entities.Evenement;
import com.esprit.examblanc.entities.Participant;

import java.util.List;

public interface EvenementService {


    public Evenement ajouterEtAffecterpart(Evenement e, List<Long> Participantid);
}
