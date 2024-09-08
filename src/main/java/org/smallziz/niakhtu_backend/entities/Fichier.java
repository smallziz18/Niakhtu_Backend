package org.smallziz.niakhtu_backend.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "fichier")
public class Fichier {
    @Id
    @Column(name = "FIC_ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPLAINTE_ID")
    private Complainte complainte;

    @Size(max = 255)
    @NotNull
    @Column(name = "FIC_NOM", nullable = false)
    private String ficNom;

    @Size(max = 255)
    @NotNull
    @Column(name = "FIC_CHEMIN", nullable = false)
    private String ficChemin;

    @NotNull
    @Column(name = "FIC_DATE_HEURE", nullable = false)
    private Instant ficDateHeure;

    @NotNull
    @Column(name = "FIC_TYPE", nullable = false)
    private Integer ficType;

    @NotNull
    @Column(name = "FIC_AUTEUR", nullable = false)
    private Long ficAuteur;

    @Column(name = "FIC_ORDRE")
    private Integer ficOrdre;

    @Size(max = 255)
    @Column(name = "FIC_COMMENT")
    private String ficComment;

}