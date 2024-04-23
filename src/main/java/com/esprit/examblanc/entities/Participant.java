package com.esprit.examblanc.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Participant")

@Getter
@Setter
public class Participant  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idp;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private tache tache;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Evenement> events;

    public Long getIdp() {
        return idp;
    }

    public void setIdp(Long idp) {
        this.idp = idp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public com.esprit.examblanc.entities.tache getTache() {
        return tache;
    }

    public void setTache(com.esprit.examblanc.entities.tache tache) {
        this.tache = tache;
    }

    public List<Evenement> getEvents() {
        return events;
    }

    public void setEvents(List<Evenement> events) {
        this.events = events;
    }
}
