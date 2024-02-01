package com.myblog1.service;

import com.myblog1.entity.S3Object;

public interface S3ObjectService {
    S3Object createS3Object(S3Object s3Object);

    S3Object getS3ObjectById(Long id);

}
