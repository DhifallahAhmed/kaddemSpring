package tn.esprit.ahmeddh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ahmeddh.entity.Departement;

import java.util.List;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}
