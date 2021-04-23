package model;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Cidades;
import enums.Nacionalidades;
import enums.Paises;
import enums.SexoPessoa;
import enums.UnidadesFederativas;

public class Colaborador extends Pessoa {

	/**
	 * Classe Colaborador.
	 * 
	 * A classe Colaborador extende da classe mãe Pessoa e instancia as classes
	 * Documentos, Enderecos, Contatos e ExameMedico para concluir o cadastro do
	 * colaborador.
	 * 
	 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
	 *         Luiz Barbieri e Vitor Nathan Gonçalves.
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

	public Colaborador(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, boolean pcd,
			Integer idColaborador, Integer numCargo, Integer nit, boolean optanteVT, boolean optanteVAVR,
			LocalDate dataAdmissao, boolean optanteDependente, Cidades cidadeNascimento,
			UnidadesFederativas ufNascimento, Paises paisNascimento, Documentos documentos, Endereco endereco,
			Contatos contatos, ExameMedico exameMedico) {
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
	 * Cadastrar colaborador
	 * 
	 * Realiza cadastro do colaborador no ArrayList.
	 * 
	 * @param ArrayList<Colaborador> listaColaboradores
	 * @param Colaborador            colaborador
	 * @return void
	 */
	public static void cadastrarColaborador(ArrayList<Colaborador> listaColaboradores, Colaborador colaborador) {
		listaColaboradores.add(colaborador);
	}

	/**
	 * Listar todos os colaboradores
	 * 
	 * Realiza a leitura de todos os colaboradores cadastrados e apresenta na tela.
	 * 
	 * @param listaColaboradores
	 * @return ArrayList listaColaboradores
	 */
	public static ArrayList<Colaborador> listarTodosColaboradores(ArrayList<Colaborador> listaColaboradores) {
		for (Colaborador colaborador2 : listaColaboradores) {
			System.out.println(colaborador2);
		}
		return listaColaboradores;
	}

	/**
	 * Listar colaboradores por código
	 * 
	 * Realiza a leitura dos dados do colaboradore conforme parâmetro.
	 * 
	 * @param listaColaboradores
	 * @return ArrayList listaColaboradores
	 */
	public static ArrayList<Colaborador> listarColaboradorCodigo(ArrayList<Colaborador> listaColaboradores,
			Colaborador colaborador) {
		for (Colaborador colaborador2 : listaColaboradores) {
			if (listaColaboradores.contains(colaborador)) {
				System.out.println(colaborador2);
			}
		}
		return listaColaboradores;
	}

	/**
	 * Atualizar colaborador
	 * 
	 * Realiza a atualização dos dados do colaborador através dos dados informados
	 * (colaboradorNovo)
	 * 
	 * @param listaColaboradores
	 * @param colaboradorNovo
	 * @param colaboradorAntigo
	 */
	public static void atualizarColaborador(ArrayList<Colaborador> listaColaboradores, Colaborador colaboradorNovo,
			Colaborador colaboradorAntigo) {
		listaColaboradores.set(listaColaboradores.indexOf(colaboradorAntigo), colaboradorNovo);
	}

	/**
	 * Deletar colaborador
	 * 
	 * Realiza a exclusão do colaborador conforme parâmetro passado (Colaborador
	 * colaborador).
	 * 
	 * @param listaColaboradores
	 * @param colaborador
	 */
	public static void deletarColaborador(ArrayList<Colaborador> listaColaboradores, Colaborador colaborador) {
		listaColaboradores.remove(colaborador);
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
