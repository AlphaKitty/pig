package com.zyl.pig.service.mvc.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 猪
 *
 * @author 张代富
 * @since 2021-09-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pig")
public class Pig implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 编号
     */
    private String identifier;

    /**
     * 重量
     */
    private Integer weight;

    /**
     * 入库价格
     */
    private Double inPrice;

    /**
     * 出库价格
     */
    private Integer outPrice;

    /**
     * 入库时间
     */
    private LocalDateTime inTime;

    /**
     * 出库时间
     */
    private LocalDateTime outTime;

    /**
     * 入库账单编号
     */
    private Long inCheckId;

    /**
     * 出库账单编号
     */
    private Long outCheckId;

    /**
     * 是否已出售
     */
    private Integer isSale;

    /**
     * 备注
     */
    private String comment;


}
