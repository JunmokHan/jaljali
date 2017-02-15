package com.jaljali.provider.impl;

import com.jaljali.domain.Job;
import com.jaljali.mapper.JobMapper;
import com.jaljali.provider.JobProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by music on 2017. 2. 5..
 */
@Repository
public class JobProviderImpl implements JobProvider {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public List<Job> reads() {
        return jobMapper.reads();
    }

    @Override
    public Job read(Long id) {
        return jobMapper.read(id);
    }

    @Override
    public Long create(Job job) {
        jobMapper.create(job);
        return job.getId();
    }

    @Override
    public void update(Job job) {
        jobMapper.update(job);
    }

    @Override
    public void delete(Long id) {
        jobMapper.delete(id);
    }
}
