package model;

import java.time.LocalDate;

import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosPessoais.IdentidadeGenero;

/**
 * Classe pessoa, abstrai os atributos de uma pessoa.
 * 
 * É instanciada em Colaborador, PrestadorServico e Dependente.
 * 
 * Deve ser instanciada utilizando o PessoaBuilder.
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger
 *         Brito, Thiago Luiz Barbieri e Vitor Nathan Gonçalves.
 *         
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com> 
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Vitor <vitornathang@gmail.com>
 */

public class Pessoa{

	private String nome;
	private String sobrenome;
	private LocalDate dataDeNascimento;
	private String nomeSocial;
	private String genero;
	private IdentidadeGenero identidadeGenero;
	private String nomeDaMae;
	private String cpf;
	private Nacionalidade nacionalidade;
	private boolean pcd = false;

	public Pessoa(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			IdentidadeGenero identidadeGenero, String nomeDaMae, String cpf, Nacionalidade nacionalidade, boolean pcd) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
		this.nomeSocial = nomeSocial;
		this.genero = genero;
		this.identidadeGenero = identidadeGenero;
		this.nomeDaMae = nomeDaMae;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
		this.pcd = pcd;
	}

	public Pessoa() {}

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

	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(LocalDate dataDeNascimento) {
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

	public IdentidadeGenero getSexo() {
		return identidadeGenero;
	}

	public void setSexo(IdentidadeGenero identidadeGenero) {
		this.identidadeGenero = identidadeGenero;
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

	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public boolean isPcd() {
		return pcd;
	}

	public void setPcd(boolean pcd) {
		this.pcd = pcd;
	}
	
	/**
	 * Cria Pessoa.
	 *
	 * É utilizado para criar um objeto da classe Pessoa.
	 * 
	 * Exemplo de uso:
	 * Pessoa pessoa = new Pessoa.PessoaBuilder().nome("José").
				sobrenome("Bezerra").dataDeNascimento(LocalDate.of(1986, 4, 23)).....criarPessoa(); //Utilizar quantos atributos
				forem necessários
	 *
	 * @author Bruna <sh4323202@gmail.com>
	 * @author Enzo <enzomm.bodyandmind@gmail.com> 
	 * @author Sabrina <sabrinaschmidt335@gmail.com>
	 * @author Vanderlei <vanderleik@yahoo.com.br>
	 * @author Vitor <vitornathang@gmail.com>
	 */
	public static class PessoaBuilder {
		
		private String nome;
		private String sobrenome;
		private LocalDate dataDeNascimento;
		private String nomeSocial;
		private String genero;
		private IdentidadeGenero identidadeGenero;
		private String nomeDaMae;
		private String cpf;
		private Nacionalidade nacionalidade;
		private boolean pcd;
		
		public PessoaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public PessoaBuilder sobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
			return this;
		}

		public PessoaBuilder dataDeNascimento(LocalDate dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
			return this;
		}
		
		public PessoaBuilder nomeSocial(String nomeSocial) {
			this.nomeSocial = nomeSocial;
			return this;
		}
		
		public PessoaBuilder genero(String genero) {
			this.genero = genero;
			return this;
		}
		
		public PessoaBuilder identidadeGenero(IdentidadeGenero identidadeGenero) {
			this.identidadeGenero = identidadeGenero;
			return this;
		}
	
		public PessoaBuilder nomeDaMae(String nomeDaMae) {
			this.nomeDaMae = nomeDaMae;
			return this;
		}
		
		public PessoaBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
		
		public PessoaBuilder nacionalidade(Nacionalidade nacionalidade) {
			this.nacionalidade = nacionalidade;
			return this;
		}
	
		public PessoaBuilder pcd(Boolean pcd) {
			this.pcd = pcd;
			return this;
		}
		
		public Pessoa criarPessoa() {
			return new Pessoa(nome,sobrenome, dataDeNascimento,  nomeSocial,  genero,
					 identidadeGenero,  nomeDaMae,  cpf,  nacionalidade, pcd);
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", dataDeNascimento=" + dataDeNascimento
				+ ", nomeSocial=" + nomeSocial + ", genero=" + genero + ", identidadeGenero=" + identidadeGenero + ", nomeDaMae=" + nomeDaMae
				+ ", cpf=" + cpf + ", nacionalidade=" + nacionalidade + ", pcd=" + pcd + "]";
	}
}
