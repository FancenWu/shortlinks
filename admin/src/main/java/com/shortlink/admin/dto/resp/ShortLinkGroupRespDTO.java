package com.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * 短链接分组持久层
 */
@Data
public class ShortLinkGroupRespDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名称
     */
    private String name;


    /**
     * 分组排序
     */
    private Integer sortOrder;

    /**
     * 短链接分组里的短链接数量
     */
    private Integer shortLinkCount;

}
