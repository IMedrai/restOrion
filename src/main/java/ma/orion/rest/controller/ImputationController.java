package ma.orion.rest.controller;


import ma.orion.rest.model.Imputation;

import ma.orion.rest.service.imputation.ImputationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;


@RestController
@RequestMapping("/api")
public class ImputationController {

    @Autowired
    private ImputationService imputationService;


    @PostMapping("/imputations")
    public ResponseEntity<Void> add(@RequestBody Imputation imputation) {
        this.imputationService.add(imputation);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping("/imputations")
    public ResponseEntity<List<Imputation>>getByDate(@RequestParam String date) {
        return new ResponseEntity<>(this.imputationService.getByDate(date),HttpStatus.OK);
    }


}
