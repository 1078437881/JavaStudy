package com.wyb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.wyb.spring.entity.User;

/**
 * 
 * @author Administrator
 *Usercontroller 是一个基于注解的控制器
 *可以同时处理多个请求动作
 */
@Controller
public class UserController {

	/**
	 * RequestMapping 用来映射一个请求和请求的方法
	 * value="/register"表示请求由 register方法进行处理
	 */
	public String Register(@ModelAttribute("form")User user,Model model){
		// user:视图层传给控制层的表单对象;
		//model:控制返回给视图层的对象
		//在model中添加一个名为"user"的user对象
		System.out.println("控制器启动");
		model.addAttribute("user",user);
		return "success";
	}
}
