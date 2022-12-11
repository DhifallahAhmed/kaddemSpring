package tn.esprit.ahmeddh.service;

import java.util.List;

public interface IGenericService<T,ID> {
    public List<T> findAll();

    public T save(T entity);

    public void delete(ID id);

    public T findByID(ID id);
}
