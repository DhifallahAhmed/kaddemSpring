package tn.esprit.ahmeddh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import tn.esprit.ahmeddh.entity.Contrat;

import java.util.Set;

public interface ContratRepository extends JpaRepository<Contrat, Integer> {


}
