package tn.esprit.ahmeddh.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmeddh.entity.Contrat;
import tn.esprit.ahmeddh.entity.Departement;
import tn.esprit.ahmeddh.service.IDepartementService;

import java.util.List;


@RestController
@RequestMapping("/departement")
public class DepartementController extends GenericController<Departement,Integer> {
    @Autowired
    IDepartementService iDepartementService;

    @PutMapping("/assign/{idUniversite}/{departementId}")
    public void assignUniversiteToDepartement(@PathVariable Integer idUniversite, Integer departementId) {
        this.iDepartementService.assignUniversiteToDepartement(idUniversite, departementId);
    }


}
