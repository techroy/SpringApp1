package com.app1.beans;

public class DbConfig {

	private String url;
	private String uname;
	private String pwd;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "DbConfig [url=" + url + ", uname=" + uname + ", pwd=" + pwd + "]";
	}
	
	

}
