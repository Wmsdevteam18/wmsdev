package wmsdata;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7514553597263808791L;

	@NotNull(message="Username cannot be null")
	@Size(min=4,max=50)
	private String userName;
	
	@NotNull(message="password cannot be null")
	@Size(min=5,max=50)
	private String password;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
