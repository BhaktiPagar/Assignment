package com.myblog1.service;

import com.myblog1.entity.EC2Instance;

public interface EC2InstanceService {
    EC2Instance createEC2Instance(EC2Instance ec2Instance);

    EC2Instance getEC2InstanceById(Long id);

}
