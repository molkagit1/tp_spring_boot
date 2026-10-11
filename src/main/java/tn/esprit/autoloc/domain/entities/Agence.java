package tn.esprit.autoloc.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "agence")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    private Set<Employe> employes = new HashSet<>();

    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    private Set<Vehicule> vehicules = new HashSet<>();
}