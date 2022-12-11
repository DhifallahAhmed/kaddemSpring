package tn.esprit.ahmeddh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmeddh.entity.Etudiant;
import tn.esprit.ahmeddh.service.EtudiantService;
import tn.esprit.ahmeddh.service.IEtudiantService;

import java.util.List;

@RestController
@RequestMapping("etudiant")
public class EtudiantController extends GenericController<Etudiant,Integer> {
    @Autowired
    IEtudiantService etudiantService;

    @PutMapping("/assign/{etudiantId}/{departementId}")
    public void assignEtudiantToDepartement(@PathVariable Integer etudiantId, Integer departementId) {
        this.etudiantService.assignEtudiantToDepartement(etudiantId, departementId);
    }
}