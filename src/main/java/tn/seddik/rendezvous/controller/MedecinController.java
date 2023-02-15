package tn.seddik.rendezvous.controller;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.seddik.rendezvous.entities.Medecin;
import tn.seddik.rendezvous.services.IMedecinService;

import java.util.Date;

@RestController
@AllArgsConstructor
@RequestMapping("/medecin")
public class MedecinController {
    IMedecinService medecinService;
    @PostMapping("/ajouterMedecinClinique/{cliniqueId}")
    public Medecin ajouterMedecinClinique(@RequestBody Medecin medecin, @PathVariable("cliniqueId") Long cliniqueId){
        return medecinService.addMedecinAndAssignToClinique(medecin,cliniqueId);
    }
    @GetMapping("/getRevenuMedecin/{idMedecin}/{startDate}/{endDate}")
    public int getRevenuMedecin (
            @PathVariable("idMedecin") Long idMedecin,
            @PathVariable("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @PathVariable("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd")Date endDate

    ){
        return medecinService.getRevenuMedecin(idMedecin,startDate,endDate);
    }
}
