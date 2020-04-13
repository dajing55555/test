package com.monitor.service.environment.impl;

import com.monitor.dao.EnvironmentMapper;
import com.monitor.service.environment.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvironmentServiceImpl implements EnvironmentService {

    @Autowired
    private EnvironmentMapper environmentMapper;


    @Override
    public List queryEnvironmentList() {
        return environmentMapper.queryEnvironmentList();
    }
}
