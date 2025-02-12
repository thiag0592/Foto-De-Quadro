package com.prjFDQ.FDQ.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Fotos {

	@Id
	private String url;
	
	private Integer ordem;
	
	@OneToMany
	private Aula aula;

	public Fotos(String url, Integer ordem, Aula aula) {
		this.url = url;
		this.ordem = ordem;
		this.aula = aula;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getOrdem() {
		return ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aula, ordem, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fotos other = (Fotos) obj;
		return Objects.equals(aula, other.aula) && Objects.equals(ordem, other.ordem) && Objects.equals(url, other.url);
	}
	
	
	
}
