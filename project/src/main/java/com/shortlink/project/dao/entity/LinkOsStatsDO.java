package com.shortlink.project.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.shortlink.project.common.database.BaseDO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 操作系统统计访问实体
 */
@Data
@TableName("t_link_os_stats")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LinkOsStatsDO extends BaseDO {

    /**
     * ID
     */
    private Long id;

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 完整短链接
     */
    private String fullShortUrl;

    /**
     * 日期
     */
    private Date date;

    /**
     * 访问量
     */
    private Integer cnt;

    /**
     * 操作系统名称
     */
    private String os;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 删除标识 0:未删除 1:已删除
     */
    private Integer delFlag;





}
