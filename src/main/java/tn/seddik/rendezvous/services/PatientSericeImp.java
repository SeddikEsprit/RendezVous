package tn.seddik.rendezvous.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.seddik.rendezvous.entities.Patient;
import tn.seddik.rendezvous.repository.PatientRepository;

@AllArgsConstructor
@Service
public class PatientSericeImp implements IPatientService {

PatientRepository patientRepository;
    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
