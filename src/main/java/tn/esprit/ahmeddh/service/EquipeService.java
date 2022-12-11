package tn.esprit.ahmeddh.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ahmeddh.entity.Equipe;
import tn.esprit.ahmeddh.repository.EquipeRepository;

import java.util.List;

@Service
public class EquipeService  extends IGenericServiceIMP<Equipe,Integer> implements IEquipeService {
    @Autowired /*field injection*/
    EquipeRepository equipeRepository ;



}