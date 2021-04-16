package br.com.proway.senior.godevcadastro.cadastro;

import java.time.LocalDate;
import java.util.Date;

public class Colaborador extends Pessoa {

	/**
	 * Classe Colaborador
	 * 
	 * A classe Colaborador extende da classe mãe Pessoa e estancia as classes
	 * Documentos, Enderecos, Contatos e ExameMedico para concluir o cadastro do
	 * colaborador.
	 */

	/**
	 * Atributos da Classe colaborador
	 * 
	 * @param String nome
	 * @param String sobrenome
	 * @param Date dataDeNascimento
	 * @param String genero
	 * @param char sexo
	 * @param String nomeDaMae
	 * @param String cpf
	 * @param String nacionalidade
	 * @param Integer idColaborador
	 * @param Integer numCargo
	 * @param Integer nit
	 * @param boolean optanteVT
	 * @param boolean optanteVAVR
	 * @param Date dataAdmissao
	 * @param boolean optanteDependente
	 * @param Documentos documentos Instância da classe Documentos
	 * para setar dados de RG, título, reservista, NIT, entre outros.
	 * @param Endereco endereco Instância da classe Endereco para
	 * setar dados de residência do colaborador: logradouro, número,
	 * bairro, entre outros.
	 * @param Contatos contatos Instância da classe Contatos para
	 * setar dados de telefone e e-mail do colaborador.
	 * @param ExameMedico exameMedico Instância da Classe ExameMedico
	 * para setar dados dos exames do colaborador: admissional, demissional
	 * e periódico.	 * 
	 */
		
	private Integer idColaborador;
	private Integer numCargo;
	private Integer nit;
	private boolean optanteVT;
	private boolean optanteVAVR;
	private LocalDate dataAdmissao;
	private boolean optanteDependente;
	private Documentos documentos;
	private Endereco endereco;
	private Contatos contatos;
	private ExameMedico exameMedico;

	// Construtores classe mãe

	public Colaborador(String nome, String sobrenome, LocalDate dataDeNascimento, String genero, char sexo, String nomeDaMae,
			String cpf, String nacionalidade) {

		super(nome, sobrenome, dataDeNascimento, genero, sexo, nomeDaMae, cpf, nacionalidade);
	}

	public Colaborador(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			char sexo, String nomeDaMae, String cpf, String nacionalidade, boolean pcd) {
		super(nome, sobrenome, dataDeNascimento, nomeSocial, genero, sexo, nomeDaMae, cpf, nacionalidade, pcd);
	}

	public Integer getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}

	public Integer getNumCargo() {
		return numCargo;
	}

	public void setNumCargo(Integer numCargo) {
		this.numCargo = numCargo;
	}

	public Integer getNit() {
		return nit;
	}

	public void setNit(Integer nit) {
		this.nit = nit;
	}

	public boolean isOptanteVT() {
		return optanteVT;
	}

	public void setOptanteVT(boolean optanteVT) {
		this.optanteVT = optanteVT;
	}

	public boolean isOptanteVAVR() {
		return optanteVAVR;
	}

	public void setOptanteVAVR(boolean optanteVAVR) {
		this.optanteVAVR = optanteVAVR;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public boolean isOptanteDependente() {
		return optanteDependente;
	}

	public void setOptanteDependente(boolean optanteDependente) {
		this.optanteDependente = optanteDependente;
	}

	public Documentos getDocumentos() {
		return documentos;
	}

	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contatos getContatos() {
		return contatos;
	}

	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}

	public ExameMedico getExameMedico() {
		return exameMedico;
	}

	public void setExameMedico(ExameMedico exameMedico) {
		this.exameMedico = exameMedico;
	}

	/**
	 * Construtor com todos os campos setados para preenchimento. Utilizado quando
	 * possuírem todos os dados do colaborador no momento do cadastro.
	 * 
	 * @param nome
	 * @param sobrenome
	 * @param dataDeNascimento
	 * @param nomeSocial
	 * @param genero
	 * @param sexo
	 * @param nomeDaMae
	 * @param cpf
	 * @param nacionalidade
	 * @param pcd
	 * @param idColaborador
	 * @param numCargo
	 * @param nit
	 * @param optanteVT
	 * @param optanteVAVR
	 * @param dataAdmissao
	 * @param optanteDependente
	 * @param documentos
	 * @param endereco
	 * @param contatos
	 * @param exameMedico
	 */
	public Colaborador(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			char sexo, String nomeDaMae, String cpf, String nacionalidade, boolean pcd, Integer idColaborador,
			Integer numCargo, Integer nit, boolean optanteVT, boolean optanteVAVR, LocalDate dataAdmissao,
			boolean optanteDependente, Documentos documentos, Endereco endereco, Contatos contatos, ExameMedico exameMedico) {
		super(nome, sobrenome, dataDeNascimento, nomeSocial, genero, sexo, nomeDaMae, cpf, nacionalidade, pcd);
		this.idColaborador = idColaborador;
		this.numCargo = numCargo;
		this.nit = nit;
		this.optanteVT = optanteVT;
		this.optanteVAVR = optanteVAVR;
		this.dataAdmissao = dataAdmissao;
		this.optanteDependente = optanteDependente;
		this.documentos = documentos;
		this.endereco = endereco;
		this.contatos = contatos;
		this.exameMedico = exameMedico;
	}

	/**
	 * Construtor não recebe a informação de PCD, considerada false por padrão.
	 * Demais dados são necessários para cadastro do colaborador.
	 * 
	 * @param nome
	 * @param sobrenome
	 * @param dataDeNascimento
	 * @param nomeSocial
	 * @param genero
	 * @param sexo
	 * @param nomeDaMae
	 * @param cpf
	 * @param nacionalidade
	 * @param pcd
	 * @param idColaborador
	 * @param numCargo
	 * @param nit
	 * @param optanteVT
	 * @param optanteVAVR
	 * @param dataAdmissao
	 * @param optanteDependente
	 * @param documentos
	 * @param endereco
	 * @param contatos
	 * @param exameMedico
	 */
	public Colaborador(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,

			char sexo, String nomeDaMae, String cpf, String nacionalidade, Integer idColaborador,
			Integer numCargo, Integer nit, boolean optanteVT, boolean optanteVAVR, LocalDate dataAdmissao,
			boolean optanteDependente, Documentos documentos, Endereco endereco,
			Contatos contatos, ExameMedico exameMedico) {
		super(nome, sobrenome, dataDeNascimento, nomeSocial, genero, sexo, nomeDaMae, cpf, nacionalidade, optanteDependente);
		this.idColaborador = idColaborador;
		this.numCargo = numCargo;
		this.nit = nit;
		this.optanteVT = optanteVT;
		this.optanteVAVR = optanteVAVR;
		this.dataAdmissao = dataAdmissao;
		this.optanteDependente = optanteDependente;
		this.documentos = documentos;
		this.endereco = endereco;
		this.contatos = contatos;
		this.exameMedico = exameMedico;
	}

	@Override
	public String toString() {
		return "Colaborador [idColaborador=" + idColaborador + ", numCargo=" + numCargo + ", nit=" + nit
				+ ", optanteVT=" + optanteVT + ", optanteVAVR=" + optanteVAVR + ", dataAdmissao=" + dataAdmissao
				+ ", optanteDependente=" + optanteDependente + ", documentos="
				+ documentos + ", endereco=" + endereco + ", contatos=" + contatos + ", exameMedico=" + exameMedico
				+ "]";
	}

}
