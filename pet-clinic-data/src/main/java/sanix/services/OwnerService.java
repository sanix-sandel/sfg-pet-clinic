package sanix.services;

import sanix.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);
}
