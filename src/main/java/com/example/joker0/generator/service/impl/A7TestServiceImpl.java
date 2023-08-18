package com.example.joker0.generator.service.impl;
import java.util.ArrayList;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.joker0.generator.domain.A7Test;
import com.example.joker0.generator.service.A7TestService;
import com.example.joker0.generator.mapper.A7TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author JJ_un
* @description 针对表【A7_Test】的数据库操作Service实现
* @createDate 2023-08-03 15:05:49
*/
@Service
public class A7TestServiceImpl extends ServiceImpl<A7TestMapper, A7Test>
    implements A7TestService{

    @Autowired
    private A7TestMapper a7TestMapper;

    @Override
    public List<A7Test> getAllByMeterNum(String meterNum) {
        return a7TestMapper.getAllByMeterNum(meterNum);
    }

    @Override
    public List<String> getAllMeterNum() {
        return a7TestMapper.getMeterNum();
    }
}




