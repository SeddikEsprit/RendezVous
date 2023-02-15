package tn.seddik.rendezvous.repository;

import lombok.ToString;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.seddik.rendezvous.entities.RendezVous;
import tn.seddik.rendezvous.entities.Specialite;

import java.util.List;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {

@Query("select r from RendezVous r join r.medecin m join m.cliniques c where" +
        " c.idClinique =:idClinique and m.specialite =:specialite")
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite);

@Query("select count (r) from RendezVous r join r.medecin m where m.idMedecin =:idMedecin")
    public int getNbrRendezVousMedecin(Long idMedecin);


}

