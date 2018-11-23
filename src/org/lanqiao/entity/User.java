package org.lanqiao.entity;

public class User {
	private String userID;//身份证号
	private String userName;//用户名
	private String loginPassWord;//登陆密码
	private String payPassWord;//支付密码
	private String email;//电子邮箱
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public User(String userID, String userName, String loginpassWord, String payPassWord, String email) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.loginPassWord = loginpassWord;
		this.payPassWord = payPassWord;
		this.email = email;
	}
	public String getLoginpassWord() {
		return loginPassWord;
	}
	public void setLoginpassWord(String loginpassWord) {
		this.loginPassWord = loginpassWord;
	}
	public String getPayPassWord() {
		return payPassWord;
	}
	public void setPayPassWord(String payPassWord) {
		this.payPassWord = payPassWord;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userID, String userName) {
		super();
		this.userID = userID;
		this.userName = userName;
	}
	public User(String email) {
		super();
		this.email = email;
	}
	
	
	
	
}
