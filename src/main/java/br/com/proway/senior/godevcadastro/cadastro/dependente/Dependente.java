package br.com.proway.senior.godevcadastro.cadastro.dependente;

import java.time.LocalDate;

import br.com.proway.senior.godevcadastro.cadastro.enums.Nacionalidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.SexoPessoa;
import br.com.proway.senior.godevcadastro.cadastro.pessoa.Pessoa;

/**
 * 
 * Esta classe herda seus atributos primários da classe Pessoa. É vinculada ao
 * colaborador pelo atributo idColaborador. Somente será instanciada na Classe
 * Colaborador se o optanteDependente for true.
 * 
 * @author Samuel Alves
 */
public class Dependente extends Pessoa {

	private Integer id;
	private Integer idColaborador;
	private TiposDependentes tipoDependente;
	private boolean optanteIR;

	public Dependente() {
		super();
	}

	public Dependente(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, boolean pcd, Integer id,
			Integer idColaborador, TiposDependentes tipoDependente, boolean optanteIR) {
		super(nome, sobrenome, dataDeNascimento, nomeSocial, genero, sexo, nomeDaMae, cpf, nacionalidade, pcd);
		this.id = id;
		this.idColaborador = idColaborador;
		this.tipoDependente = tipoDependente;
		this.optanteIR = optanteIR;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}

	public TiposDependentes getTipoDependente() {
		return tipoDependente;
	}

	public void setTipoDependente(TiposDependentes tipoDependente) {
		this.tipoDependente = tipoDependente;
	}

	public boolean isOptanteIR() {
		return optanteIR;
	}

	public void setOptanteIR(boolean optanteIR) {
		this.optanteIR = optanteIR;
	}

	@Override
	public String toString() {
		return "Dependente [id=" + id + ", idColaborador=" + idColaborador + ", tipoDependente=" + tipoDependente
				+ ", optanteIR=" + optanteIR + "]";
	}

}