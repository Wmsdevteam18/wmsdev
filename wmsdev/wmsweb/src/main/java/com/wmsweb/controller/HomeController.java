package com.wmsweb.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wmsdev.rs.client.auth.AuthenticationClient;
import com.wmsweb.beans.SpringBean;
import com.wmsweb.service.AuthService;

import wmsdata.UserBean;

@Controller
public class HomeController {
	
	@Autowired
	private SpringBean bean;
	
	@Autowired
	private AuthService ac;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/test")
	public @ResponseBody String testMessage() {
		return bean.getMessage();
	}
	
	@RequestMapping(value="/loginPage")
	public String loginPage(Model model) {
		model.addAttribute(new UserBean());
		return "login";
	}
	
	@RequestMapping(value="/authenticate")
	public String authenticate(@Valid UserBean userBean, BindingResult result) {
		String out = null;
		//AuthenticationClient ac = new AuthenticationClient();
		/*UserBean bean = new UserBean();
		bean.setUserName("root");
		bean.setPassword("root@123");*/
		if(result.hasErrors())
			out = "login";
		else if (ac.authenticate(userBean))
			out = "appHome";
		else {
			//result.addError( new ObjectError("userBean", "Login Failed"));
			result.reject("auth.failure");
			out = "login";
		}
		
		return out;
	}
}
