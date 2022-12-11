package tn.esprit.ahmeddh.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ahmeddh.entity.Contrat;
import tn.esprit.ahmeddh.entity.Departement;
import tn.esprit.ahmeddh.entity.Etudiant;
import tn.esprit.ahmeddh.entity.Universite;
import tn.esprit.ahmeddh.repository.DepartementRepository;
import tn.esprit.ahmeddh.repository.UniversiteRepository;

import java.util.List;
@Service
public class UniversiteService extends IGenericServiceIMP<Universite,Integer> implements IUniversiteService{
    @Autowired
    UniversiteRepository universiteRepository;
    @Autowired
    DepartementRepository departementRepository;

}
