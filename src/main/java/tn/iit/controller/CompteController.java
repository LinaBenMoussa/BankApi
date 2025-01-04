package tn.iit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.iit.entity.Compte;
import tn.iit.service.CompteService;

import java.util.List;

@RestController
@RequestMapping("/comptes")
public class CompteController {
    @Autowired
    private CompteService compteService;

    @PostMapping
    public ResponseEntity<Compte> createCompte(@RequestBody Compte compte) {
        Compte savedCompte = compteService.saveCompte(compte);
        return ResponseEntity.ok(savedCompte);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Compte> getCompteById(@PathVariable Integer id) {
        return compteService.getCompteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping
    public ResponseEntity<List<Compte>> getAllComptes() {
        List<Compte> comptes = compteService.getAllComptes();
        return ResponseEntity.ok(comptes);
    }

    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<Compte>> getComptesByClientId(@PathVariable Integer clientId) {
        List<Compte> comptes = compteService.getComptesByClientId(clientId);
        return ResponseEntity.ok(comptes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompte(@PathVariable Integer id) {
        compteService.deleteCompte(id);
        return ResponseEntity.noContent().build();
    }
}
