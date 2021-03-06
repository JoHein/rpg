/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpg.rpg.repositories;

import com.rpg.rpg.entity.Champ;
import java.util.List;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 *
 * @author t543115
 */
public interface ChampRepository extends JpaRepository<Champ, Long>, JpaSpecificationExecutor<Champ> {
    
    List<Champ> findAllByOrderByNomAsc();

    List<Champ> findByNomIgnoreCaseContainingOrderByNomAsc(String nom);
    
}
