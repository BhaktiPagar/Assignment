package com.myblog1.service;

import com.myblog1.entity.S3Bucket;

public interface S3BucketService {
    S3Bucket createS3Bucket(S3Bucket s3Bucket);

    S3Bucket getS3BucketById(Long id);

}
