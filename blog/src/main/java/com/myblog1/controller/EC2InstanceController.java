package com.myblog1.controller;

import com.myblog1.entity.EC2Instance;
import com.myblog1.service.EC2InstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ec2-instances")
public class EC2InstanceController {

    @Autowired
    private EC2InstanceService ec2InstanceService;

    @PostMapping
    public ResponseEntity<EC2Instance> createEC2Instance(@RequestBody EC2Instance ec2Instance) {

        EC2Instance createdInstance = ec2InstanceService.createEC2Instance(ec2Instance);
        return new ResponseEntity<>(createdInstance, HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<EC2Instance> getEC2InstanceById(@PathVariable Long id) {
        EC2Instance ec2Instance = ec2InstanceService.getEC2InstanceById(id);
        return new ResponseEntity<>(ec2Instance, HttpStatus.OK);
    }


}

