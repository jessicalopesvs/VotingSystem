package org.jessicalopes.votingsystemapi.controller;


import org.jessicalopes.votingsystemapi.model.ParameterModel;
import org.jessicalopes.votingsystemapi.repository.ParameterRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/parameters")
public class ParameterController {

    private final ParameterRepo parameterRepo;

    public ParameterController(ParameterRepo parameterRepo) {
        this.parameterRepo = parameterRepo;
    }

    @GetMapping("/status")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok("Api Parameters Connected");
    }

    @PostMapping("/save")
    public ResponseEntity<ParameterModel> getParameters(@RequestBody ParameterModel parameter) {
        ParameterModel entity = parameterRepo.save(parameter);
        return ResponseEntity.ok(entity);
    }

    @GetMapping("/find")
    public ResponseEntity<ParameterModel> save(@RequestParam String key) {
        Optional<ParameterModel> optParameter = parameterRepo.findById(key);
        return optParameter.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
