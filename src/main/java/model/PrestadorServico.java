package model;

import java.time.LocalDate;

import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosPessoais.IdentidadeGenero;

/**
 * Classe que abstrai as informações do prestador de serviço contratado.
 * 
 * Possui instância de Pessoa e Contatos.
 * 
 * Deve ser instanciada utilizando o PrestadorServicoBuilder.
 * 
 * @author Vanderlei <vanderleik@yahoo.com.br>
 * @author Guilherme Ezequiel <guilhermeezequieldasilva@gmail>
 * 
 * @author Bruna <sh4323202@gmail.com>
 * @author Enzo <enzomm.bodyandmind@gmail.com>
 * @author Sabrina <sabrinaschmidt335@gmail.com>
 * @author Vitor <vitornathang@gmail.com>
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gonçalves.
 * 
 */

public class PrestadorServico {
	public Integer getPessoaId() {
		return pessoaId;
	}

	public void setPessoaId(Integer pessoaId) {
		this.pessoaId = pessoaId;
	}

	public LocalDate getDataInicioContrato() {
		return dataInicioContrato;
	}

	public void setDataInicioContrato(LocalDate dataInicioContrato) {
		this.dataInicioContrato = dataInicioContrato;
	}

	public void setEmpresaId(Integer empresaId) {
		this.empresaId = empresaId;
	}

	public Integer getEmpresaId() {
		return empresaId;
	}

	private Integer empresaId;
	private Integer pessoaId;
	private LocalDate dataInicioContrato;

//
//	public PrestadorServico(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
//			IdentidadeGenero identidadeGenero, String nomeDaMae, String cpf, Nacionalidade nacionalidade, boolean pcd,
//			Integer idPrestadorServico, LocalDate dataInicioContrato, Integer idEmpresa, Integer idSetor,
//			Contatos contatos) {
//		this.pessoa = new Pessoa.PessoaBuilder().nome(nome).sobrenome(sobrenome).dataDeNascimento(dataDeNascimento).nomeSocial(nomeSocial).genero(genero)
//				.identidadeGenero(identidadeGenero).nomeDaMae(nomeDaMae).cpf(cpf).nacionalidade(nacionalidade).pcd(pcd).criarPessoa();
//		this.idPrestadorServico = idPrestadorServico;
//		this.dataInicioContrato = dataInicioContrato;
//		this.idEmpresa = idEmpresa;
//		this.idSetor = idSetor;
//		this.contatos = contatos;
//	}

	/**
	 * Cria PrestadorServico.
	 *
	 * É utilizado para criar um objeto da classe PrestadorServico.
	 * 
	 * Exemplo de uso: PrestadorServico prestadorServico = new
	 * PrestadorServico.PrestadorServicoBuilder().
	 * nome("Luana").sobrenome("Silva").dataDeNascimento(LocalDate.of(2002, 05,
	 * 21)). genero("Feminino")....criarPessoa(); Utilizar quantos atributos forem
	 * necessários
	 * 
	 */
	public static class PrestadorServicoBuilder {

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

		public Integer getIdPrestadorServico() {
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

		public Integer getIdEmpresa() {
			return idEmpresa;
		}

		public void setIdEmpresa(Integer idEmpresa) {
			this.idEmpresa = idEmpresa;
		}

		public Integer getIdSetor() {
			return idSetor;
		}

		public void setIdSetor(Integer idSetor) {
			this.idSetor = idSetor;
		}

		public Contatos getContatos() {
			return contatos;
		}

		public void setContatos(Contatos contatos) {
			this.contatos = contatos;
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
		private boolean pcd = false;
		private Integer idPrestadorServico;
		private LocalDate dataInicioContrato;
		private Integer idEmpresa;
		private Integer idSetor;
		private Contatos contatos;

		public PrestadorServicoBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public PrestadorServicoBuilder sobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
			return this;
		}

		public PrestadorServicoBuilder dataDeNascimento(LocalDate dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
			return this;
		}

		public PrestadorServicoBuilder nomeSocial(String nomeSocial) {
			this.nomeSocial = nomeSocial;
			return this;
		}

		public PrestadorServicoBuilder genero(String genero) {
			this.genero = genero;
			return this;
		}

		public PrestadorServicoBuilder identidadeGenero(IdentidadeGenero identidadeGenero) {
			this.identidadeGenero = identidadeGenero;
			return this;
		}

		public PrestadorServicoBuilder nomeDaMae(String nomeDaMae) {
			this.nomeDaMae = nomeDaMae;
			return this;
		}

		public PrestadorServicoBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}

		public PrestadorServicoBuilder nacionalidade(Nacionalidade nacionalidade) {
			this.nacionalidade = nacionalidade;
			return this;
		}

		public PrestadorServicoBuilder pcd(Boolean pcd) {
			this.pcd = pcd;
			return this;
		}

		public PrestadorServicoBuilder idPrestadorServico(Integer idPrestadorServico) {
			this.idPrestadorServico = idPrestadorServico;
			return this;
		}

		public PrestadorServicoBuilder dataInicioContrato(LocalDate dataInicioContrato) {
			this.dataInicioContrato = dataInicioContrato;
			return this;
		}

		public PrestadorServicoBuilder idEmpresa(Integer idEmpresa) {
			this.idEmpresa = idEmpresa;
			return this;
		}

		public PrestadorServicoBuilder idSetor(Integer idSetor) {
			this.idSetor = idSetor;
			return this;
		}

		public PrestadorServicoBuilder contatos(Contatos contatos) {
			this.contatos = contatos;
			return this;
		}

//		public PrestadorServico criarPrestadorServico() {
//			return new PrestadorServico(nome,sobrenome, dataDeNascimento,  nomeSocial,  genero,
//					identidadeGenero,  nomeDaMae,  cpf,  nacionalidade, pcd, idPrestadorServico,
//					dataInicioContrato, idEmpresa, idSetor, contatos);
//		}
	}

	@Override
	public String toString() {
		return "PrestadorServico [empresaId=" + empresaId + ", pessoaId=" + pessoaId + ", dataInicioContrato="
				+ dataInicioContrato + "]";
	}

}
