package org.smallziz.niakhtu_backend;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "type_plainte")
public class TypePlainte {
    @Id
    @Size(max = 50)
    @Column(name = "TYPE_PLAINTE_CODE", nullable = false, length = 50)
    private String typePlainteCode;

    @Size(max = 255)
    @NotNull
    @Column(name = "TYPE_PLAINTE_LIBELLE", nullable = false)
    private String typePlainteLibelle;

    @Column(name = "TYPE_PLAINTE_ORDRE")
    private Long typePlainteOrdre;

}