package tn.seddik.rendezvous.services;

import tn.seddik.rendezvous.entities.RendezVous;
import tn.seddik.rendezvous.entities.Specialite;

import java.util.List;

public interface IRendezVousService {
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long
            idPatient);

    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite);

    public void retrieveRendezVous();

    public int getNbrRendezVousMedecin(Long idMedecin);
}
