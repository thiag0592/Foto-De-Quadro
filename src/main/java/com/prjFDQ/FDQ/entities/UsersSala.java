package com.prjFDQ.FDQ.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class UsersSala {
	
	@EmbeddedId
	private UserSalaPK userSalaPK;
	
	private Status status;


	public UsersSala(Integer userId, Integer SalaId, Status status) {
		this.userSalaPK = new UserSalaPK(userId,SalaId);
		this.status = status;
	}


	public Integer getUserId() {
		return this.userSalaPK.getUserId();
	}

	public void setUserId(Integer userId) {
		this.userSalaPK.setUserId(userId);
	}
	
	public Integer getSalaId() {
		return this.userSalaPK.getSalaId();
	}

	public void setSalaId(Integer salaId) {
		this.userSalaPK.setSalaId(salaId);
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}


	@Override
	public int hashCode() {
		return Objects.hash(status, userSalaPK);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsersSala other = (UsersSala) obj;
		return status == other.status && Objects.equals(userSalaPK, other.userSalaPK);
	}
	
	
	
}
