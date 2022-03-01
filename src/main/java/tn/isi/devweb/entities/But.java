package tn.isi.devweb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "but")
public class But {
    @Id
    private  Long id;

    @ManyToOne
    @JoinColumn(name = "id_match_id")
    private Match id_match;

    @ManyToOne
    @JoinColumn(name = "id_equipe_id")
    private Equipe id_equipe;
    @ManyToOne
    @JoinColumn(name = "id_joeur_id")
    private Joeur id_joeur;
    @Column(name = "minute")
    private Time  minute;
}
