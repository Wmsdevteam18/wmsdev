package com.wmsjeb.beans;

import javax.ejb.Local;

import wmsdata.UserBean;

@Local
public interface LoginServiceBeanLocal {
	public boolean authenticate(UserBean bean) ;
}