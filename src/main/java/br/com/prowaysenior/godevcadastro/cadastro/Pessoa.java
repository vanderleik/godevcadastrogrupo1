package br.com.proway.senior.cadastro;

import java.util.Date;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private Date dataDeNascimento;
	private String nomeSocial;
	private String genero;
	private char sexo;
	private String nomeDaMae;
	private String cpf;
	private String nacionalidade;
	private boolean pcd = false;

	public Pessoa(String nome, String sobrenome, Date dataDeNascimento, String nomeSocial, String genero, char sexo,
			String nomeDaMae, String cpf, String nacionalidade, boolean pcd) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
		this.nomeSocial = nomeSocial;
		this.genero = genero;
		this.sexo = sexo;
		this.nomeDaMae = nomeDaMae;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
		this.pcd = pcd;
	}

	public Pessoa(String nome, String sobrenome, Date dataDeNascimento, String genero, char sexo, String nomeDaMae,
			String cpf, String nacionalidade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
		this.genero = genero;
		this.sexo = sexo;
		this.nomeDaMae = nomeDaMae;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
	}

	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public boolean isPcd() {
		return pcd;
	}

	public void setPcd(boolean pcd) {
		this.pcd = pcd;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", dataDeNascimento=" + dataDeNascimento
				+ ", nomeSocial=" + nomeSocial + ", genero=" + genero + ", sexo=" + sexo + ", nomeDaMae=" + nomeDaMae
				+ ", cpf=" + cpf + ", nacionalidade=" + nacionalidade + ", pcd=" + pcd + "]";
	}
	
}
