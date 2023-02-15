package tn.seddik.rendezvous.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.seddik.rendezvous.entities.Clinique;

import tn.seddik.rendezvous.services.ICliniqueService;

@RestController
@AllArgsConstructor
@RequestMapping("/clinique")
public class CliniqueController {
    ICliniqueService cliniqueService;
    @PostMapping("/ajouterClinique")
    public Clinique ajouterClinique(@RequestBody Clinique clinique){
        return cliniqueService.addClinique(clinique);
    }
}
