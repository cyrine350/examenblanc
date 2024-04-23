package com.esprit.examblanc.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "evenment")

@Getter
@Setter
public class Evenement  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idE;
    private String description;
    private float cout;
    private Date startDate;
    private Date endDate;

    @OneToMany(mappedBy = "evenemnt",cascade = CascadeType.ALL)
    @JsonBackReference
    private List<logistique> logistiques;

    @ManyToMany(mappedBy = "events", cascade = CascadeType.ALL)
    // @JsonBackReference
    private List<Participant> Participants;


    public Long getIdE() {
        return idE;
    }

    public void setIdE(Long idE) {
        this.idE = idE;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCout() {
        return cout;
    }

    public void setCout(float cout) {
        this.cout = cout;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<logistique> getLogistiques() {
        return logistiques;
    }

    public void setLogistiques(List<logistique> logistiques) {
        this.logistiques = logistiques;
    }
}
