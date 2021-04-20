package br.com.proway.senior.godevcadastro.cadastro.prestadorservico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import br.com.proway.senior.godevcadastro.cadastro.contatos.Contatos;
import br.com.proway.senior.godevcadastro.cadastro.enums.Nacionalidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.SexoPessoa;
import br.com.proway.senior.godevcadastro.cadastro.examemedico.ExameMedico;
import br.com.proway.senior.godevcadastro.cadastro.pessoa.Pessoa;

/**
 * Classe que abstrai as informações do prestador de serviço contratado.
 * 
 * Possui instância de Contatos.
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gonçalves.
 */

public class PrestadorServico extends Pessoa {

	private Integer idPrestadorServico;
	private LocalDate dataInicioContrato;
	private Integer idEmpresa;
	private Integer idSetor;
	private Contatos contatos;

	public PrestadorServico(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, boolean pcd,
			Integer idPrestadorServico, LocalDate dataInicioContrato, Integer idEmpresa, Integer idSetor,
			Contatos contatos) {
		super(nome, sobrenome, dataDeNascimento, nomeSocial, genero, sexo, nomeDaMae, cpf, nacionalidade, pcd);
		this.idPrestadorServico = idPrestadorServico;
		this.dataInicioContrato = dataInicioContrato;
		this.idEmpresa = idEmpresa;
		this.idSetor = idSetor;
		this.contatos = contatos;
	}

	/**
	 * Construtor secundário da classe.
	 * 
	 * Não inclui os atributos de pessoa com deficiencia e nome social.
	 */
	public PrestadorServico(String nome, String sobrenome, LocalDate dataDeNascimento, String genero, SexoPessoa sexo,
			String nomeDaMae, String cpf, Nacionalidades nacionalidade, Integer idPrestadorServico,
			LocalDate dataInicioContrato, Integer idEmpresa, Integer idSetor, Contatos contatos) {
		super(nome, sobrenome, dataDeNascimento, genero, sexo, nomeDaMae, cpf, nacionalidade);
		this.idPrestadorServico = idPrestadorServico;
		this.dataInicioContrato = dataInicioContrato;
		this.idEmpresa = idEmpresa;
		this.idSetor = idSetor;
		this.contatos = contatos;
	}

	public long getIdPrestadorServico() {
		return idPrestadorServico;
	}

	public void setIdPrestadorServico(Integer idPrestadorServico) {
		this.idPrestadorServico = idPrestadorServico;
	}

	public LocalDate getDataInicioContrato() {
		return dataInicioContrato;
	}

	public void setDataInicioContrato(LocalDate dataInicioContrato) {
		this.dataInicioContrato = dataInicioContrato;
	}

	public long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public long getIdSetor() {
		return idSetor;
	}

	public void setIdSetor(Integer idSetor) {
		this.idSetor = idSetor;
	}

	public Contatos getContatos() {
		return this.contatos;
	}

	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}

	/**
	 * Cadastrar prestador de serviço
	 * 
	 * Realiza cadastro de um prestador de serviço
	 * 
	 * @param ArrayList<PrestadorServico> listaPrestadorServico
	 * @param PrestadorServico            prestador
	 * @return void
	 */
	public static void cadastrarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico,
			PrestadorServico prestador) {
		listaPrestadorServico.add(prestador);
	}

	/**
	 * Listar todos os prestadores de serviços
	 * 
	 * Realiza a leitura dos prestadores de serviços cadastrados e apresenta na
	 * tela.
	 * 
	 * @param PrestadorServico prestador
	 * @param ArrayList        listaPrestadorServico
	 * @return ArrayList
	 */
	public static ArrayList<PrestadorServico> listarTodosPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico) {
		for (PrestadorServico prestador2 : listaPrestadorServico) {
			System.out.println(prestador2);
		}
		return listaPrestadorServico;
	}

	/**
	 * Listar o prestador de serviço conforme parâmetro
	 * 
	 * Realiza a leitura do prestador de serviço informado via parâmetro e apresenta
	 * na tela.
	 * 
	 * @param PrestadorServico prestador
	 * @param ArrayList        listaPrestadorServico
	 * @return ArrayList
	 */
	public static ArrayList<PrestadorServico> listarPrestadorCodigo(ArrayList<PrestadorServico> listaPrestadorServico,
			PrestadorServico prestador) {
		for (PrestadorServico prestador2 : listaPrestadorServico) {
			if (listaPrestadorServico.contains(prestador)) {
				System.out.println(prestador2);
			}
		}
		return listaPrestadorServico;
	}

	/**
	 * Atualizar prestador de serviços
	 * 
	 * Realiza a atualização dos dados do prestador de serviços através dos dados
	 * informados (prestadorNovo)
	 * 
	 * @param listaPrestadorServico
	 * @param prestadorAntigo
	 * @param prestadorNovo
	 * @return void
	 */
	public static void atualizarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico,
			PrestadorServico prestadorAntigo, PrestadorServico prestadorNovo) {
		listaPrestadorServico.set(listaPrestadorServico.indexOf(prestadorAntigo), prestadorNovo);
	}

	/**
	 * Deletar prestador de serviço
	 * 
	 * Realiza a exclusão do prestador de serviço conforme parâmetro passado
	 * (PrestadorServico prestador).
	 * 
	 * @param ArrayList<PrestadorServico> listaPrestadorServico
	 * @param PrestadorServico            prestador
	 * @return void
	 */
	public static void deletarPrestadorServico(ArrayList<PrestadorServico> listaPrestadorServico, PrestadorServico prestador) {
		listaPrestadorServico.remove(prestador);
	}

	@Override
	public String toString() {
		return "PrestadorServico [idPrestadorServico=" + idPrestadorServico + ", dataInicioContrato="
				+ dataInicioContrato + ", idEmpresa=" + idEmpresa + ", idSetor=" + idSetor + ", contatos=" + contatos
				+ "]";
	}

}
