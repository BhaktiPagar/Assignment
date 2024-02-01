package com.myblog1.serviceImpl;

import com.myblog1.entity.S3Object;
import com.myblog1.repository.S3ObjectRepository;
import com.myblog1.service.S3ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class S3ObjectServiceImpl implements S3ObjectService {

    @Autowired
    private S3ObjectRepository s3ObjectRepository;

    @Override
    public S3Object createS3Object(S3Object s3Object) {
        // Add any additional business logic or validations before saving
        return s3ObjectRepository.save(s3Object);
    }

    @Override
    public S3Object getS3ObjectById(Long id) {
        return s3ObjectRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("S3Object not found with id: " + id));
    }



}

