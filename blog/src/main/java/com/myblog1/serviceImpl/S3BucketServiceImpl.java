package com.myblog1.serviceImpl;

import com.myblog1.entity.S3Bucket;
import com.myblog1.repository.S3BucketRepository;
import com.myblog1.service.S3BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class S3BucketServiceImpl implements S3BucketService {

    @Autowired
    private S3BucketRepository
            s3BucketRepository;

    @Override
    public S3Bucket createS3Bucket(S3Bucket s3Bucket) {
        // Add any additional business logic or validations before saving
        return s3BucketRepository.save(s3Bucket);
    }

    @Override
    public S3Bucket getS3BucketById(Long id) {
        return s3BucketRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("S3Bucket not found with id: " + id));
    }



}

