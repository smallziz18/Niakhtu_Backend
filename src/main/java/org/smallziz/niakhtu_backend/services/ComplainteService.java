package org.smallziz.niakhtu_backend.services;

import lombok.Data;
import org.smallziz.niakhtu_backend.entities.Complainte;
import org.smallziz.niakhtu_backend.repository.ComplainteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;
//page 4
@Data
@Service
public class ComplainteService {

    private ComplainteRepository complainteRepository;

    public List<Complainte> getAllComplaintes() {
        return complainteRepository.findAll();
    }

    public Optional<Complainte> getComplainteById(Long id) {
        return complainteRepository.findById(id);
    }
    public void creer(Complainte complainte) {
        this.complainteRepository.save(complainte);
    }

    public void deleteComplainte(Long id) {
        complainteRepository.deleteById(id);
    }
    //update
    public void updateComplainte(Complainte complainte){
        this.complainteRepository.save(complainte);
    }

}
