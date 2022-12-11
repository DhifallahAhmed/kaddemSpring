package tn.esprit.ahmeddh.service;

import tn.esprit.ahmeddh.entity.Departement;

import java.util.List;

public interface IDepartementService extends IGenericService<Departement,Integer> {
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);
}
