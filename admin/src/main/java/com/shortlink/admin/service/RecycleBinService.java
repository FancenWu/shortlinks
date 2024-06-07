package com.shortlink.admin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.shortlink.admin.common.convention.result.Result;
import com.shortlink.admin.remote.dto.req.ShortLinkRecycleBinPageReqDTO;
import com.shortlink.admin.remote.dto.resp.ShortLinkPageRespDTO;

/**
 * 回收站管理接口层
 */
public interface RecycleBinService {


    /**
     * 分页查询回收站短链接
     * @param requestParam 请求参数
     * @return 短链接分页返回结果
     */
    Result<IPage<ShortLinkPageRespDTO>> pageRecycleBinShortLink(ShortLinkRecycleBinPageReqDTO requestParam);
}
