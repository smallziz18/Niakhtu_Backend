package org.smallziz.niakhtu_backend;

import org.smallziz.niakhtu_backend.entities.Complainte;
import org.smallziz.niakhtu_backend.web.ComplainteRestController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@SpringBootApplication
public class NiakhtuBackendApplication {


    public NiakhtuBackendApplication(ComplainteRestController complainteRestController) {}
    public static void main(String[] args) {

        SpringApplication.run(NiakhtuBackendApplication.class, args);
    }


    }


