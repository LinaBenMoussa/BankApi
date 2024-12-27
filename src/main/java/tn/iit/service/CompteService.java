package tn.iit.service;

import org.springframework.stereotype.Service;
import tn.iit.entity.Compte;
import tn.iit.repository.CompteRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CompteService {
    private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    public Optional<Compte> getCompteById(Integer id) {
        return compteRepository.findById(id);
    }

    public List<Compte> getComptesByClientId(Integer clientId) {
        return compteRepository.findByClientId(clientId);
    }

    public void deleteCompte(Integer id) {
        compteRepository.deleteById(id);
    }
}
