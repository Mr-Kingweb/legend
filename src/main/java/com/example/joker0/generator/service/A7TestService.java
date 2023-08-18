package com.example.joker0.generator.service;

import com.example.joker0.generator.domain.A7Test;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author JJ_un
* @description 针对表【A7_Test】的数据库操作Service
* @createDate 2023-08-03 15:05:49
*/
public interface A7TestService extends IService<A7Test> {
    /**
     * 被米num所有
     *
     * @param meterNum 计num
     * @return {@link List}<{@link A7Test}>
     */
    List<A7Test> getAllByMeterNum(String meterNum);

    /**
     * 得到所有计num
     *
     * @return {@link List}<{@link String}>
     */
    List<String> getAllMeterNum();
}
