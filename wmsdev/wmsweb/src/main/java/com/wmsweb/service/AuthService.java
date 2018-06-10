package com.wmsweb.service;

import org.springframework.stereotype.Service;

import wmsdata.UserBean;

public interface AuthService {

	boolean authenticate(UserBean bean);

}