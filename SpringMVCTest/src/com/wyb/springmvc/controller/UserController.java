package com.wyb.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.wyb.spring.entity.User;

/**
 * 
 * @author Administrator
 *Usercontroller ��һ������ע��Ŀ�����
 *����ͬʱ������������
 */
@Controller
public class UserController {

	/**
	 * RequestMapping ����ӳ��һ�����������ķ���
	 * value="/register"��ʾ������ register�������д���
	 */
	public String Register(@ModelAttribute("form")User user,Model model){
		// user:��ͼ�㴫�����Ʋ�ı�����;
		//model:���Ʒ��ظ���ͼ��Ķ���
		//��model�����һ����Ϊ"user"��user����
		System.out.println("����������");
		model.addAttribute("user",user);
		return "success";
	}
}
