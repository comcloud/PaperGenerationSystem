package com.cloud.generatorsystem.service.impl;

import com.cloud.generatorsystem.mapper.BaseInfoMapper;
import com.cloud.generatorsystem.model.Teacher;
import com.cloud.generatorsystem.service.BaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseInfoServiceImpl implements BaseInfoService {

    @Autowired
    private BaseInfoMapper baseInfoMapper;

    @Override
    public void saveData(Teacher teacher) {
        baseInfoMapper.saveData(teacher);
    }
}
