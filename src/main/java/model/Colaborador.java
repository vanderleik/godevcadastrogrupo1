package model;

import java.time.LocalDate;
import java.util.ArrayList;
import enums.EMDadosGeograficos.Cidades;
import enums.EMDadosGeograficos.Nacionalidade;
import enums.EMDadosGeograficos.Pais;
import enums.EMDadosPessoais.SexoPessoa;
import enums.EMDadosGeograficos.UF;
import model.Pessoa.PessoaBuilder;

public class Colaborador{

	/**
	 * Classe Colaborador.
	 * 
	 * A classe Colaborador extende da classe mãe Pessoa e instancia as classes
	 * Documentos, Enderecos, Contatos e ExameMedico para concluir o cadastro do
	 * colaborador.
	 * 
	 * @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger Brito, Thiago
	 *         Luiz Barbieri e Vitor Nathan Gonçalves.
	 */
	
	private Pessoa pessoa;
	private Integer idColaborador;
	private Integer numCargo;
	private Integer nit;
	private boolean optanteVT;
	private boolean optanteVAVR;
	private LocalDate dataAdmissao;
	private boolean optanteDependente;
	private Cidades cidadeNascimento;
	private UF UfNascimento;
	private Pais paisNascimento;
	private Documentos documentos;
	private Endereco endereco;
	private Contatos contatos;
	private ExameMedico exameMedico;

	public Colaborador(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidade nacionalidade, boolean pcd,
			Integer idColaborador, Integer numCargo, Integer nit, boolean optanteVT, boolean optanteVAVR,
			LocalDate dataAdmissao, boolean optanteDependente, Cidades cidadeNascimento,
			UF ufNascimento, Pais paisNascimento, Documentos documentos, Endereco endereco,
			Contatos contatos, ExameMedico exameMedico) {
		
		this.pessoa = new Pessoa.PessoaBuilder().nome(nome).sobrenome(sobrenome).dataDeNascimento(dataDeNascimento).nomeSocial(nomeSocial).genero(genero)
				.sexo(sexo).nomeDaMae(nomeDaMae).cpf(cpf).nacionalidade(nacionalidade).pcd(pcd).criarPessoa();
		
		this.idColaborador = idColaborador;
		this.numCargo = numCargo;
		this.nit = nit;
		this.optanteVT = optanteVT;
		this.optanteVAVR = optanteVAVR;
		this.dataAdmissao = dataAdmissao;
		this.optanteDependente = optanteDependente;
		this.cidadeNascimento = cidadeNascimento;
		this.UfNascimento = ufNascimento;
		this.paisNascimento = paisNascimento;
		this.documentos = documentos;
		this.endereco = endereco;
		this.contatos = contatos;
		this.exameMedico = exameMedico;
	}

