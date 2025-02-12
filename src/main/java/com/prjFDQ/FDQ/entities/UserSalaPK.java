package com.prjFDQ.FDQ.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class UserSalaPK {
	
	@ManyToOne
	@JoinColumn
	private Integer userId;

	@ManyToOne
	@JoinColumn
	private Integer SalaId;

	public UserSalaPK(Integer userId, Integer salaId) {
		super();
		this.userId = userId;
		SalaId = salaId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getSalaId() {
		return SalaId;
	}

	public void setSalaId(Integer salaId) {
		SalaId = salaId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(SalaId, userId);
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
		return Objects.equals(SalaId, other.SalaId) && Objects.equals(userId, other.userId);
	}
	
	
	
}
