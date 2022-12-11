package tn.esprit.ahmeddh.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepart;
    private String nomDepart;
    private float surface;
    private String emplacement;
    private float prix;
    @OneToMany(mappedBy = "departement",cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants_depar;


}

