package com.guotie.mdc.sys.bubase.service.impl;

import java.util.Map;
import java.util.List;
import com.guotie.mdc.sys.bubase.entity.BaseDic;
import java.lang.Override;
import com.guotie.mdc.sys.bubase.mapper.BaseDicMapper;
import com.guotie.mdc.sys.bubase.service.BaseDicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guotie.mdc.sys.bubase.mapper.BaseDicMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *  Service接口实现类
 * @author lmy
 * @Description Created on 2019-09-11
 */
@Service
public class BaseDicServiceImpl extends ServiceImpl<BaseDicMapper,BaseDic> implements BaseDicService {


    @Override
    public List<BaseDic> selectByConditions(Map<String,Object> params){
    return baseMapper.selectByConditions(params);
    }
}