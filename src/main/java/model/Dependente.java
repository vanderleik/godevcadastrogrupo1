package model;

import java.time.LocalDate;
import java.util.ArrayList;
import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosPessoais.SexoPessoa;
import enums.EMDadosPessoais.TiposDependentes;
import model.Pessoa.PessoaBuilder;

/**
 * Esta classe herda seus atributos primários da classe Pessoa. É vinculada ao
 * colaborador pelo atributo idColaborador. Somente será instanciada na Classe
 * Colaborador se o optanteDependente for true.
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gonçalves.
 */

public class Dependente {

	private Pessoa pessoa;
	private Integer idDependente;
	private Integer idColaborador;
	private TiposDependentes tipoDependente;
	private boolean optanteIR;

	public Dependente() {
	}

	public Dependente(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidade nacionalidade, boolean pcd, Integer id,
			Integer idColaborador, TiposDependentes tipoDependente, boolean optanteIR) {
		this.pessoa = new Pessoa.PessoaBuilder().nome(nome).sobrenome(sobrenome).dataDeNascimento(dataDeNascimento).nomeSocial(nomeSocial).
				genero(genero).sexo(sexo).nomeDaMae(nomeDaMae).cpf(cpf).nacionalidade(nacionalidade).pcd(pcd).criarPessoa();
		this.idDependente = id;
		this.idColaborador = idColaborador;
		this.tipoDependente = tipoDependente;
		this.optanteIR = optanteIR;
	}

	public Integer getId() {
		return idDependente;
	}

	public void setId(Integer id) {
		this.idDependente = id;
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
	
	public static class DependenteBuilder {
		private String nome;
		private String sobrenome;
		private LocalDate dataDeNascimento;
		private String nomeSocial;
		private String genero;
		private SexoPessoa sexo;
		private String nomeDaMae;
		private String cpf;
		private Nacionalidade nacionalidade;
		private boolean pcd;
		private Integer idDependente;
		private Integer idColaborador;
		private TiposDependentes tipoDependente;
		private boolean optanteIR;
		
		public DependenteBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public DependenteBuilder sobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
			return this;
		}
		

		public DependenteBuilder dataDeNascimento(LocalDate dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
			return this;
		}
		
		public DependenteBuilder nomeSocial(String nomeSocial) {
			this.nomeSocial = nomeSocial;
			return this;
		}
		
		public DependenteBuilder genero(String genero) {
			this.genero = genero;
			return this;
		}
		
		public DependenteBuilder sexo(SexoPessoa sexo) {
			this.sexo = sexo;
			return this;
		}
		public DependenteBuilder nomeDaMae(String nomeDaMae) {
			this.nomeDaMae = nomeDaMae;
			return this;
		}
		

		public DependenteBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
		
		public DependenteBuilder nacionalidade(Nacionalidade nacionalidade) {
			this.nacionalidade = nacionalidade;
			return this;
		}
	
		public DependenteBuilder pcd(Boolean pcd) {
			this.pcd = pcd;
			return this;
		}
		public DependenteBuilder idDependente(Integer idDependente) {
			this.idDependente = idDependente;
			return this;
		}
		public DependenteBuilder idColaborador(Integer idColaborador) {
			this.idColaborador = idColaborador;
			return this;
		}
		public DependenteBuilder tipoDependentes(TiposDependentes tipoDependente) {
			this.tipoDependente = tipoDependente;
			return this;
		}
		public DependenteBuilder optanteIR(boolean optanteIR) {
			this.optanteIR = optanteIR;
			return this;
		}
		
		public Dependente criarDependente() {
			return new Dependente(nome,sobrenome, dataDeNascimento,  nomeSocial,  genero,
					 sexo,  nomeDaMae,  cpf,  nacionalidade, pcd, idDependente, idColaborador, tipoDependente, optanteIR);
		}
	}

	@Override
	public String toString() {
		return "Dependente [pessoa=" + pessoa + ", idDependente=" + idDependente + ", idColaborador=" + idColaborador
				+ ", tipoDependente=" + tipoDependente + ", optanteIR=" + optanteIR + "]";
	}
	
	


}