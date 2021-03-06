package com.wmsjeb.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.wms.model.Password;

import wmsdata.UserBean;

/**
 * Session Bean implementation class LoginServiceBean
 */
@Stateless
public class LoginServiceBean implements LoginServiceBeanLocal, LoginServiceBeanRemote{

	@PersistenceContext
	private EntityManager em;
    /**
     * Default constructor. 
     */
    public LoginServiceBean() {
        // TODO Auto-generated constructor stub
    }
    
    public boolean authenticate(UserBean bean) {
    	Password dbBean = em.find(Password.class, bean.getUserName());
    	
    	return  dbBean!= null && dbBean.getPassword().equals(bean.getPassword());
    	//return true;
    }

}
