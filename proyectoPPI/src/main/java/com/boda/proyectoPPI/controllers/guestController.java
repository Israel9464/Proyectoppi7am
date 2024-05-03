package com.boda.proyectoPPI.controllers;

import com.boda.proyectoPPI.models.guestModel;
import com.boda.proyectoPPI.services.guestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/guest")
public class guestController {
    @Autowired
    guestService service;

    @PostMapping()
    public guestModel saveGuest(@RequestBody guestModel guest){
      return service.saveGuest(guest);
    }

    @PutMapping()
    public guestModel editGuest(@RequestBody guestModel guest){
        return service.editGuest(guest);
    }

    @GetMapping()
    public ArrayList<guestModel> getAllGuest(){
        return service.getAllGuest();
    }

    @GetMapping("/findGuestById/{id}")
    public Optional<guestModel> findGuestById(@PathVariable Long id){
        return service.findGuestById(id);
    }

    @GetMapping("/findGuestByName/{name}")
    public Optional<ArrayList<guestModel>> findGuestByName(@PathVariable String name){
        return service.findGuestByName(name);
    }

    @DeleteMapping("/delete-guest-by-id")
    public String delteGuestById(@RequestParam("id") Long id){
        return service.deleteGuestById(id);
    }
}
