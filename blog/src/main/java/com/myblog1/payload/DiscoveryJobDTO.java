package com.myblog1.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscoveryJobDTO {

    private String jobId;
    private List<EC2InstanceDTO> ec2Instances;
    private List<S3BucketDTO> s3Buckets;

}

