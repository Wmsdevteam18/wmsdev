package com.wmsjeb.beans;

import javax.ejb.Local;

@Local
public interface SBeanLocal {
	public String ejbMessage();
}
