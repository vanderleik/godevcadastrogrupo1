package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import controller.Model;
import enums.Nacionalidades;
import enums.SexoPessoa;

/**
 * Classe que abstrai as informações do prestador de serviço contratado.
 * 
 * Possui instância de Contatos.
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gonçalves.
 */

public class PrestadorServico extends Pessoa implements Model{

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


	@Override
	public String toString() {
		return "PrestadorServico [idPrestadorServico=" + idPrestadorServico + ", dataInicioContrato="
				+ dataInicioContrato + ", idEmpresa=" + idEmpresa + ", idSetor=" + idSetor + ", contatos=" + contatos
				+ "]";
	}

}
