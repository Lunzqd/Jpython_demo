package com.interfaces;

import com.base.IServiceBase;
import com.entity.TestEntity;

public interface IFirstTest extends IServiceBase<TestEntity> {

    TestEntity selectByCode(String code);
    
}