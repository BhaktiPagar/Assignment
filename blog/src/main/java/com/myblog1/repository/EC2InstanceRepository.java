package com.myblog1.repository;

import com.myblog1.entity.EC2Instance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EC2InstanceRepository extends JpaRepository<EC2Instance, Long> {
}

