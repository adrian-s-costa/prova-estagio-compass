public class Usuario {
	private String[] nome = {"gatao", "bob"};
	private String[] senha = {"123", "321"};
	
	
	public boolean validarUser(String nome, String senha, int indice) {
		if(this.nome[indice].equals(nome) && this.senha[indice].equals(senha)) {
			return true;
		} 
		return false;
	}
	
	
	
}
