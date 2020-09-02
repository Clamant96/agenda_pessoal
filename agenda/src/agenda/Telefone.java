package agenda;

public class Telefone extends Contato{
	private String ddd;
	private String celular;
	
	public Telefone() {
		
		
	}
	
	public Telefone(String ddd, String celular) {
		this.ddd = ddd;
		this.celular = celular;
		
	}
	
	public void setDdd(String ddd) {
		this.ddd = ddd;
		
	}
	
	public String getDdd() {
		return this.ddd;
		
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
		
	}
	
	public String getCelular() {
		return this.celular;
		
	}
	
	public void celular() {
		System.out.print("DDD: ");
		setDdd(entradaString.nextLine());
		
		System.out.print("Numero: ");
		setCelular(entradaString.nextLine());
		
	}

}
