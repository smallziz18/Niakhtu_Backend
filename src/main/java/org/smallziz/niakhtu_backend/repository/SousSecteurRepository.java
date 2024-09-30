package org.smallziz.niakhtu_backend.repository;


import org.smallziz.niakhtu_backend.entities.SousSecteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SousSecteurRepository extends JpaRepository<SousSecteur, Long> {
    // Méthodes de requêtes personnalisées si besoin
}

