package Reto3_Ciclo3.Reto3_Ciclo3.Repositorio;

import Reto3_Ciclo3.Reto3_Ciclo3.Interfaces.InterfaceQuadbike;
import Reto3_Ciclo3.Reto3_Ciclo3.Modelo.Quadbike;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class RepositorioQuadbike {

    @Autowired
    private InterfaceQuadbike crud;

    public List<Quadbike> getAll() {
        return (List < Quadbike >) crud.findAll();
    }

    public Optional<Quadbike> getQuadbike(int id) {
        return crud.findById(id);
    }
    
     public Quadbike save(Quadbike Quad){
        return crud.save(Quad);
    }
     
     
}
