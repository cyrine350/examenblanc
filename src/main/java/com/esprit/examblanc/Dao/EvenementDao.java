package com.esprit.examblanc.Dao;

import com.esprit.examblanc.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvenementDao  extends JpaRepository<Evenement, Long> {
    Evenement findBydescription(String description);

}
