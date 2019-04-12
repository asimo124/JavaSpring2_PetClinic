package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by jt on 7/18/18.
 */
public interface PetService extends CrudService<Pet, Long> {

    Pet findById(Long id);

    Pet save(Owner owner);

    Set<Pet> findAll();
}
