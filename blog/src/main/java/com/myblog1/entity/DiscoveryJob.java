package com.myblog1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscoveryJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobId;

    @OneToMany(mappedBy = "discoveryJob", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EC2Instance> ec2Instances;

    @OneToMany(mappedBy = "discoveryJob", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<S3Bucket> s3Buckets;


}
