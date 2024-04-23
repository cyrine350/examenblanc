package com.esprit.examblanc.Dao;

import com.esprit.examblanc.entities.Evenement;
import com.esprit.examblanc.entities.logistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface logistqueDao  extends JpaRepository<logistique, Long> {
}
