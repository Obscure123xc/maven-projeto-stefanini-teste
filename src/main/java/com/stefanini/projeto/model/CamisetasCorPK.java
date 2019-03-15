package com.stefanini.projeto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CamisetasCorPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "CA_NU")
	private Long idCamisetas;

	@Column(name = "CO_NU")
	private Long idCor;

	public CamisetasCorPK() {
		super();
	}

	public CamisetasCorPK(Long idCamisetas, Long idCor) {
		super();
		this.idCamisetas = idCamisetas;
		this.idCor = idCor;
	}

	public Long getIdCamisetas() {
		return idCamisetas;
	}

	public void setIdCamisetas(Long idCamisetas) {
		this.idCamisetas = idCamisetas;
	}

	public Long getIdCor() {
		return idCor;
	}

	public void setIdCor(Long idCor) {
		this.idCor = idCor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCamisetas == null) ? 0 : idCamisetas.hashCode());
		result = prime * result + ((idCor == null) ? 0 : idCor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CamisetasCorPK other = (CamisetasCorPK) obj;
		if (idCamisetas == null) {
			if (other.idCamisetas != null)
				return false;
		} else if (!idCamisetas.equals(other.idCamisetas))
			return false;
		if (idCor == null) {
			if (other.idCor != null)
				return false;
		} else if (!idCor.equals(other.idCor))
			return false;
		return true;
	}

}