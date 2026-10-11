package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat, LONG> {
}
