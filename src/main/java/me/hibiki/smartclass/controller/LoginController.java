package me.hibiki.smartclass.controller;

import me.hibiki.smartclass.domain.SystemUser;
import me.hibiki.smartclass.service.SystemRoleMenuService;
import me.hibiki.smartclass.service.SystemUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 高弘昆
 * @date 2020/6/15 18:37
 */
@Controller

public class LoginController {
    @Resource
    private SystemUserService systemUserService;
    @Resource
    private SystemRoleMenuService systemRoleMenuService;

    @PostMapping(path = "/login")
    @ResponseBody
    public Map<String, Integer> login(String userName, String userPassword, HttpSession httpSession) {
        SystemUser loginUser = systemUserService.getUserByLogin(userName, userPassword);
        Map<String, Integer> map = new HashMap<>();
        if (loginUser == null) {
            map.put("success", 0);
        } else {
            httpSession.setAttribute("loginUser", loginUser);
            httpSession.setAttribute("menuIds", systemRoleMenuService.listByRolePidMenuIds(loginUser.getRolePid()));
            map.put("success", 1);
        }
        return map;
    }

    @GetMapping(path = "/admin/logout")
    public String logout(HttpServletRequest request) {

        request.getSession().removeAttribute("loginUser");
        return "redirect:/login.html";
    }
}
