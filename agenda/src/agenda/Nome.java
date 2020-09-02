package agenda;

//import java.util.Scanner;

public class Nome extends Contato{
	private String primeiroNome;
	private String sobreNome;
	
	//Scanner entradaString = new Scanner(System.in);
	
	public Nome() {
		
		
	}
	
	public Nome(String primeiroNome, String sobreNome) {
		this.primeiroNome = primeiroNome;
		this.sobreNome = sobreNome;
		
	}
	
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
		
	}
	
	public String getPrimeiroNome() {
		return this.primeiroNome;
		
	}
	
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
		
	}
	
	public String getSobreNome() {
		return this.sobreNome;
		
	}
	
	public void cadastrar() {
		System.out.print("Nome: ");
		setPrimeiroNome(entradaString.nextLine());
		
		System.out.print("Sobrenome: ");
		setSobreNome(entradaString.nextLine());
		
	}

}
