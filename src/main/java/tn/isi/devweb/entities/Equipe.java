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
@Table(name = "equipe")
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nom")
    private String nom;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipe")
    //@JoinColumn(name = "joeur_id")
    private List<Joeur> joeur;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id_equipe")
    private List<But> but;

    @OneToOne
    @JoinColumn(name = "pool_id_pool")
    private Pool pool;

}
