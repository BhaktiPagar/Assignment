package com.myblog1.serviceImpl;

import com.myblog1.entity.JobResult;
import com.myblog1.repository.JobResultRepository;
import com.myblog1.service.JobResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class JobResultServiceImpl implements JobResultService {

    @Autowired
    private JobResultRepository jobResultRepository;

    @Override
    public JobResult createJobResult(JobResult jobResult) {
        // Add any additional business logic or validations before saving
        return jobResultRepository.save(jobResult);
    }

    @Override
    public JobResult getJobResultById(Long id) {
        return jobResultRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("JobResult not found with id: " + id));
    }



}

