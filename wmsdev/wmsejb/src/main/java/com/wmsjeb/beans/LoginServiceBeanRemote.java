package com.wmsjeb.beans;

import javax.ejb.Remote;

import wmsdata.UserBean;

@Remote
public interface LoginServiceBeanRemote {
	public boolean authenticate(UserBean bean);
}
