package br.com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.enums.StatusJogo;

@Entity
@Table(name="Jogo")
public class Jogo implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="cd_jogo")
	private Long id;
	
	@Column(name="ds_nome")
	private String nome;
	
	@Column(name="ds_genero")
	private String genero;
	
	@Column(name="ds_status")
	@Enumerated(EnumType.STRING)
	private StatusJogo statusJogo;
	
	public Jogo() {
	}

	public Jogo(Long id, String nome, String genero, StatusJogo statusJogo) {
		super();
		this.id = id;
		this.nome = nome;
		this.genero = genero;
		this.statusJogo = statusJogo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public StatusJogo getStatusJogo() {
		return statusJogo;
	}

	public void setStatusJogo(StatusJogo statusJogo) {
		this.statusJogo = statusJogo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Jogo other = (Jogo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Jogo [id=" + id + ", nome=" + nome + ", genero=" + genero + ", statusJogo=" + statusJogo + "]";
	}
	
}
