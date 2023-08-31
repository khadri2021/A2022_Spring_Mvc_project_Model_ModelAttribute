package com.khadri.spring.mvc.form;

public class LoginForm {

	private String name="Please Enter User name";

	private String pass="Please Enter Password";

	public LoginForm() {
		System.out.println("LoginForm constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Name " + name);
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		System.out.println("Password " + pass);
		this.pass = pass;
	}

}
