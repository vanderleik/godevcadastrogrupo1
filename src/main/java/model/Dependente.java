package model;

import java.time.LocalDate;
import java.util.ArrayList;

import enums.Nacionalidades;
import enums.SexoPessoa;
import enums.TiposDependentes;

/**
 * Esta classe herda seus atributos primários da classe Pessoa. É vinculada ao
 * colaborador pelo atributo idColaborador. Somente será instanciada na Classe
 * Colaborador se o optanteDependente for true.
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gonçalves.
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

	/**
	 * Adiciona um dependente ao ArrayList<Dependente>
	 * 
	 * @param listaDependentes
	 * @param dependente
	 */
	public static void cadastrarDependente(ArrayList<Dependente> listaDependentes, Dependente dependente) {
		listaDependentes.add(dependente);
	}

	/**
	 * Mostra as informações dos dependentes no console
	 * 
	 * @param listaDependentes
	 */
	public static void listarDependentes(ArrayList<Dependente> listaDependentes) {
		for (Dependente dependente : listaDependentes) {
			System.out.println(dependente.toString());
		}
	}

	/**
	 * Realizar a atualização dos dados.
	 * 
	 * Altera um dependente do ArrayList para o novo dependente informado.
	 * 
	 * @param listaDependentes
	 * @param dependenteAntigo
	 * @param dependenteNovo
	 */
	public static void atualizarDependente(ArrayList<Dependente> listaDependentes, Dependente dependenteAntigo,
			Dependente dependenteNovo) {
		int indice = listaDependentes.indexOf(dependenteAntigo);
		listaDependentes.set(indice, dependenteNovo);
	}

	/**
	 * Deletar um dependente do ArrayList.
	 * 
	 * Deleta o dependente selecionado do ArrayList.
	 * 
	 * @param listaDependentes
	 * @param dependente
	 */
	public static void deletarDependente(ArrayList<Dependente> listaDependentes, Dependente dependente) {
		listaDependentes.remove(dependente);
	}

}