package tn.esprit.ahmeddh.service;

import tn.esprit.ahmeddh.entity.Contrat;
import tn.esprit.ahmeddh.entity.Equipe;
import tn.esprit.ahmeddh.entity.Etudiant;

import java.util.List;
import java.util.Set;

public interface IEtudiantService extends IGenericService<Etudiant,Integer> {

    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe);

    Set<Etudiant> getEtudiantsByDepartement (Integer idDepartement);

}
