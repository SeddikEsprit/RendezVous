package tn.seddik.rendezvous.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table( name = "RendezVous")
public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRdv")
    private Long idRdv;
    private Date dateRdv;
    private String remarque;

    @ManyToOne
    @JsonIgnore
    Medecin medecin;

    @ManyToOne
    @JsonIgnore
    Patient patient;
}
