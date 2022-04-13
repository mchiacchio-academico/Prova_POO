package Prova;

public class Encontrar {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Marcelo", "marcelo@gmail.com", "Prova@123");
		AchadoPerdido ap1 = new AchadoPerdido("Bolsa", "Bolsa verde", "jpg", "Feminino", "Praça", "16 Horas", "Encontrado");
		
		ap1.buscarTitulo(null);
		ap1.visualizarDetalhes();
	}

}
