package com.shortlink.project.dto.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 短链接创建请求对象
 */
@Data
public class ShortLinkCreateReqDTO {


    /**
     * ID
     */
    private Long id;

    /**
     * 域名
     */
    private String domain;

    /**
     * 原始链接
     */
    private String originUrl;

    private String gid;

    private Integer createdType;

    private Integer validDateType;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date validDate;

    private String describe;
}
