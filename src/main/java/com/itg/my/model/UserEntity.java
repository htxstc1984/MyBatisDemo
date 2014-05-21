package com.itg.my.model;

public class UserEntity {

	private Long id;
	private String username;
	private String pwd;
	private String userdesc;
	private String bz;
	private String locked;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd == null ? null : pwd.trim();
	}

	public String getUserdesc() {
		return userdesc;
	}

	public void setUserdesc(String userdesc) {
		this.userdesc = userdesc == null ? null : userdesc.trim();
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz == null ? null : bz.trim();
	}

	public String getLocked() {
		return locked;
	}

	public void setLocked(String locked) {
		this.locked = locked == null ? null : locked.trim();
	}
}