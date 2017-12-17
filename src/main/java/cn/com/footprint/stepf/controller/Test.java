package cn.com.footprint.stepf.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/hehe")
public class Test {
	@RequestMapping("/hello")
//	@GetMapping("/hello")
	 public String toIndex(HttpServletRequest request,Model model){ 
		System.out.println("Controller");
        model.addAttribute("test", "AAAAAA");
        return "showUser";  
    }  
}
