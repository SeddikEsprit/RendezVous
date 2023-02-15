package tn.seddik.rendezvous.services;

import tn.seddik.rendezvous.entities.Medecin;

import java.util.Date;

public interface IMedecinService {
    public Medecin addMedecinAndAssignToClinique (Medecin medecin, Long cliniqueId);

    public int getRevenuMedecin (Long idMedecin, Date startDate, Date endDate);

}
