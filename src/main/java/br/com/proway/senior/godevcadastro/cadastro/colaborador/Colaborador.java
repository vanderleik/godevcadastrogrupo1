package br.com.proway.senior.godevcadastro.cadastro.colaborador;

import java.time.LocalDate;
import java.util.Date;

import br.com.proway.senior.godevcadastro.cadastro.contatos.Contatos;
import br.com.proway.senior.godevcadastro.cadastro.documentos.Documentos;
import br.com.proway.senior.godevcadastro.cadastro.endereco.Endereco;
import br.com.proway.senior.godevcadastro.cadastro.enums.Cidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.Nacionalidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.Paises;
import br.com.proway.senior.godevcadastro.cadastro.enums.SexoPessoa;
import br.com.proway.senior.godevcadastro.cadastro.enums.UnidadesFederativas;
import br.com.proway.senior.godevcadastro.cadastro.examemedico.ExameMedico;
import br.com.proway.senior.godevcadastro.cadastro.pessoa.Pessoa;

public class Colaborador extends Pessoa {

	/**
	 * Classe Colaborador.
	 * 
	 * A classe Colaborador extende da classe mãe Pessoa e estancia as classes
	 * Documentos, Enderecos, Contatos e ExameMedico para concluir o cadastro do
	 * colaborador.
	 */

	/**
	 * Atributos da Classe colaborador
	 * 
	 * @param String nome;
	 * @param String sobrenome;
	 * @param Date dataDeNascimento;
	 * @param String genero;
	 * @param SexoPessoa sexo Instância do enum SexoPessoa
	 * para setar dados de sexo;
	 * @param String nomeDaMae;
	 * @param String cpf;
	 * @param Nacionalidades nacionalidade Instância do enum Nacionalidades
	 * para setar a nacionalidade do colaborador;
	 * @param Integer idColaborador;
	 * @param Integer numCargo;
	 * @param Integer nit;
	 * @param boolean optanteVT;
	 * @param boolean optanteVAVR;
	 * @param Date dataAdmissao;
	 * @param boolean optanteDependente;
	 * @param Cidades cidadeNascimento Instância do enum Cidades para
	 * setar a cidade de nascimento do colaborador;
	 * @param UnidadesFederativas UfNascimento Instância do enum UnidadesFederativas
	 * para setar a unidade federativa de nascimento do colaborador;
	 * @param Paises paisNascimento Instância do enum Paises para
	 * setar o pais de nascimento do colaborador;
	 * @param Documentos documentos Instância da classe Documentos;
	 * para setar dados de RG, título, reservista, NIT, entre outros;
	 * @param Endereco endereco Instância da classe Endereco para
	 * setar dados de residência do colaborador: logradouro, número,
	 * bairro, entre outros;
	 * @param Contatos contatos Instância da classe Contatos para
	 * setar dados de telefone e e-mail do colaborador;
	 * @param ExameMedico exameMedico Instância da Classe ExameMedico
	 * para setar dados dos exames do colaborador: admissional, demissional
	 * e periódico. 
	 */
		
	private Integer idColaborador;
	private Integer numCargo;
	private Integer nit;
	private boolean optanteVT;
	private boolean optanteVAVR;
	private LocalDate dataAdmissao;
	private boolean optanteDependente;
	private Cidades cidadeNascimento;
	private UnidadesFederativas UfNascimento;
	private Paises paisNascimento;
	private Documentos documentos;
	private Endereco endereco;
	private Contatos contatos;
	private ExameMedico exameMedico;

	// Construtores classe mãe

	public Colaborador(String nome, String sobrenome, LocalDate dataDeNascimento, String genero, SexoPessoa sexo, String nomeDaMae,
			String cpf, Nacionalidades nacionalidade) {

		super(nome, sobrenome, dataDeNascimento, genero, sexo, nomeDaMae, cpf, nacionalidade);
	}

	public Colaborador(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, boolean pcd) {
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

	public Cidades getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setCidadeNascimento(Cidades cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	public UnidadesFederativas getUfNascimento() {
		return UfNascimento;
	}

	public void setUfNascimento(UnidadesFederativas ufNascimento) {
		UfNascimento = ufNascimento;
	}

	public Paises getPaisNascimento() {
		return paisNascimento;
	}

	public void setPaisNascimento(Paises paisNascimento) {
		this.paisNascimento = paisNascimento;
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
	 * @param cidadeNascimento
	 * @param ufNascimento
	 * @param paisNascimento
	 * @param documentos
	 * @param endereco
	 * @param contatos
	 * @param exameMedico
	 */
	public Colaborador(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, boolean pcd, Integer idColaborador,
			Integer numCargo, Integer nit, boolean optanteVT, boolean optanteVAVR, LocalDate dataAdmissao,
			boolean optanteDependente, Cidades cidadeNascimento, UnidadesFederativas ufNascimento,
			Paises paisNascimento, Documentos documentos, Endereco endereco, Contatos contatos,
			ExameMedico exameMedico) {
		super(nome, sobrenome, dataDeNascimento, nomeSocial, genero, sexo, nomeDaMae, cpf, nacionalidade, pcd);
		this.idColaborador = idColaborador;
		this.numCargo = numCargo;
		this.nit = nit;
		this.optanteVT = optanteVT;
		this.optanteVAVR = optanteVAVR;
		this.dataAdmissao = dataAdmissao;
		this.optanteDependente = optanteDependente;
		this.cidadeNascimento = cidadeNascimento;
		this.UfNascimento = ufNascimento;
		this.paisNascimento = paisNascimento;
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
	 * @param cidadeNascimento
	 * @param ufNascimento
	 * @param paisNascimento
	 * @param documentos
	 * @param endereco
	 * @param contatos
	 * @param exameMedico
	 */
	public Colaborador(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, Integer idColaborador,
			Integer numCargo, Integer nit, boolean optanteVT, boolean optanteVAVR, LocalDate dataAdmissao,
			boolean optanteDependente, Cidades cidadeNascimento, UnidadesFederativas ufNascimento,
			Paises paisNascimento, Documentos documentos, Endereco endereco, Contatos contatos,
			ExameMedico exameMedico) {
		super(nome, sobrenome, dataDeNascimento, nomeSocial, genero, sexo, nomeDaMae, cpf, nacionalidade);
		this.idColaborador = idColaborador;
		this.numCargo = numCargo;
		this.nit = nit;
		this.optanteVT = optanteVT;
		this.optanteVAVR = optanteVAVR;
		this.dataAdmissao = dataAdmissao;
		this.optanteDependente = optanteDependente;
		this.cidadeNascimento = cidadeNascimento;
		this.UfNascimento = ufNascimento;
		this.paisNascimento = paisNascimento;
		this.documentos = documentos;
		this.endereco = endereco;
		this.contatos = contatos;
		this.exameMedico = exameMedico;
	}


	@Override
	public String toString() {
		return "Colaborador [idColaborador=" + idColaborador + ", numCargo=" + numCargo + ", nit=" + nit
				+ ", optanteVT=" + optanteVT + ", optanteVAVR=" + optanteVAVR + ", dataAdmissao=" + dataAdmissao
				+ ", optanteDependente=" + optanteDependente + ", cidadeNascimento=" + cidadeNascimento
				+ ", UfNascimento=" + UfNascimento + ", paisNascimento=" + paisNascimento + ", documentos=" + documentos
				+ ", endereco=" + endereco + ", contatos=" + contatos + ", exameMedico=" + exameMedico + "]";
	}

	
}
