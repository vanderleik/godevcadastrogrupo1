package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosPessoais.SexoPessoa;
import model.Pessoa.PessoaBuilder;

/**
 * Classe que abstrai as informações do prestador de serviço contratado.
 * 
 * Possui instância de Contatos.
 * 
 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
 *         Luiz Barbieri e Vitor Nathan Gonçalves.
 */

public class PrestadorServico {

	private Pessoa pessoa;
	private Integer idPrestadorServico;
	private LocalDate dataInicioContrato;
	private Integer idEmpresa;
	private Integer idSetor;
	private Contatos contatos;

	public PrestadorServico(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidade nacionalidade, boolean pcd,
			Integer idPrestadorServico, LocalDate dataInicioContrato, Integer idEmpresa, Integer idSetor,
			Contatos contatos) {
		this.pessoa = new Pessoa.PessoaBuilder().nome(nome).sobrenome(sobrenome).dataDeNascimento(dataDeNascimento).nomeSocial(nomeSocial).genero(genero)
				.sexo(sexo).nomeDaMae(nomeDaMae).cpf(cpf).nacionalidade(nacionalidade).pcd(pcd).criarPessoa();
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

	public static class PrestadorServicoBuilder {
		private String nome;
		private String sobrenome;
		private LocalDate dataDeNascimento;
		private String nomeSocial;
		private String genero;
		private SexoPessoa sexo;
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

		public PrestadorServicoBuilder sexo(SexoPessoa sexo) {
			this.sexo = sexo;
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

		public PrestadorServico criarPrestadorServico() {
			return new PrestadorServico(nome,sobrenome, dataDeNascimento,  nomeSocial,  genero,
					sexo,  nomeDaMae,  cpf,  nacionalidade, pcd, idPrestadorServico,
					dataInicioContrato, idEmpresa, idSetor, contatos);
		}
	}

	@Override
	public String toString() {
		return "PrestadorServico [pessoa=" + pessoa + ", idPrestadorServico=" + idPrestadorServico
				+ ", dataInicioContrato=" + dataInicioContrato + ", idEmpresa=" + idEmpresa + ", idSetor=" + idSetor
				+ ", contatos=" + contatos + "]";
	}
	
	
}
