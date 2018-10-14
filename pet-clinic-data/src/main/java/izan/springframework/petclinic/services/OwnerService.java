package izan.springframework.petclinic.services;

import izan.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLasName(String lasName);

    Owner findById(Long id);

    Owner save (Owner owner);

    Set<Owner> findAll();
}