package com.hmdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hmdp.model.dto.LoginFormDTO;
import com.hmdp.model.dto.Result;
import com.hmdp.model.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author codejuzi
 */
public interface IUserService extends IService<User> {

    /**
     * 生成验证码
     *
     * @param phone   手机号
     * @param session session
     * @return
     */
    Result sendCode(String phone, HttpSession session);

    /**
     * 用户登录
     *
     * @param loginForm 登录表单信息
     * @param session   session
     * @return
     */
    Result login(LoginFormDTO loginForm, HttpSession session);

    /**
     * 用户登出
     *
     * @param request request
     * @return
     */
    Result logout(HttpServletRequest request);

    /**
     * 用户签到
     *
     * @return ok
     */
    Result sign();

    /**
     * 统计用户签到次数
     *
     * @return 次数
     */
    Result signCount();
}
