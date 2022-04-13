package Prova_Questao2;

public class TrabalhoVoluntario extends Projeto {
	//Atributos
	private String tipoTrabalho;
	private int duracaoTrabalho;
	//Construtor
	public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim,
			String tipoTrabalho, int duracaoTrabalho) {
		super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
		this.tipoTrabalho = tipoTrabalho;
		this.duracaoTrabalho = duracaoTrabalho;
	}
	//Getters e Setters
	public String getTipoTrabalho() {
		return tipoTrabalho;
	}

	public void setTipoTrabalho(String tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho;
	}

	public int getDuracaoTrabalho() {
		return duracaoTrabalho;
	}

	public void setDuracaoTrabalho(int duracaoTrabalho) {
		this.duracaoTrabalho = duracaoTrabalho;
	}
	//Métodos
	@Override
	public boolean validaProjeto(String nomeProjeto) {
		if(duracaoTrabalho>2) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String imprimeProjeto() {
		return ("Nome do projeto: "+this.getNomeProjeto()+"\nDescrição: "+this.getDescricao()+"\nData de inicio: "+this.getDataInicio()+"\nData de fim: "+this.getDataFim()+"\nTipo do trabalho: "+this.getTipoTrabalho()+"\nDuração do trabalho: "+this.getDuracaoTrabalho());
	}
}
