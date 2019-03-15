package com.stefanini.projeto.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.stefanini.projeto.enums.SituacaoEnum;

@Entity
public class CamisetasCor implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CamisetasCorPK id;

	@ManyToOne
	@JoinColumn(name = "CA_NU", referencedColumnName = "CA_NU", insertable = false, updatable = false)
	private Camisetas camisetas;

	@ManyToOne
	@JoinColumn(name = "CO_NU", referencedColumnName = "CO_NU", insertable = false, updatable = false)
	private Cor cor;

	@Column(name = "CC_SIT")
	@Enumerated(EnumType.STRING)
	private SituacaoEnum situacao;

	public CamisetasCor() {
		super();
	}

	public CamisetasCor(Camisetas camisetas, Cor cor, SituacaoEnum situacao) {
		super();
		this.id = new CamisetasCorPK(camisetas.getId(), cor.getId());
		this.camisetas = camisetas;
		this.cor = cor;
		this.situacao = situacao;
	}

	public CamisetasCorPK getId() {
		return id;
	}

	public void setId(CamisetasCorPK id) {
		this.id = id;
	}

	public Camisetas getCamisetas() {
		return camisetas;
	}

	public void setCamisetas(Camisetas camisetas) {
		this.camisetas = camisetas;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	public SituacaoEnum getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoEnum situacao) {
		this.situacao = situacao;
	}

}