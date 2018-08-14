package com.coupon.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coupon.pojo.User;
import com.coupon.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	
	 @Resource  
	 private IUserService userService;  
      
	 @RequestMapping("/userList")  
	 public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "userList";  
	 }  
}
