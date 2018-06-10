package com.wmsweb.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wmsdev.rs.client.auth.AuthenticationClient;
import com.wmsweb.service.AuthService;

import wmsdata.UserBean;

@Service
public class AutheServiceImpl implements AuthService {

	@Autowired
	private AuthenticationClient ac;
	
	/* (non-Javadoc)
	 * @see com.wmsweb.service.AuthService#authenticate(wmsdata.UserBean)
	 */
	@Override
	public boolean authenticate(UserBean bean) {
		return ac.authenticate(bean);
	}
}
