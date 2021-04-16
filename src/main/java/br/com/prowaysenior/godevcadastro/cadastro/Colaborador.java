package br.com.proway.senior.cadastro;

import java.util.Date;

public class Colaborador extends Pessoa {
	
	/**
	 * Classe Colaborador
	 * 
	 * A classe Colaborador extende da classe mãe Pessoa e estancia as
	 * classes Documentos, Enderecos, Contatos e ExameMedico para
	 * concluir o cadastro do colaborador.
	 */

	/**
	 * Atributos da Classe colaborador
	 * 
	 * @param String nome
	 * @param String sobrenome
	 * @param Date dataDeNascimento
	 * @param String genero
	 * @param char sexo
	 * @param String nomeDaMae
	 * @param Long cpf
	 * @param String nacionalidade
	 * @param Long idColaborador
	 * @param Integer numCargo
	 * @param Integer nit
	 * @param boolean optanteVT
	 * @param boolean optanteVAVR
	 * @param Date dataAdmissao
	 * @param String nacionalidade
	 * @param String nacionalidade
	 * @param boolean optanteDependente
	 * @param Documentos documentos
	 * @param Enderecos endereco
	 * @param Contatos contatos
	 * @param ExameMedico exameMedico
	 * 
	 */
		
	private Long idColaborador;
	private Integer numCargo;
	private Integer nit;
	private boolean optanteVT;
	private boolean optanteVAVR;
	private Date dataAdmissao;
	private String nacionalidade;
	private boolean optanteDependente;
	//private Documentos documentos;
	//private Enderecos endereco;
	//private Contatos contatos;
	private ExameMedico exameMedico;
		
	
	// Construtores classe mãe
	public Colaborador(String nome, String sobrenome, Date dataDeNascimento, String genero, char sexo, String nomeDaMae,
			String cpf, String nacionalidade) {
		super(nome, sobrenome, dataDeNascimento, genero, sexo, nomeDaMae, cpf, nacionalidade);
	}

	public Colaborador(String nome, String sobrenome, Date dataDeNascimento, String nomeSocial, String genero,
			char sexo, String nomeDaMae, String cpf, String nacionalidade, boolean pcd) {
		super(nome, sobrenome, dataDeNascimento, nomeSocial, genero, sexo, nomeDaMae, cpf, nacionalidade, pcd);
	}
	
	
	

}
