package tn.esprit.ahmeddh.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmeddh.entity.Contrat;
import tn.esprit.ahmeddh.entity.Universite;
import tn.esprit.ahmeddh.service.IUniversiteService;

import java.util.List;


@RestController
@RequestMapping("universite")
public class UniversiteController extends GenericController<Universite,Integer> {
   @Autowired
    IUniversiteService iUniversiteService;

}
