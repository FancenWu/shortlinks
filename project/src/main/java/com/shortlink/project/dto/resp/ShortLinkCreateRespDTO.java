package com.shortlink.project.dto.resp;

import lombok.*;

/**
 * 短链接创建响应对象
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShortLinkCreateRespDTO {

    private String gid;


    private String originUrl;


    private String fullShortUrl;


}
