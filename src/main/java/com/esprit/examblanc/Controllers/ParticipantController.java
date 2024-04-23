package com.esprit.examblanc.Controllers;

import com.esprit.examblanc.Services.EvenementService;
import com.esprit.examblanc.Services.LogistiqueService;
import com.esprit.examblanc.Services.ParticipantService;
import com.esprit.examblanc.entities.Evenement;
import com.esprit.examblanc.entities.Participant;
import com.esprit.examblanc.entities.logistique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ParticipantController {

    @Autowired
    private ParticipantService PService;

    @Autowired
    private EvenementService EService;


    @Autowired
    private LogistiqueService lService;

 @PostMapping("/ajouterP")
    public ResponseEntity<Participant> ajouterParr(@RequestBody Participant p) {
        Participant nouveaup = PService.ajouterParticipant(p);
        return new ResponseEntity<>(nouveaup, HttpStatus.CREATED);
    }
    @PostMapping("/ajouterProgrammeEtAffecterChaine")
    public Evenement ajouterProgrammeEtAffecterChaine(@RequestBody Evenement programme, @RequestParam List<Long> Participantid) {
        return EService.ajouterEtAffecterpart(programme, Participantid);
    }

    @PostMapping("/ajouterlog")
    public logistique ajouterProgrammeEtAffecterChaine(@RequestBody logistique l, @RequestParam String descriptionEvnmt) {
        return lService.ajoutAffectLogEvnm(l, descriptionEvnmt);
    }



}
