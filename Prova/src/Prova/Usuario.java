package Prova;

public class Usuario implements Publicacao {
	//Atributos
	private String nome;
	private String email;
	private String senha;
	//Construtor
	public Usuario(String nome, String email, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public String buscarTitulo(String titulo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void visualizarDetalhes() {
		// TODO Auto-generated method stub
		
	}
	
	
}
