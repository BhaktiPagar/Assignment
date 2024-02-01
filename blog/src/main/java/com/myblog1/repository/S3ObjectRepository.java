package com.myblog1.repository;

import com.myblog1.entity.S3Object;
import org.springframework.data.jpa.repository.JpaRepository;

public interface S3ObjectRepository extends JpaRepository<S3Object, Long> {
}

