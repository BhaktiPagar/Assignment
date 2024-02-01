package com.myblog1.serviceImpl;

import com.myblog1.entity.EC2Instance;
import com.myblog1.repository.EC2InstanceRepository;
import com.myblog1.service.EC2InstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class EC2InstanceServiceImpl implements EC2InstanceService {

    @Autowired
    private EC2InstanceRepository ec2InstanceRepository;

    @Override
    public EC2Instance createEC2Instance(EC2Instance ec2Instance) {
        // Add any additional business logic or validations before saving
        return ec2InstanceRepository.save(ec2Instance);
    }


    public EC2Instance getEC2InstanceById(Long id) {
        return ec2InstanceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("EC2Instance not found with id: " + id));
    }



}

