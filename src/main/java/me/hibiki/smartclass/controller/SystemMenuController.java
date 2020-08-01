package me.hibiki.smartclass.controller;

import me.hibiki.smartclass.domain.SystemMenu;
import me.hibiki.smartclass.domain.SystemUser;
import me.hibiki.smartclass.service.SystemMenuService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 高弘昆
 * @date 2020/6/5 11:00
 */
@RestController
@RequestMapping(path = "/admin/menu")
public class SystemMenuController {
    @Resource
    private SystemMenuService systemMenuService;

    @GetMapping
    public List<SystemMenu> listSystemMenus(HttpSession httpSession) {
        SystemUser loginUser =(SystemUser) httpSession.getAttribute("loginUser");
        return systemMenuService.listByRolePidSystemMenus(loginUser.getRolePid());
    }

}
