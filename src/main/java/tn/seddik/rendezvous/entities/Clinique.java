package tn.seddik.rendezvous.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table( name = "Clinique")
public class Clinique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClinique")
    private Long idClinique;
    private String nomClinique;
    private String adresse;
    private int telephone;

    @ManyToMany
    private Set<Medecin> medecins;
}
