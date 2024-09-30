package org.smallziz.niakhtu_backend.execptions;



public class CiblePriveeNotFoundException extends RuntimeException {
    public CiblePriveeNotFoundException(Long id) {
        super("Cible privée avec ID " + id + " non trouvée.");
    }
}

