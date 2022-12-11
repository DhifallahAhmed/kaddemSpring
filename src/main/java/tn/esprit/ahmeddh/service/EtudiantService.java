package tn.esprit.ahmeddh.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ahmeddh.entity.Contrat;
import tn.esprit.ahmeddh.entity.Departement;
import tn.esprit.ahmeddh.entity.Equipe;
import tn.esprit.ahmeddh.entity.Etudiant;
import tn.esprit.ahmeddh.repository.ContratRepository;
import tn.esprit.ahmeddh.repository.DepartementRepository;
import tn.esprit.ahmeddh.repository.EquipeRepository;
import tn.esprit.ahmeddh.repository.EtudiantRepository;

import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class EtudiantService extends IGenericServiceIMP<Etudiant,Integer> implements IEtudiantService{
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    DepartementRepository departementRepository;
    @Autowired
    ContratRepository contratRepository;
    @Autowired
    EquipeRepository equipeRepository;

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        /*recuperation des objets*/
        Etudiant etudiant = etudiantRepository.findById(etudiantId).orElse(null);
        Departement departement = departementRepository.findById(departementId).orElse(null);
        /*verification*/
        if (etudiant!=null && departement!=null){
            etudiant.setDepartement(departement);
            etudiantRepository.save(etudiant);
        }
    }
    @Transactional
    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Contrat c = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        Etudiant etudiant = new Etudiant();

        if(c!= null && equipe!=null){
            etudiant = etudiantRepository.save(e);
            Set<Equipe> equipes = new HashSet<>();
            etudiant.setEquipe_etud(equipes);
            etudiant.getEquipe_etud().add(equipe);
            c.setEtudiant_contr(etudiant);
            return etudiant;
        }
            return etudiant;
    }

    @Override
    public Set<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        if (departement != null) {
            return etudiantRepository.findByDepartement(idDepartement);
        }
        return null;
    }

}
