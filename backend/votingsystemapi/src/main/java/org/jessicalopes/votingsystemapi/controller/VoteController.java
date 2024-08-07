package org.jessicalopes.votingsystemapi.controller;

import lombok.AllArgsConstructor;

import org.jessicalopes.votingsystemapi.model.ContestantModel;
import org.jessicalopes.votingsystemapi.service.VoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/vote")
@AllArgsConstructor
@CrossOrigin
public class VoteController {

    private final VoteService service;

    @PostMapping
    public ResponseEntity<String> vote (@RequestBody ContestantModel contestant){
        service.addEvent(contestant);

        return ResponseEntity.ok("Vote added");
    }
}
