package com.exam.facebook.dto.request;

import com.exam.facebook.domain.Usr;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddUsrRequest {
	private String usrId;
	private String pwd;
	private String name;
	private String phNum;
	
	public Usr usrToEntity() {
		Usr usr = new Usr();
		usr.setMemId(this.usrId);
		usr.setName(this.name);
		usr.setPwd(this.pwd);
		usr.setPhNum(this.phNum);
		return usr;
	}
}
