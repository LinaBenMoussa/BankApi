package tn.iit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.iit.entity.Compte;

import java.util.List;

public interface CompteRepository extends JpaRepository<Compte, Integer> {
    // Trouver les comptes par clientId
    List<Compte> findByClientId(Integer clientId);
}