/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpg.rpg.controllers;

import com.rpg.rpg.entity.Champ;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.rpg.rpg.repositories.ChampRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.logging.Logger;
import javax.transaction.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author t543115
 */
@RestController
@RequestMapping("/api/champ")
public class ChampController {
    

    @Autowired
    ChampRepository champRepo;
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Champ> listChamps() {
        return champRepo.findAll();
    }
        
    @RequestMapping(value="/{techid}", method=RequestMethod.GET)
    public Optional<Champ> getOneChamp(@PathVariable Long techid) {
        return champRepo.findById(techid);
    }
    
    
    @RequestMapping(method=RequestMethod.POST)
    public Champ saveChamp(@RequestBody Champ champItem) {
        Champ champ = new Champ();
        champItem.setTechid(champ.getTechid());
        return champRepo.save(champItem);
    }
        
    @Transactional
    @RequestMapping(path="/{techid}", method=RequestMethod.DELETE)
    public void deleteChamp(@PathVariable Long techid) {
        champRepo.deleteById(techid); 
    }
    
    @RequestMapping(value="/search", method=RequestMethod.GET)
    public Set<String> testNameRessemble(@RequestParam("nom") String nom) {
        
        List<Champ> listChamp = new ArrayList<>();
        Set<String> setChamp = new HashSet<>();
        listChamp = champRepo.findByNomIgnoreCaseContaining(nom);
        
        for(Champ item : listChamp){
            setChamp.add(item.getNom());
        }
        return setChamp;
    }

}
