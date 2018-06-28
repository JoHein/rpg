/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpg.rpg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author t543115
 */
@Entity
@Table(name="champ")
public class Champ {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "techid")
    private Long techid;
    
    private String nom;
    private String prenom;
    private Integer age; 
    private Boolean gender;
    private Integer agilite;
    private Integer force;
    private Integer intelect;
    private Integer magie;
    private Integer endurance;
    private Integer charisme;
    private String description;
    private SpecialisationEnum spe;

    public Long getTechid() {
        return techid;
    }

    public void setTechid(Long techid) {
        this.techid = techid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Integer getAgilite() {
        return agilite;
    }

    public void setAgilite(Integer agilite) {
        this.agilite = agilite;
    }

    public Integer getForce() {
        return force;
    }

    public void setForce(Integer force) {
        this.force = force;
    }

    public Integer getIntelect() {
        return intelect;
    }

    public void setIntelect(Integer intelect) {
        this.intelect = intelect;
    }

    public Integer getMagie() {
        return magie;
    }

    public void setMagie(Integer magie) {
        this.magie = magie;
    }

    public Integer getEndurance() {
        return endurance;
    }

    public void setEndurance(Integer endurance) {
        this.endurance = endurance;
    }

    public Integer getCharisme() {
        return charisme;
    }

    public void setCharisme(Integer charisme) {
        this.charisme = charisme;
    }

    public SpecialisationEnum getSpe() {
        return spe;
    }

    public void setSpe(SpecialisationEnum spe) {
        this.spe = spe;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    
}
