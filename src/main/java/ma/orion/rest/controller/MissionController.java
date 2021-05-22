package ma.orion.rest.controller;


import ma.orion.rest.model.Mission;

import ma.orion.rest.service.mission.MissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class MissionController {

    @Autowired
    private MissionService missionService;


    @GetMapping("/missions")
    public ResponseEntity<List<Mission>> get() {
        return new ResponseEntity<>(this.missionService.getAll(), HttpStatus.OK);
    }


}
