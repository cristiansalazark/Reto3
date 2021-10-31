
package Reto3_Ciclo3.Reto3_Ciclo3.Repositorio;

import Reto3_Ciclo3.Reto3_Ciclo3.Interfaces.InterfaceCategory;
import Reto3_Ciclo3.Reto3_Ciclo3.Modelo.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class RepositorioCategory {
     @Autowired
    
     
      private InterfaceCategory crud;

    public List<Category> getAll() {
        return (List < Category >) crud.findAll();
    }

    public Optional<Category> getCategory(int id) {
        return crud.findById(id);
    }
    
     public Category save(Category cate){
        return crud.save(cate);
    }
     
    
    
}
