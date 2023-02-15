package tn.seddik.rendezvous.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.seddik.rendezvous.entities.RendezVous;
import tn.seddik.rendezvous.entities.Specialite;
import tn.seddik.rendezvous.services.IRendezVousService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/rendezVous")
public class RendeVousController {

    IRendezVousService rendezVousService;
    @PostMapping("/ajouterRendezVousAssignMedecinPatient/{medecinId}/{patientId}")
    public void ajouterRendezVousAssignMedecinPatient(@RequestBody RendezVous rendezVous, @PathVariable("medecinId") Long medecinId, @PathVariable("patientId") Long patientId){
        rendezVousService.addRDVAndAssignMedAndPatient(rendezVous,medecinId,patientId);
    }
    @GetMapping("/getRendezVousByCliniqueSpecialite/{cliniqueId}/{specialiteId}")
    public List<RendezVous> getRendezVousByCliniqueSpecialite(@PathVariable("cliniqueId") Long cliniqueId,
                                                              @PathVariable("specialiteId") Specialite specialiteId){
        return rendezVousService.getRendezVousByCliniqueAndSpecialite(cliniqueId,specialiteId);
    }

    @GetMapping("/getNbrRendezVousMedecin/{medecinId}")
    public int getNbrRendezVousMedecin(@PathVariable("medecinId") Long medecinId){
        return rendezVousService.getNbrRendezVousMedecin(medecinId);
    }
}
