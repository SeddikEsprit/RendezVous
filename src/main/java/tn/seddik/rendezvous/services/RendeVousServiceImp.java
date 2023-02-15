package tn.seddik.rendezvous.services;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.seddik.rendezvous.entities.Medecin;
import tn.seddik.rendezvous.entities.Patient;
import tn.seddik.rendezvous.entities.RendezVous;
import tn.seddik.rendezvous.entities.Specialite;
import tn.seddik.rendezvous.repository.MedecinRepository;
import tn.seddik.rendezvous.repository.PatientRepository;
import tn.seddik.rendezvous.repository.RendezVousRepository;

import java.util.List;

@AllArgsConstructor
@Service
@ToString
public class RendeVousServiceImp implements IRendezVousService {

    RendezVousRepository rendezVousRepository;
    MedecinRepository medecinRepository;
    PatientRepository patientRepository;

    @Override
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient) {
        Medecin medecin=medecinRepository.findById(idMedecin).get();
        Patient patient=patientRepository.findById(idPatient).get();
        RendezVous newRdv=rendezVousRepository.save(rdv);
        newRdv.setMedecin(medecin);
        newRdv.setPatient(patient);
        rendezVousRepository.save(newRdv);

    }

    @Override
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite) {
        return rendezVousRepository.getRendezVousByCliniqueAndSpecialite(idClinique,specialite);
    }

    @Override
    //@Scheduled(cron = "*/30 * * * * *")

    public void retrieveRendezVous() {
       //rendezVousRepository.findAll().forEach(System.out::println);
    List<RendezVous> rendezVous=rendezVousRepository.findAll();
    for (RendezVous rendezVous1:rendezVous) {
        System.out.println("la liste des rendez vous :" +
                " date:" + rendezVous1.getDateRdv() +
                " medecin:" + rendezVous1.getMedecin().getNomMedecin() +
                " patient:" + rendezVous1.getPatient().getNomPatient() );
    }

    }

    @Override
    public int getNbrRendezVousMedecin(Long idMedecin) {
        return rendezVousRepository.getNbrRendezVousMedecin(idMedecin);
    }
}
