package com.example.joker0.generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * a7测试
 *
 * @author JJ_un
 * @TableName A7_Test
 * @date 2023/08/03
 */
@TableName(value ="A7_Test")
@Data
public class A7Test implements Serializable {
    /**
     * 
     */
    private Date millisecond;

    /**
     * 
     */
    private String meterNum;

    /**
     * 
     */
    private BigDecimal pwrUp;

    /**
     * 
     */
    private BigDecimal pwrDown;

    /**
     * 
     */
    private Integer fhl;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}