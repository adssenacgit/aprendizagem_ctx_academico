package com.senac.api.response;

import java.time.LocalDate;

public class PlanejamentoUcResponse{

	private Long id;
	private String descricao;
	private LocalDate dataAprovacao = LocalDate.now();
	private Boolean status; 
	private Long grupoId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataAprovacao() {
		return dataAprovacao;
	}
	public void setDataAprovacao(LocalDate dataAprovacao) {
		this.dataAprovacao = dataAprovacao;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Long getGrupoId() {
		return grupoId;
	}
	public void setGrupoId(Long grupoId) {
		this.grupoId = grupoId;
	}
	
}
