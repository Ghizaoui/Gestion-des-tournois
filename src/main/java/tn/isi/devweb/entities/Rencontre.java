package tn.isi.devweb.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rencontre")
@Data

public class Rencontre implements Serializable {
    @Id
    @OneToOne(optional = false)
    @JoinColumn(name = "id_match_id", nullable = false)
    private Match id_match;

    @Id
    @OneToOne(optional = false)
    @JoinColumn(name = "id_equipe_id", nullable = false)
    private Equipe id_equipe;

    @Column(name = "score")
    private  int score;




}
