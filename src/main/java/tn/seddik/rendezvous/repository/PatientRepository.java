package tn.seddik.rendezvous.repository;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;
        import tn.seddik.rendezvous.entities.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {


        }
