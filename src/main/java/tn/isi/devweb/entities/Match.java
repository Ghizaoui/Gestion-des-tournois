package tn.isi.devweb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "matchs")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "dt")
   private Date dt;

    @Column(name = "lieu")
    private String lieu;

    @ManyToOne
    @JoinColumn(name = "arbitre_id")
    private Arbitre arbitre;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "id_match")
    private List<But> but;

}
