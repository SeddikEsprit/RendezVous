package tn.seddik.rendezvous.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.seddik.rendezvous.entities.Clinique;
@Repository
public interface CliniqueRepository extends JpaRepository<Clinique,Long> {
}
