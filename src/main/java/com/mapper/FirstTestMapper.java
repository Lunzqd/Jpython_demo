package com.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.entity.TestEntity;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FirstTestMapper extends BaseMapper<TestEntity> {
}