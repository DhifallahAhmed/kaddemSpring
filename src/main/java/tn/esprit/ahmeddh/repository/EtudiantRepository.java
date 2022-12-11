package tn.esprit.ahmeddh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ahmeddh.entity.Departement;
import tn.esprit.ahmeddh.entity.Etudiant;

import java.util.List;
import java.util.Set;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
    Set<Etudiant> findByDepartement(Integer id);
}
