package tn.esprit.ahmeddh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ahmeddh.entity.Equipe;
import tn.esprit.ahmeddh.service.IGenericService;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
public class GenericController<T,ID> {

    @Autowired
    IGenericService<T,ID> iGenericService;
    @PostMapping
    public T create(@RequestBody T entity) {
        return iGenericService.save(entity);
    }

    @GetMapping
    public List<T> read() {
        return iGenericService.findAll();
    }

    @PutMapping
    public T update(@RequestBody T entity) {
        return iGenericService.save(entity);
    }

   @GetMapping("/{idT}")
    public T read_T(@PathVariable ID idT) {
        return iGenericService.findByID(idT);
    }


    @DeleteMapping("/{idT}")
    public void delete(@PathVariable ID idT) {
        iGenericService.delete(idT);
    }


}
