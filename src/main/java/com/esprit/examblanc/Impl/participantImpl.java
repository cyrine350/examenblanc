package com.esprit.examblanc.Impl;

import com.esprit.examblanc.Dao.ParticipantDao;
import com.esprit.examblanc.Services.ParticipantService;
import com.esprit.examblanc.entities.Participant;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class participantImpl implements ParticipantService {
    @Resource
    private ParticipantDao PDao;

    @Override
    public Participant ajouterParticipant(Participant p) {

           return PDao.save(p);
        }
    }

