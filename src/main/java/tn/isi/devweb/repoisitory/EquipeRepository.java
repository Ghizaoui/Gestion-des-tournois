package tn.isi.devweb.repoisitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.isi.devweb.entities.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Long> {
}
