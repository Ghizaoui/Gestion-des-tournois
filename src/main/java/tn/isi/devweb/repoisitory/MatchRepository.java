package tn.isi.devweb.repoisitory;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import tn.isi.devweb.entities.Match;

@Repository

public interface MatchRepository extends JpaRepository<Match,Long> {

}
