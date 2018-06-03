package com.wmsjeb.beans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class SBean
 */
@Stateless
public class SBean implements SBeanRemote, SBeanLocal {

    /**
     * Default constructor. 
     */
    public SBean() {
        // TODO Auto-generated constructor stub
    }
    
    public String ejbMessage() {
    	return "EJB Message";
    }

}
