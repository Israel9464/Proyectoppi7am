package com.boda.proyectoPPI.services;

import com.boda.proyectoPPI.models.guestModel;
import com.boda.proyectoPPI.repositories.guestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class guestService {
    @Autowired
    guestRepository repository;

    public guestModel saveGuest(guestModel guest) {
        if (repository.findGuestModelByName(guest.getName()).toString().equals("Optional[[]]")) {
            return repository.save(guest);
        } else {
            guestModel guestError = new guestModel();
            guestError.setId(-1L);
            return guestError;
        }
    }

    public ArrayList<guestModel> getAllGuest() {
        return (ArrayList<guestModel>) repository.findAll();
    }

    public Optional<guestModel> findGuestById(Long id) {
        return repository.findById(id);
    }

    public guestModel editGuest(guestModel guest) {
        return repository.save(guest);
    }

    public String deleteGuestById(Long id) {
        if (findGuestById(id).isPresent()){
            repository.deleteById(id);
            return "Guest deleted successfully";
        }else{
            return "Guest with id = " + id + " not found";
        }
    }

    public Optional<ArrayList<guestModel>> findGuestByName(String name){
        return repository.findGuestModelByName(name);
    }
}