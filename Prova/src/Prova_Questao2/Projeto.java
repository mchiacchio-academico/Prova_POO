package Prova_Questao2;

public abstract class Projeto {
	//Atributos
	private String nomeProjeto;
	private String descricao;
	private String endereco;
	private String dataInicio;
	private String dataFim;
	//Construtor
	public Projeto(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim) {
		super();
		this.nomeProjeto = nomeProjeto;
		this.descricao = descricao;
		this.endereco = endereco;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}
	//Getters e Setters
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFim() {
		return dataFim;
	}
	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	//Métodos
		public abstract boolean validaProjeto(String nomeProjeto);
		public abstract String imprimeProjeto();
}
