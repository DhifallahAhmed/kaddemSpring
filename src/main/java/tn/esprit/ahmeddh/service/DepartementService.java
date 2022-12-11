package tn.esprit.ahmeddh.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ahmeddh.entity.Departement;
import tn.esprit.ahmeddh.entity.Etudiant;
import tn.esprit.ahmeddh.entity.Universite;
import tn.esprit.ahmeddh.repository.DepartementRepository;
import tn.esprit.ahmeddh.repository.UniversiteRepository;

import java.util.List;
import java.util.Set;

@Service
public class DepartementService extends IGenericServiceIMP<Departement,Integer> implements IDepartementService {
    @Autowired
    DepartementRepository departementRepository;
    @Autowired
    UniversiteRepository universiteRepository;


    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        /*recuperation des objets*/
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        /*verification*/
        if (universite!=null && departement!=null){
            universite.setDepartements((Set<Departement>) departement);
            universiteRepository.save(universite);
        }
    }
}

