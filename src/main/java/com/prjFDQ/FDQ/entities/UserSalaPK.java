package com.prjFDQ.FDQ.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class UserSalaPK {
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User userId;

	@ManyToOne
	@JoinColumn(name="sala_id")
	private Sala salaId;
	
	

	public UserSalaPK() {
	}

	public UserSalaPK(User userId, Sala salaId) {
		super();
		this.userId = userId;
		this.salaId = salaId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Sala getSalaId() {
		return salaId;
	}

	public void setSalaId(Sala salaId) {
		this.salaId = salaId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(salaId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserSalaPK other = (UserSalaPK) obj;
		return Objects.equals(salaId, other.salaId) && Objects.equals(userId, other.userId);
	}
	
	
	
}
