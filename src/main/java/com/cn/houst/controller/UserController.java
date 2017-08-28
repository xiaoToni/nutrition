package com.cn.houst.controller;

import com.cn.houst.pojo.User;
import com.cn.houst.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
  
  
@Controller
@RequestMapping("/user")
public class UserController {  
    @Resource  
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){
        try {
            int userId = Integer.parseInt(request.getParameter("id"));
            System.out.println(userId);
            User user = this.userService.getUserById(userId);
            model.addAttribute("user", user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "showUser";
    }  
}  
