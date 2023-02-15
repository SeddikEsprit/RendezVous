package tn.seddik.rendezvous.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.seddik.rendezvous.entities.Clinique;
import tn.seddik.rendezvous.entities.Medecin;
import tn.seddik.rendezvous.repository.CliniqueRepository;
import tn.seddik.rendezvous.repository.MedecinRepository;

import java.util.*;

@AllArgsConstructor
@Service
public class MedecinServiceImp implements IMedecinService {

    MedecinRepository medecinRepository;
    CliniqueRepository cliniqueRepository;



    @Transactional
    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        Medecin newMedecin = medecinRepository.save(medecin);
        Clinique clinique=cliniqueRepository.findById(cliniqueId).orElse(null);

        clinique.getMedecins().add(newMedecin);
        cliniqueRepository.save(clinique);
        return newMedecin;
//        if (clinique !=null) {
//         Set<Clinique> cliniques = new TreeSet<>();
//         cliniques=newMedecin.getCliniques();
//         if (cliniques!=null) {
//                cliniques.add(clinique);
//             newMedecin.setCliniques(cliniques);
//               return medecinRepository.save(newMedecin);
//         }else {
//             newMedecin.setCliniques(cliniques);
//             return medecinRepository.save(newMedecin);
//         }
//
//        }else
//        {
//            return null;
//        }


    }

     @Override
    public int getRevenuMedecin(Long idMedecin, Date startDate, Date endDate) {

        return medecinRepository.getRevenuMedecin(idMedecin,startDate,endDate);
    }
}
