package com.myblog1.controller;

import com.myblog1.entity.DiscoveryJob;
import com.myblog1.service.DiscoveryJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/discovery-jobs")
public class DiscoveryJobController {

    @Autowired
    private DiscoveryJobService discoveryJobService;

    @PostMapping
    public ResponseEntity<DiscoveryJob> createDiscoveryJob(@RequestBody DiscoveryJob discoveryJob) {
        DiscoveryJob createdJob = discoveryJobService.createDiscoveryJob(discoveryJob);
        return new ResponseEntity<>(createdJob, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiscoveryJob> getDiscoveryJobById(@PathVariable Long id) {
        DiscoveryJob job = discoveryJobService.getDiscoveryJobById(id);
        return new ResponseEntity<>(job, HttpStatus.OK);
    }



}

