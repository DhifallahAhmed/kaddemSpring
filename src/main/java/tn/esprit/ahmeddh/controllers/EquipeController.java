package tn.esprit.ahmeddh.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmeddh.entity.Contrat;
import tn.esprit.ahmeddh.entity.Equipe;
import tn.esprit.ahmeddh.service.IEquipeService;

import java.util.List;

@RestController
@RequestMapping("equipe")
public class EquipeController extends GenericController<Equipe,Integer> {
    @Autowired
    IEquipeService iEquipeService ;
    //localhost:9090/add


}
