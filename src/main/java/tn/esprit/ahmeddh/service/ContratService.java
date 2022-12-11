package tn.esprit.ahmeddh.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ahmeddh.entity.Contrat;
import tn.esprit.ahmeddh.entity.Equipe;
import tn.esprit.ahmeddh.entity.Etudiant;
import tn.esprit.ahmeddh.repository.ContratRepository;
import tn.esprit.ahmeddh.repository.EquipeRepository;
import tn.esprit.ahmeddh.repository.EtudiantRepository;

import java.util.List;
import java.util.Set;


@Service
public class ContratService extends IGenericServiceIMP<Contrat,Integer> implements IContratService{
    @Autowired
    ContratRepository contratRepository;



}
