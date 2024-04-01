package com.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;

/**
 * 用户持久层实体
 */
@Data
@TableName("t_user")
public class UserDO {

    private Long id;
    @Getter
    private String username;
    private String password;
    private String realName;
    private String phone;
    private String mail;
    private Long deletionTime;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 删除标识 0：未删除 1：已删除
     */
    @TableField(fill = FieldFill.INSERT)
    private Integer delFlag;

    // Getter and Setter

}
