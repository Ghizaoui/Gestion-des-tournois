package tn.isi.devweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.isi.devweb.entities.Arbitre;
import tn.isi.devweb.services.ArbitreService;

import java.util.List;

@RestController
@RequestMapping("/arbitre")
public class ArbitreController {
    @Autowired
    private ArbitreService arbitreController;
    @PostMapping("/addArbitre")
    public void saveArbitre(@RequestBody Arbitre a)
    {
        arbitreController.addArbitre(a);
    }
    @DeleteMapping("/deleteArbitre/{id}")
    public void deleteArbitre(@PathVariable  Long id)
    {
        arbitreController.deleteArbitre(id);
    }
    @GetMapping("/getArbitre/{id}")
    public  Arbitre getArbitre(@PathVariable Long id)
    {
        return arbitreController.showArbitre(id);
    }
    @GetMapping("/allArbitre")
    public List<Arbitre> allArbitre()
    {
        return arbitreController.allArbitre();
    }
}
