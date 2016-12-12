package com.abid.wicket.page;

/**
 * Created by abidkhan on 09/12/16.
 */
public class LoginPage extends  BaseTemplate {

	public LoginPage(){
		super();
		replace(new LoginPanel(CONTENT_ID));
		getMenuPanel().setVisible(false);
	}
}
