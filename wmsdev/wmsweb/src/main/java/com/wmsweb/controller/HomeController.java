package com.wmsweb.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.auth.client.AuthenticationClient;
import com.wmsweb.beans.SpringBean;

import wmsdata.UserBean;

@Controller
public class HomeController {
	
	@Autowired
	SpringBean bean;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/test")
	public @ResponseBody String testMessage() {
		return bean.getMessage();
	}
	
	@RequestMapping(value="/loginPage")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/authenticate")
	public @ResponseBody String authenticate(UserBean bean) {
		String out = null;
		AuthenticationClient ac = new AuthenticationClient();
		/*UserBean bean = new UserBean();
		bean.setUserName("root");
		bean.setPassword("root@123");*/
		if (ac.authenticate(bean))
			out = "Logged in successfully";
		else
			out = "Failed to login";
		return out;
	}
}
