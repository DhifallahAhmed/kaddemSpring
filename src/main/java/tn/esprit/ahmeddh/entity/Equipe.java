package tn.esprit.ahmeddh.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;
    private String nomEquipe;
    //@Enumerated(EnumType.STRING)
    private String niveau;
    private int salle;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @ManyToMany(mappedBy = "equipe_etud")
    private Set<Etudiant> etudiants_equi;

}
