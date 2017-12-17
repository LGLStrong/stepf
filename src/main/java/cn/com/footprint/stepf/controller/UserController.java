package cn.com.footprint.stepf.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.com.footprint.stepf.entity.User;
import cn.com.footprint.stepf.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Resource
	private UserService userService ;
	@RequestMapping("/showUser")
	 public String toIndex(HttpServletRequest request,Model model){ 
		System.out.println("showUser");
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user); 
        model.addAttribute("test", "AAAAAA");
        return "showUser";  
    }  
}
