package com.myblog1.service;

import com.myblog1.entity.JobResult;

public interface JobResultService {
    JobResult createJobResult(JobResult jobResult);

    JobResult getJobResultById(Long id);


}
