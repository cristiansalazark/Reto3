
package Reto3_Ciclo3.Reto3_Ciclo3.Repositorio;

import Reto3_Ciclo3.Reto3_Ciclo3.Interfaces.InterfaceMessage;
import Reto3_Ciclo3.Reto3_Ciclo3.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioMessage {
    
    
   
    @Autowired
    private InterfaceMessage crudm;

    public List<Message> getAll() {
        return (List < Message >) crudm.findAll();
    }

    public Optional<Message> getMessage(int id) {
        return crudm.findById(id);
    }
    
     public Message save(Message messa){
        return crudm.save(messa);
    } 
    
}
