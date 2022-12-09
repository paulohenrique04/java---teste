package teste01;

public class main {
	
	public static void main(String [] args) {
		Fornecedor fornecedor = new Fornecedor("Fornecedor X", "Fortaleza - CE", "3555-9888", 120000, 20000);
	    fornecedor.Exibir();

	    Empregado empregado = new Empregado("Jorge Gonsalves", "Quixadá - CE", "88981089765", 222, 2400);
	    empregado.Exibir();
	}
}
