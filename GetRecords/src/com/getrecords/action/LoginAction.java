/**
 * 
 */
package com.getrecords.action;

import com.getrecords.constants.StringConstants;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author dell
 *
 */
public class LoginAction extends ActionSupport {
private static final long serialVersionUID = 1L;
	
	private String uname,password;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute()
	{		
		if(uname.equals("java4s") && password.equals("pass"))
		{
			return StringConstants.SUCCESS;
			
		}else 
			return StringConstants.ERROR;
	}

}
