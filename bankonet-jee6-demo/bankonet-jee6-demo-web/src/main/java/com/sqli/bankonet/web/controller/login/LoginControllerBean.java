/**
 * 
 */
package com.sqli.bankonet.web.controller.login;

import java.util.Locale;


import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;


import com.sqli.bankonet.web.controller.AbstractControllerBean;
import com.sqli.bankonet.web.view.login.LoginViewBean;

/**
 * @author ydechmi
 *
 */
@ManagedBean(name="loginBean")
public class LoginControllerBean extends AbstractControllerBean{
	
	@Inject
	private LoginViewBean view;

	/**
	 * 
	 */
	public LoginControllerBean() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the view
	 */
	public LoginViewBean getView() {
		return view;
	}

	/**
	 * @param view the view to set
	 */
	public void setView(LoginViewBean view) {
		this.view = view;
	}


	public String login(){
		//FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("fr"));
		System.out.println("OK");
		String out="/faces/home/home";
		System.out.println(out);
		return "success";
	}

	
}
