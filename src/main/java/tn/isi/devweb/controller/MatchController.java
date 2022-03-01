package tn.isi.devweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tn.isi.devweb.entities.Match;
import tn.isi.devweb.services.MatchService;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {
    @Autowired
    public MatchService matchService;
    @PostMapping("/addmatch")
    public void saveMatch(@RequestBody Match m)
    {
        matchService.createMatch(m);
    }
    @PutMapping("/update")
    public Match updateMatch(@RequestBody Match m)
    {
        return matchService.updateMatch(m);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteMatch(@PathVariable  Long id)
    {
        matchService.deleteMatch(id);

    }
    @GetMapping("/get/all")
    public List<Match> allMatch()
    {
        return matchService.allMatch();
    }
    @GetMapping("/get/{id}")
    public Match getMatch(@PathVariable  Long id)
    {
        return matchService.getMatch(id);
    }
}
