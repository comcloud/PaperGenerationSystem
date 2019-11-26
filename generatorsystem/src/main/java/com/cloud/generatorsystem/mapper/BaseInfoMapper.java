package com.cloud.generatorsystem.mapper;

import com.cloud.generatorsystem.model.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BaseInfoMapper {
    void saveData(Teacher teacher);
}
