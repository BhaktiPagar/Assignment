package com.myblog1.repository;

import com.myblog1.entity.S3Bucket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface S3BucketRepository extends JpaRepository<S3Bucket, Long> {
}

