package tn.seddik.rendezvous.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.seddik.rendezvous.entities.Medecin;

import java.util.Date;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin,Long> {
    @Query("select sum (medecin.prixConsultation) from Medecin medecin join medecin.rendezVous rendezvous" +
            " where ((rendezvous.dateRdv between :startDate and :endDate) and (medecin.idMedecin =:idMedecin))")
    public int getRevenuMedecin(Long idMedecin, Date startDate, Date endDate);
}

