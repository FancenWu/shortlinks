package com.shortlink.admin.controller;

import com.shortlink.admin.common.convention.result.Result;
import com.shortlink.admin.common.enums.UserErrorCodeEnum;
import com.shortlink.admin.dto.resp.UserRespDTO;
import com.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理层
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    /**
     * 根据用户名获取用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        UserRespDTO result = userService.getUserByUsername(username);
        if (result == null) {
            return new Result<UserRespDTO>().setCode(UserErrorCodeEnum.USER_NULL.code())
                    .setMessage(UserErrorCodeEnum.USER_NULL.message());
        } else{
            return new Result<UserRespDTO>().setData(result).setCode("0").setMessage("查询成功");
        }
    }
}
