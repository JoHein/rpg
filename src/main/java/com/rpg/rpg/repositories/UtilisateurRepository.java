/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpg.rpg.repositories;

import com.rpg.rpg.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author t543115
 */
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long>, JpaSpecificationExecutor<Utilisateur> {
    
}
