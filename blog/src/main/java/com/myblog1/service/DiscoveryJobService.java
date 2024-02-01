package com.myblog1.service;

import com.myblog1.entity.DiscoveryJob;

public interface DiscoveryJobService {
    DiscoveryJob createDiscoveryJob(DiscoveryJob discoveryJob);

    DiscoveryJob getDiscoveryJobById(Long id);

}
