package com.homeTeam.pfe_V4.controller;

import com.homeTeam.pfe_V4.entity.Projet;
import com.homeTeam.pfe_V4.entity.Tache;
import com.homeTeam.pfe_V4.repositorie.ProjetRepository;
import com.homeTeam.pfe_V4.service.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProjetController {
    @Autowired
    private ProjetService projetService;

    @PostMapping("/addProjet")
    public Projet addProjet(@RequestBody Projet projet) {
        return projetService.saveProjet(projet);
    }

    @PostMapping("/addProducts")
    public List<Projet>addProjets(@RequestBody List<Projet> projets) {
        return projetService.saveProjets(projets);
    }

    @GetMapping("/projets")
    public List<Projet> findAllProjets() {
        return projetService.getProjets();
    }

    @GetMapping("/projetById/{id}")
    public Projet findProjetById(@PathVariable int id) {
        return projetService.getProductById(id);
    }

    @PutMapping("/updateProjetById/{id}")
    public Projet updateProjet(@PathVariable int id,@RequestBody Projet projet) {
        return projetService.updateProjet(id,projet);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProjet(@PathVariable int id) {
        return projetService.deleteProjet(id);
    }
}