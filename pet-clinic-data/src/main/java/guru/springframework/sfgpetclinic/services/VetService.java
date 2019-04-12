package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;


/**
 * Created by jt on 7/18/18.
 */
public interface VetService extends CrudService<Vet, Long>{

    Vet findById(Long id);

    Vet save(Owner owner);

    Set<Vet> findAll();
}
