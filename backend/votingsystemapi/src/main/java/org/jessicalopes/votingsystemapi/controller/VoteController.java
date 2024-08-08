package org.jessicalopes.votingsystemapi.controller;

import lombok.AllArgsConstructor;

import org.jessicalopes.votingsystemapi.model.ContestantModel;
import org.jessicalopes.votingsystemapi.repository.ContestantRepo;
import org.jessicalopes.votingsystemapi.service.VoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/vote")
@AllArgsConstructor
@CrossOrigin
public class VoteController {

    private final VoteService service;
    private final ContestantRepo contestantRepo;

    @PostMapping
    public ResponseEntity<ContestantModel> vote (@RequestBody ContestantModel contestant){
        Optional<ContestantModel> responseOpt = contestantRepo.findById(contestant.getId());
        if(responseOpt.isEmpty()){
            throw new RuntimeException("Code ["+contestant.getId()+"] Not Found");
        }

        ContestantModel response = responseOpt.get();
        service.addEvent(response);

        return ResponseEntity.ok(response);
    }
}
