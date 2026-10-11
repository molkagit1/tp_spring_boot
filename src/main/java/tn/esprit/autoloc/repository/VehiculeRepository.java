package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.domain.entities.Maintenance;

public interface VehiculeRepository extends JpaRepository<Maintenance, Long> {
}
