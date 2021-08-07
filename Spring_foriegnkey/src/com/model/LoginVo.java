package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="login")
public class LoginVo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	
//	@OnDelete(action=OnDeleteAction.CASCADE)
//    @OneToOne(mappedBy = "loginVo", cascade = CascadeType.ALL,orphanRemoval = true,fetch=FetchType.EAGER)
//	private RegVO regVO;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	public RegVO getRegVO() {
//		return regVO;
//	}
//
//	public void setRegVO(RegVO regVO) {
//		this.regVO = regVO;
//	}
	
	
}
