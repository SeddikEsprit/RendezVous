package tn.seddik.rendezvous.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table( name = "Patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPatient")
    private Long idPatient;
    private String nomPatient;
    private int telephone;
    private Date dateNaissance;

    @OneToMany(mappedBy = "patient")
    private Set<RendezVous> rendezVous;
}
