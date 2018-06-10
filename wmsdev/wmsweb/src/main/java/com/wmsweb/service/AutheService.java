package com.wmsweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wmsdev.rs.client.auth.AuthenticationClient;

import wmsdata.UserBean;

@Service
public class AutheService {

	@Autowired
	private AuthenticationClient ac;
	
	public boolean authenticate(UserBean bean) {
		return ac.authenticate(bean);
	}
}
