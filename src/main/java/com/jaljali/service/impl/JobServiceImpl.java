package com.jaljali.service.impl;

import com.jaljali.domain.Job;
import com.jaljali.provider.JobProvider;
import com.jaljali.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by music on 2017. 2. 5..
 */
@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobProvider jobProvider;

    @Override
    public List<Job> reads() {
        return jobProvider.reads();
    }

    @Override
    public Job read(Long id) {
        return jobProvider.read(id);
    }

    @Override
    public Long create(Job job) {
        return jobProvider.create(job);
    }

    @Override
    public void update(Job job) {
        jobProvider.update(job);
    }

    @Override
    public void delete(Long id) {
        jobProvider.delete(id);
    }
}
