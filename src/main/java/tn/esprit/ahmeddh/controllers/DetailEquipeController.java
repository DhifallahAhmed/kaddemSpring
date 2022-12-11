package tn.esprit.ahmeddh.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.ahmeddh.entity.DetailEquipe;

@RestController
@RequestMapping("detailequipe")
public class DetailEquipeController extends GenericController<DetailEquipe,Integer>{
}
