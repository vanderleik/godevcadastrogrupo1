package br.com.proway.senior.godevcadastro.cadastro.pessoa;

import java.time.LocalDate;

import br.com.proway.senior.godevcadastro.cadastro.enums.Nacionalidades;
import br.com.proway.senior.godevcadastro.cadastro.enums.SexoPessoa;

/**
 * Classe pessoa, abstrai os atributos de uma pessoa.
 * 
 * É herdada por Colaborador, PrestadorServico e Dependente.
 * 
 * @author @author Lorran Pereira dos Santos, Samuel Levi, Sarah Neuburger
 *         Brito, Thiago Luiz Barbieri e Vitor Nathan Gonçalves.
 *
 */

public class Pessoa {

	private String nome;
	private String sobrenome;
	private LocalDate dataDeNascimento;
	private String nomeSocial;
	private String genero;
	private SexoPessoa sexo;
	private String nomeDaMae;
	private String cpf;
	private Nacionalidades nacionalidade;
	private boolean pcd = false;

	public Pessoa(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade, boolean pcd) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
		this.nomeSocial = nomeSocial;
		this.genero = genero;
		this.sexo = sexo;
		this.nomeDaMae = nomeDaMae;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
		this.pcd = pcd;
	}

	/**
	 * Construtor secundário da classe Pessoa.
	 * 
	 * NÃO inclui os atributos pcd e nomeSocial.
	 */
	public Pessoa(String nome, String sobrenome, LocalDate dataDeNascimento, String genero, SexoPessoa sexo,
			String nomeDaMae, String cpf, Nacionalidades nacionalidade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
		this.genero = genero;
		this.sexo = sexo;
		this.nomeDaMae = nomeDaMae;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
	}

	/**
	 * Construtor secundário da classe Pessoa.
	 * 
	 * NÃO inclui os atributos pcd.
	 */
	public Pessoa(String nome, String sobrenome, LocalDate dataDeNascimento, String nomeSocial, String genero,
			SexoPessoa sexo, String nomeDaMae, String cpf, Nacionalidades nacionalidade) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
		this.nomeSocial = nomeSocial;
		this.genero = genero;
		this.sexo = sexo;
		this.nomeDaMae = nomeDaMae;
		this.cpf = cpf;
		this.nacionalidade = nacionalidade;
	}

	public Pessoa() {
	}

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

	public SexoPessoa getSexo() {
		return sexo;
	}

	public void setSexo(SexoPessoa sexo) {
		this.sexo = sexo;
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

	public Nacionalidades getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(Nacionalidades nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public boolean isPcd() {
		return pcd;
	}

	public void setPcd(boolean pcd) {
		this.pcd = pcd;
	}

	/**
	 * Formatar CPF
	 * 
	 * Formata uma String que contenha um CPF para que possua apenas algarismos.
	 * 
	 * @param String cpf
	 * @return String
	 */
	public static String formatarCPF(String CPF) {
		String output = "";
		for (byte code : CPF.getBytes()) {
			if (code - 48 < 10 && code - 48 >= 0) {
				output += Character.toString((char) code);
			}
		}
		return output;
	}

	/**
	 * Validar CPF.
	 * 
	 * Utiliza o algoritmo para verificar se o CPF contido na String é válido.
	 * 
	 * @param CPF
	 * @return boolean
	 */
	public static boolean validarCPF(String CPF) {
		String CPFFormatado = Pessoa.formatarCPF(CPF);
		if (CPF.length() == 11) {

			int soma = 0;
			int mult = 10;
			for (int i = 0; i < 9; i++) {
				soma += mult * ((CPFFormatado.charAt(i) - 48));
				mult--;
			}
			if (11 - soma % 11 == CPFFormatado.charAt(9) - 48) {
				boolean valido;
			} else if (11 - soma % 11 == 10 && CPFFormatado.charAt(9) - 48 == 0) {
				boolean valido;
			} else {
				return false;
			}

			soma = 0;
			mult = 11;
			for (int i = 0; i < 10; i++) {
				soma += mult * ((CPFFormatado.charAt(i) - 48));
				mult--;
			}
			if (11 - soma % 11 == CPFFormatado.charAt(10) - 48) {
				boolean valido;
			} else if (11 - soma % 11 == 10 && CPFFormatado.charAt(10) - 48 == 0) {
				boolean valido;
			} else {
				return false;
			}

		} else {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", dataDeNascimento=" + dataDeNascimento
				+ ", nomeSocial=" + nomeSocial + ", genero=" + genero + ", sexo=" + sexo + ", nomeDaMae=" + nomeDaMae
				+ ", cpf=" + cpf + ", nacionalidade=" + nacionalidade + ", pcd=" + pcd + "]";
	}

}
