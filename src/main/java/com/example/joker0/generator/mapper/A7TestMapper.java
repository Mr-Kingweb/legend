package com.example.joker0.generator.mapper;
import org.apache.ibatis.annotations.Param;

import com.example.joker0.generator.domain.A7Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author JJ_un
* @description 针对表【A7_Test】的数据库操作Mapper
* @createDate 2023-08-03 15:05:49
* @Entity generator.domain.A7Test
*/
@Mapper
public interface A7TestMapper extends BaseMapper<A7Test> {

    /**
     * 被米num所有
     *
     * @param meterNum 计num
     * @return {@link List}<{@link A7Test}>
     */
    List<A7Test> getAllByMeterNum(@Param("meterNum") String meterNum);

    /**
     * 全国矿工工会获得计
     *
     * @return {@link List}<{@link String}>
     */
    List<String> getMeterNum();
}




