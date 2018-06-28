/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpg.rpg.entity;

/**
 *
 * @author t543115
 */
public enum SpecialisationEnum {
    GUERRIER ("Spécialiste de la guerre fort et endurant"),
    MAGE ("Connaissance et analyse des arts magiques"),
    SCOUT ("Rapide et habitué des chasses"),
    BANDIT ("Convaincre n'est pas un problème, même quand ca prend du temps"),
    PRETRE ("Orateur hors paire, les livres n'entraine pas le physique");
    
    private final String descSpe;
    
    SpecialisationEnum(String descSpe){
        this.descSpe = descSpe;
    }
    
    public String getDescSpe() {
        return this.descSpe;
    } 
    
    
}
