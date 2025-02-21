package com.prjFDQ.FDQ.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class UsersSala {
	
	@EmbeddedId
	private UserSalaPK userSalaPK;
	@Enumerated(EnumType.STRING)
	private Status status;

	public UsersSala() {
	}

	public UsersSala(User userId, Sala SalaId, Status status) {
		this.userSalaPK = new UserSalaPK(userId,SalaId);
		this.status = status;
	}


	public User getUserId() {
		return this.userSalaPK.getUserId();
	}

	public void setUserId(User userId) {
		this.userSalaPK.setUserId(userId);
	}
	
	public Sala getSalaId() {
		return this.userSalaPK.getSalaId();
	}

	public void setSalaId(Sala salaId) {
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
