package sanix.services.map;

import sanix.services.PetService;
import sanix.model.Pet;

import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll(){
        return super.findAll();
    }

    @Override
    public Pet findById(Long id){
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object){
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object){
        this.delete(object);
    }

    @Override
    public void deleteById(Long id){
        this.deleteById(id);
    }


}
