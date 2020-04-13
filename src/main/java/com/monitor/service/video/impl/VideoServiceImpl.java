package com.monitor.service.video.impl;

import com.monitor.dao.VideoMapper;
import com.monitor.service.video.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;


    @Override
    public List queryVideoList() {
        return videoMapper.queryVideoList();
    }
}
