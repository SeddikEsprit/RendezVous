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
@Table( name = "Medecin")
public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedecin")
    private Long idMedecin;
    private String nomMedecin;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private int telephone;
    private int prixConsultation;

    @ManyToMany(mappedBy = "medecins")
    @JsonIgnore
    private Set<Clinique> cliniques;

    @OneToMany(mappedBy = "medecin")
    @JsonIgnore
    private Set<RendezVous> rendezVous;


}
