package tn.seddik.rendezvous.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.seddik.rendezvous.entities.Patient;
import tn.seddik.rendezvous.services.IPatientService;

@RestController
@AllArgsConstructor
@RequestMapping("/patient")
public class PatientController {
    IPatientService patientService;
    @PostMapping("/ajouterPatient")
    public Patient ajouterPatient(@RequestBody Patient patient){
        return patientService.addPatient(patient);
    }
}