	public Colaborador() {
		super();
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Integer getIdColaborador() {
		return idColaborador;
	}

	public void setIdColaborador(Integer idColaborador) {
		this.idColaborador = idColaborador;
	}

	public Integer getNumCargo() {
		return numCargo;
	}

	public void setNumCargo(Integer numCargo) {
		this.numCargo = numCargo;
	}

	public Integer getNit() {
		return nit;
	}

	public void setNit(Integer nit) {
		this.nit = nit;
	}

	public boolean isOptanteVT() {
		return optanteVT;
	}

	public void setOptanteVT(boolean optanteVT) {
		this.optanteVT = optanteVT;
	}

	public boolean isOptanteVAVR() {
		return optanteVAVR;
	}

	public void setOptanteVAVR(boolean optanteVAVR) {
		this.optanteVAVR = optanteVAVR;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public boolean isOptanteDependente() {
		return optanteDependente;
	}

	public void setOptanteDependente(boolean optanteDependente) {
		this.optanteDependente = optanteDependente;
	}

	public Cidades getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setCidadeNascimento(Cidades cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	public UF getUfNascimento() {
		return UfNascimento;
	}

	public void setUfNascimento(UF ufNascimento) {
		UfNascimento = ufNascimento;
	}

	public Pais getPaisNascimento() {
		return paisNascimento;
	}

	public void setPaisNascimento(Pais paisNascimento) {
		this.paisNascimento = paisNascimento;
	}

	public Documentos getDocumentos() {
		return documentos;
	}

	public void setDocumentos(Documentos documentos) {
		this.documentos = documentos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contatos getContatos() {
		return contatos;
	}

	public void setContatos(Contatos contatos) {
		this.contatos = contatos;
	}

	public ExameMedico getExameMedico() {
		return exameMedico;
	}

	public void setExameMedico(ExameMedico exameMedico) {
		this.exameMedico = exameMedico;
	}


	@Override
	public String toString() {
		return "Colaborador [pessoa=" + pessoa + ", idColaborador=" + idColaborador + ", numCargo=" + numCargo
				+ ", nit=" + nit + ", optanteVT=" + optanteVT + ", optanteVAVR=" + optanteVAVR + ", dataAdmissao="
				+ dataAdmissao + ", optanteDependente=" + optanteDependente + ", cidadeNascimento=" + cidadeNascimento
				+ ", UfNascimento=" + UfNascimento + ", paisNascimento=" + paisNascimento + ", documentos=" + documentos
				+ ", endereco=" + endereco + ", contatos=" + contatos + ", exameMedico=" + exameMedico + "]";
	}
	
	//BUILDER
	public static class ColaboradorBuilder {
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
		private Integer idColaborador;
		private Integer numCargo;
		private Integer nit;
		private boolean optanteVT;
		private boolean optanteVAVR;
		private LocalDate dataAdmissao;
		private boolean optanteDependente;
		private Cidades cidadeNascimento;
		private UF UfNascimento;
		private Pais paisNascimento;
		private Documentos documentos;
		private Endereco endereco;
		private Contatos contatos;
		private ExameMedico exameMedico;
		
		public ColaboradorBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public ColaboradorBuilder sobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
			return this;
		}
		

		public ColaboradorBuilder dataDeNascimento(LocalDate dataDeNascimento) {
			this.dataDeNascimento = dataDeNascimento;
			return this;
		}
		
		public ColaboradorBuilder nomeSocial(String nomeSocial) {
			this.nomeSocial = nomeSocial;
			return this;
		}
		
		public ColaboradorBuilder genero(String genero) {
			this.genero = genero;
			return this;
		}
		
		public ColaboradorBuilder sexo(SexoPessoa sexo) {
			this.sexo = sexo;
			return this;
		}
		public ColaboradorBuilder nomeDaMae(String nomeDaMae) {
			this.nomeDaMae = nomeDaMae;
			return this;
		}
		

		public ColaboradorBuilder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
		
		public ColaboradorBuilder nacionalidade(Nacionalidade nacionalidade) {
			this.nacionalidade = nacionalidade;
			return this;
		}
	
		public ColaboradorBuilder pcd(Boolean pcd) {
			this.pcd = pcd;
			return this;
		}
		
		public ColaboradorBuilder idColaborador(int idColaborador) {
			this.idColaborador = idColaborador;
			return this;
		}
		
		public ColaboradorBuilder numCargo(int numCargo) {
			this.numCargo = numCargo;
			return this;
		}
		
		public ColaboradorBuilder nit(int nit) {
			this.nit = nit;
			return this;
		}
		
		public ColaboradorBuilder optanteVT(boolean optanteVT) {
			this.optanteVT = optanteVT;
			return this;
		}
		
		public ColaboradorBuilder optanteVAVR(Boolean optanteVAVR) {
			this.optanteVAVR = optanteVAVR;
			return this;
		}
		
		public ColaboradorBuilder dataAdmissao(LocalDate dataAdmissao) {
			this.dataAdmissao = dataAdmissao;
			return this;
		}
		
		public ColaboradorBuilder optanteDependente(boolean optanteDependente) {
			this.optanteDependente = optanteDependente;
			return this;
		}
		
		public ColaboradorBuilder cidadeNascimento(Cidades cidadeNascimento) {
			this.cidadeNascimento = cidadeNascimento;
			return this;
		}
		
		public ColaboradorBuilder UfNascimento(UF UfNascimento) {
			this.UfNascimento = UfNascimento;
			return this;
		}
		
		public ColaboradorBuilder paisNascimento(Pais paisNascimento) {
			this.paisNascimento = paisNascimento;
			return this;
		}
		
		public ColaboradorBuilder documentos(Documentos documentos) {
			this.documentos = documentos;
			return this;
		}
		public ColaboradorBuilder endereco(Endereco endereco) {
			this.endereco = endereco;
			return this;
		}
		public ColaboradorBuilder contatos(Contatos contatos) {
			this.contatos = contatos;
			return this;
		}
		public ColaboradorBuilder exameMedico(ExameMedico exameMedico) {
			this.exameMedico = exameMedico;
			return this;
		}
		public Colaborador criarColaborador() {
			return new Colaborador(nome,sobrenome, dataDeNascimento,  nomeSocial,  genero,
					 sexo,  nomeDaMae,  cpf,  nacionalidade, pcd, idColaborador, numCargo, nit, optanteVT, optanteVAVR, dataAdmissao,
					 optanteDependente, cidadeNascimento, UfNascimento, paisNascimento, documentos, endereco, contatos, exameMedico);
		}
	}
}
