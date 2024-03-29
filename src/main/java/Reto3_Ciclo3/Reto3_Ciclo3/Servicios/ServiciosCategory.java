
package Reto3_Ciclo3.Reto3_Ciclo3.Servicios;

import Reto3_Ciclo3.Reto3_Ciclo3.Modelo.Category;
import Reto3_Ciclo3.Reto3_Ciclo3.Repositorio.RepositorioCategory;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ServiciosCategory {
     @Autowired
     
       private RepositorioCategory  crud;
     
      public List<Category > getAll(){
        return crud.getAll();
    }

    public Optional<Category > getCategory(int id){
        return crud.getCategory(id);
    }
    
    
        public Category save(Category cate){
        if(cate.getIdcategory()==null){
            return crud.save(cate);
        }else{
            Optional<Category> evt=crud.getCategory(cate.getIdcategory());
            if(evt.isEmpty()){
                return crud.save(cate);
            }else{
                return cate;
            }
        }
    }
     
     
}
