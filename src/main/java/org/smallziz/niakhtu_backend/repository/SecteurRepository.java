package org.smallziz.niakhtu_backend.repository;


import org.smallziz.niakhtu_backend.entities.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecteurRepository extends JpaRepository<Secteur, Long> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}

