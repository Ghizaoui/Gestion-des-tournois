package tn.isi.devweb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "joeur")
public class Joeur {
    @Id
    private Long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "pays")
    private String Pays;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipe equipe;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id_joeur")
    private List<But> but;
}
