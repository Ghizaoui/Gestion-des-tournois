package tn.isi.devweb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pool")
public class Pool {
    @Id
    private Long id_pool;

    @OneToOne
    @JoinColumn(name = "id_equipe_id")
    private  Equipe id_equipe;
    @Column(name = "points")
    private  int points;
}
