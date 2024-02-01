package com.myblog1.controller;

import com.myblog1.entity.S3Object;
import com.myblog1.service.S3ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/s3-objects")
public class S3ObjectController {

    @Autowired
    private S3ObjectService s3ObjectService;

    @PostMapping
    public ResponseEntity<S3Object> createS3Object(@RequestBody S3Object s3Object) {
        S3Object createdObject = s3ObjectService.createS3Object(s3Object);
        return new ResponseEntity<>(createdObject, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<S3Object> getS3ObjectById(@PathVariable Long id) {
        S3Object s3Object = s3ObjectService.getS3ObjectById(id);
        return new ResponseEntity<>(s3Object, HttpStatus.OK);
    }



}

