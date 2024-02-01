package com.myblog1.serviceImpl;

import com.myblog1.entity.DiscoveryJob;
import com.myblog1.repository.DiscoveryJobRepository;
import com.myblog1.service.DiscoveryJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class DiscoveryJobServiceImpl implements DiscoveryJobService {

    @Autowired
    private DiscoveryJobRepository discoveryJobRepository;

    @Override
    public DiscoveryJob createDiscoveryJob(DiscoveryJob discoveryJob) {
        // Add any additional business logic or validations before saving
        return discoveryJobRepository.save(discoveryJob);
    }

    @Override
    public DiscoveryJob getDiscoveryJobById(Long id) {
        return discoveryJobRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("DiscoveryJob not found with id: " + id));
    }



}

