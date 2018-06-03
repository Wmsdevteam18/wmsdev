package com.wmsjeb.beans;

import javax.ejb.Remote;

@Remote
public interface SBeanRemote {
	
	public String ejbMessage() ;

}
