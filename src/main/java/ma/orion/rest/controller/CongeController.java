package ma.orion.rest.controller;

import ma.orion.rest.model.Conge;
import ma.orion.rest.service.conge.CongeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class CongeController {

    @Autowired
    private CongeService congeService;



    @PostMapping("/conge")
    public ResponseEntity<Void> add(@RequestBody Conge conge) {
        this.congeService.add(conge);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    }

