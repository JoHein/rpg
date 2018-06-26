/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpg.rpg.controllers;

import com.rpg.rpg.entity.Utilisateur;
import com.rpg.rpg.repositories.UtilisateurRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author t543115
 */
@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
    
    @Autowired
    UtilisateurRepository utilRepo;
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Utilisateur> listUtilisateurs() {
        return utilRepo.findAll();
    }
    
}
