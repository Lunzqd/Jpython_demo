package com.base;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

public class ServiceBase<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements IServiceBase<T> {

}
