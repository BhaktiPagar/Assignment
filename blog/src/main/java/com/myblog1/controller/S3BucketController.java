package com.myblog1.controller;

import com.myblog1.entity.S3Bucket;
import com.myblog1.service.S3BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/s3-buckets")
public class S3BucketController {

    @Autowired
    private S3BucketService s3BucketService;

    @PostMapping
    public ResponseEntity<S3Bucket> createS3Bucket(@RequestBody S3Bucket s3Bucket) {
        S3Bucket createdBucket = s3BucketService.createS3Bucket(s3Bucket);
        return new ResponseEntity<>(createdBucket, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<S3Bucket> getS3BucketById(@PathVariable Long id) {
        S3Bucket s3Bucket = s3BucketService.getS3BucketById(id);
        return new ResponseEntity<>(s3Bucket, HttpStatus.OK);
    }


}

