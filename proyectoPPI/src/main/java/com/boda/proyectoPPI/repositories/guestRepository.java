package com.boda.proyectoPPI.repositories;

import com.boda.proyectoPPI.models.guestModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface guestRepository extends CrudRepository<guestModel, Long>{
    public Optional<ArrayList<guestModel>> findGuestModelByName(String name);
}
