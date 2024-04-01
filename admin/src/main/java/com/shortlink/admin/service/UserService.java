package com.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shortlink.admin.dao.entity.UserDO;
import com.shortlink.admin.dto.req.UserLoginReqDTO;
import com.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名获取用户信息
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否存在
     * @param username 用户名
     * @return 用户名存在返回true，否则返回false
     */
    Boolean hasUsername(String username);

    /**
     * 注册用户
     * @param requestParam 用户注册请求参数
     */
    void registerUser(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户
     * @param requestParam 用户更新请求参数
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     * @param requestParam 用户登录请求参数
     * @return 用户登录返回参数 Token
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户是否登录
     * @param token 用户登录 Token
     * @param username 用户名
     * @return 用户是否登录标识
     */
    Boolean checkLogin(String username, String token);

    /**
     * 用户登出
     * @param username 用户名
     * @param token 用户登录 Token
     */
    void logout(String username, String token);
}
