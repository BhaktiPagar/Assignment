package com.myblog1.controller;

import com.myblog1.entity.JobResult;
import com.myblog1.service.JobResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/job-results")
public class JobResultController {

    @Autowired
    private JobResultService jobResultService;

    @PostMapping
    public ResponseEntity<JobResult> createJobResult(@RequestBody JobResult jobResult) {
        JobResult createdResult = jobResultService.createJobResult(jobResult);
        return new ResponseEntity<>(createdResult, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobResult> getJobResultById(@PathVariable Long id) {
        JobResult jobResult = jobResultService.getJobResultById(id);
        return new ResponseEntity<>(jobResult, HttpStatus.OK);
    }



}

