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
 * 人
 *
 * @author 张代富
 * @since 2021-09-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 客户名
     */
    private String name;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 住址
     */
    private String address;

    /**
     * 创建时间
     */
    private LocalDateTime createAt;

    /**
     * 类型 0送猪 1拉猪
     */
    private Integer type;


}
