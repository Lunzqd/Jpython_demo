package com.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.base.ServiceBase;
import com.entity.TestEntity;
import com.interfaces.IFirstTest;
import com.mapper.FirstTestMapper;
import org.springframework.stereotype.Service;


@Service
public class FirstTestImpl extends ServiceBase<FirstTestMapper, TestEntity> implements IFirstTest {

    public TestEntity selectByCode(String code){
        try {
            EntityWrapper<TestEntity> condition = new EntityWrapper<>();
            condition.eq("code", code);
            TestEntity testModel = selectOne(condition);
            return testModel;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}