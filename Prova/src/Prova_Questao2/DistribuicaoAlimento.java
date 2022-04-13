package Prova_Questao2;

public class DistribuicaoAlimento extends Projeto {
	//Atributos
	private String descAlimento;
	private float qtde;
	//Construtor
	public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio,
			String dataFim, String descAlimento, float qtde) {
		super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
		this.descAlimento = descAlimento;
		this.qtde = qtde;
	}
	//Getters e Setters
	public String getDescAlimento() {
		return descAlimento;
	}

	public void setDescAlimento(String descAlimento) {
		this.descAlimento = descAlimento;
	}

	public float getQtde() {
		return qtde;
	}

	public void setQtde(float qtde) {
		this.qtde = qtde;
	}
	//Métodos
	@Override
	public boolean validaProjeto(String nomeProjeto) {
		if(this.getDataFim()==null) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public String imprimeProjeto() {
		return ("Nome do projeto: "+this.getNomeProjeto()+"\nDescrição: "+this.getDescricao()+"\nData de inicio: "+this.getDataInicio()+"\nData de fim: "+this.getDataFim()+"\nDescrição do Alimento: "+"\nQuantidade: "+qtde);
	}
}