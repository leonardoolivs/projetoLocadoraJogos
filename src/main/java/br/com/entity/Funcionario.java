package br.com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="ds_cnpj")
	private String cnpj;

	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Long id, String nome, Endereco endereco, int idade, Date dataNascimento, String cnpj) {
		super(id, nome, endereco,idade,dataNascimento);
		this.cnpj = cnpj;
	}

	public String getcnpj() {
		return cnpj;
	}

	public void setcnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [id="+super.getId()+", nome="+super.getNome()+", idade="+super.getIdade()+", data="+super.getDataNascimento()+", cnpj="+cnpj+"]";
	}
}


