package com.shortlink.project.service;

/**
 * URL 标题接口层
 */
public interface UrlTitleService {

    /**
     * 根据URL 获取对应网站的标题
     * @param url 目标网站地址
     * @return 网站标题
     */
    String getTitleByUrl(String url);
}
