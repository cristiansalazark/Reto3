
package Reto3_Ciclo3.Reto3_Ciclo3.Repositorio;

import Reto3_Ciclo3.Reto3_Ciclo3.Interfaces.InterfaceQuadbike;
import Reto3_Ciclo3.Reto3_Ciclo3.Interfaces.InterfaceReservation;
import Reto3_Ciclo3.Reto3_Ciclo3.Modelo.Quadbike;
import Reto3_Ciclo3.Reto3_Ciclo3.Modelo.Reservation;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class RepositorioReservation {
     @Autowired
    private InterfaceReservation crud;

    public List<Reservation> getAll() {
        return (List < Reservation >) crud.findAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return crud.findById(id);
    }
    
     public Reservation save(Reservation reserv){
        return crud.save(reserv);
    }
    
    
    
    
}
