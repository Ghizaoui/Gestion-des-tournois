package tn.isi.devweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.isi.devweb.entities.Arbitre;
import tn.isi.devweb.repoisitory.ArbitreRepository;

import java.util.List;

@Service
public class ArbitreService {
    @Autowired
    private ArbitreRepository arbitreService;

    public void addArbitre(Arbitre a)
    {
        arbitreService.save(a);
    }
    public void deleteArbitre(Long id)
    {
        arbitreService.deleteById(id);
    }
    public Arbitre showArbitre(Long id)
    {
     return    arbitreService.findById(id).get();
    }
    public List<Arbitre> allArbitre()
    {
        return arbitreService.findAll();
    }
}
