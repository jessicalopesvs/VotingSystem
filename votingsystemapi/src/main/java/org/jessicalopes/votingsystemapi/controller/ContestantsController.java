package org.jessicalopes.votingsystemapi.controller;

import lombok.AllArgsConstructor;

import org.jessicalopes.votingsystemapi.model.ContestantModel;
import org.jessicalopes.votingsystemapi.repository.ContestantRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/contestants")
@AllArgsConstructor
public class ContestantsController {

    private final ContestantRepo contestantRepository;

    @GetMapping("/status")
    public ResponseEntity<String> status(){
        return ResponseEntity.ok("Api Contestants Connected");
    }

    @PostMapping("/save")
    public ResponseEntity<ContestantModel> getContestant(@RequestBody ContestantModel contestant){
        ContestantModel entity = contestantRepository.save(contestant);
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/find")
    public ResponseEntity<ContestantModel> save(@RequestParam String id){
        Optional<ContestantModel> optParameter = contestantRepository.findById(id);
        return optParameter.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
