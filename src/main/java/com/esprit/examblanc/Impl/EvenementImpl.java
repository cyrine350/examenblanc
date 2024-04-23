package com.esprit.examblanc.Impl;

import com.esprit.examblanc.Dao.EvenementDao;
import com.esprit.examblanc.Dao.ParticipantDao;
import com.esprit.examblanc.Services.EvenementService;
import com.esprit.examblanc.entities.Evenement;
import com.esprit.examblanc.entities.Participant;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvenementImpl implements EvenementService {

    @Resource
    private EvenementDao eDao;
    @Resource
    private ParticipantDao pDao;

    @Override
    public Evenement ajouterEtAffecterpart(Evenement e, List<Long> Participantid) {
        for (Long participantId : Participantid) {
            Optional<Participant> participantOptional = pDao.findById(participantId);
            if (participantOptional.isPresent()) {
                Participant participant = participantOptional.get();
                e.setParticipants((List<Participant>) participant);
            } else {
 }
}
 return eDao.save(e);
    }
}


