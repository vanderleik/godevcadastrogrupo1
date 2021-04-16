package br.com.proway.senior.godevcadastro.cadastro.dependente;

import java.util.Date;

import br.com.proway.senior.godevcadastro.cadastro.Pessoa;

/**
 * 
 * Esta classe herda seus atributos primários da classe Pessoa.
 * É vinculada ao colaborador pelo atributo idColaborador.
 * Somente será instanciada na Classe Colaborador se o optanteDependente for true.
 * 
 * @author Samuel Alves
 */
public class Dependente extends Pessoa {

	private Long id;
	private Long idColaborador;
	private String tipoDependente;
	private boolean optanteIR;

	public Dependente() {
		super();
	}

	public Dependente(String nome, String sobrenome, Date dataDeNascimento, String nomeSocial, String genero, char sexo,
			String nomeDaMae, String cpf, String nacionalidade, boolean pcd) {
		super(nome, sobrenome, dataDeNascimento, nomeSocial, genero, sexo, nomeDaMae, cpf, nacionalidade, pcd);
	}

	public Dependente(String nome, String sobrenome, Date dataDeNascimento, String nomeSocial, String genero, char sexo,
			String nomeDaMae, String cpf, String nacionalidade, boolean pcd, Long id, Long idColaborador,
			String tipoDependente, boolean optanteIR) {
		super(nome, sobrenome, dataDeNascimento, nomeSocial, genero, sexo, nomeDaMae, cpf, nacionalidade, pcd);
		this.id = id;
		this.idColaborador = idColaborador;
		this.tipoDependente = tipoDependente;
		this.optanteIR = optanteIR;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(Long idColaborador) {
		this.idColaborador = idColaborador;
	}

	public String getTipoDependente() {
		return tipoDependente;
	}

	public void setTipoDependente(String tipoDependente) {
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
