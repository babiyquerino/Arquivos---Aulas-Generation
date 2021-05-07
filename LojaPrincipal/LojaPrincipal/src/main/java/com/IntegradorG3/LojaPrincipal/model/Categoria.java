package com.IntegradorG3.LojaPrincipal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.drogariamunicipal.farmacia.model.Produto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name= "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String material;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String modelo;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String tema;
	
	@OneToMany(mappedBy = "tipo", cascade = CascadeType.ALL)
	@JsonIgnoreProperties
	private List<Produto> camiseta;
	
	
	
	public List<Produto> getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(List<Produto> camiseta) {
		this.camiseta = camiseta;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
	
	

}
