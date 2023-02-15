package tn.seddik.rendezvous.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.seddik.rendezvous.entities.Clinique;
import tn.seddik.rendezvous.repository.CliniqueRepository;
@AllArgsConstructor
@Service
public class CliniqueServiceImp implements ICliniqueService{
    CliniqueRepository cliniqueRepository;
    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique) ;
    }
}
