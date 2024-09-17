package org.smallziz.niakhtu_backend.repository;

import org.smallziz.niakhtu_backend.entities.Complainte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//page2
@RepositoryRestResource // nous permet de faire des Operations CRUD
public interface ComplainteRepository extends JpaRepository<Complainte, Long> {

}
