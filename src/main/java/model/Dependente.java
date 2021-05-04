package model;

import java.time.LocalDate;
import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosPessoais.IdentidadeGenero;
import enums.EMDadosPessoais.TiposDependentes;

/**
 * Classe Dependente
 * Esta classe instancia a classe Pessoa para o cadastro de Dependente.
 * Deve ser instancianda usando DependenteBuilder.
 * 
 * 
 * 
 * 
 * 
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Guilherme Ezequiel <guilhermeezequieldasilva@gmail.com>
 * 
 * 
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gonçalves.        
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com> 
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 *
 */

public class Dependente {
	private int colaboradorId;
	private int pessoaId;

	private Pessoa pessoa;
	private Integer idDependente;
	private TiposDependentes tipoDependente;
	private boolean optanteIR;

//	public Dependente(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
//			IdentidadeGenero identidadeGenero, String nomeDaMae, String cpf, Nacionalidade nacionalidade, boolean pcd, Integer id,
//			Integer idColaborador, TiposDependentes tipoDependente, boolean optanteIR) {
//		this.pessoa = new Pessoa.PessoaBuilder().nome(nome).sobrenome(sobrenome).dataDeNascimento(dataDeNascimento).nomeSocial(nomeSocial).
//				genero(genero).identidadeGenero(identidadeGenero).nomeDaMae(nomeDaMae).cpf(cpf).nacionalidade(nacionalidade).pcd(pcd).criarPessoa();
//		this.idDependente = id;
//		this.idColaborador = idColaborador;
//		this.tipoDependente = tipoDependente;
//		this.optanteIR = optanteIR;
//	}

	
	
	/**
	 * Cria Dependente.
	 *
	 * É utilizado para criar um objeto da classe Dependente.
	 * 
	 * Exemplo de uso:
	 * Dependente dependente = new Dependente.DependenteBuilder().nome("José").
				sobrenome("Bezerra").dataDeNascimento(LocalDate.of(1986, 4, 23)).....criarDependente() //Colocar quantos atributos
				forem necessários
	*/
	
	public static class DependenteBuilder {
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

		public IdentidadeGenero getIdentidadeGenero() {
			return identidadeGenero;
		}

		public void setIdentidadeGenero(IdentidadeGenero identidadeGenero) {
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

		public Integer getIdDependente() {
			return idDependente;
		}

		public void setIdDependente(Integer idDependente) {
			this.idDependente = idDependente;
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
			return "DependenteBuilder [nome=" + nome + ", sobrenome=" + sobrenome + ", dataDeNascimento="
					+ dataDeNascimento + ", nomeSocial=" + nomeSocial + ", genero=" + genero + ", identidadeGenero="
					+ identidadeGenero + ", nomeDaMae=" + nomeDaMae + ", cpf=" + cpf + ", nacionalidade="
					+ nacionalidade + ", pcd=" + pcd + ", idDependente=" + idDependente + ", idColaborador="
					+ idColaborador + ", tipoDependente=" + tipoDependente + ", optanteIR=" + optanteIR + "]";
		}
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
		
		public DependenteBuilder identidadeGenero(IdentidadeGenero identidadeGenero) {
			this.identidadeGenero = identidadeGenero;
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
	}	
}
		
//		public Dependente criarDependente() {
//			return new Dependente(nome,sobrenome, dataDeNascimento,  nomeSocial,  genero,
//					 identidadeGenero,  nomeDaMae,  cpf,  nacionalidade, pcd, idDependente, idColaborador, tipoDependente, optanteIR);
//		}
//	}

