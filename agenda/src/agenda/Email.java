package agenda;

public class Email extends Contato{
	private String endereco;
	private String servidor;
	
	public Email() {
		
		
	}
	
	public Email(String endereco, String servidor) {
		this.endereco = endereco;
		this.servidor = servidor;
		
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
		
	}
	
	public String getEndereco() {
		return this.endereco;
		
	}
	
	public void setServidor(String servidor) {
		this.servidor = servidor;
		
	}
	
	public String getServidor() {
		return this.servidor;
		
	}
	
	public void enderecoEmail() {
		System.out.print("Endereco: ");
		setEndereco(entradaString.nextLine());
		
		System.out.print("@Servidor: ");
		setServidor(entradaString.nextLine());
		
	}

}
