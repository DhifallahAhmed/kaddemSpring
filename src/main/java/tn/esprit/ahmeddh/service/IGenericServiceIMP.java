package tn.esprit.ahmeddh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ahmeddh.repository.GenericRepository;

import java.util.List;

public class IGenericServiceIMP<T,ID> implements IGenericService<T,ID>{
    @Autowired
   JpaRepository<T,ID> genericRepository;
    @Override
    public List<T> findAll() {
        return genericRepository.findAll();
    }

    @Override
    public T save(T entity) {
        return genericRepository.save(entity);
    }

    @Override
    public void delete(ID id) {
        genericRepository.deleteById(id);
    }

    @Override
    public T findByID(ID id) {
        return genericRepository.findById(id).orElse(null);
    }
}
