package guru.springframework.sfgpetclinic.model.model;

import guru.springframework.sfgpetclinic.model.BaseEntity;

/**
 * Created by jt on 7/13/18.
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
