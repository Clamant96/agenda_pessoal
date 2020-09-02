package agenda;

import java.util.Scanner;

public class Contato{
	private Nome[] nome;
	private Telefone[] telefone;
	private Email[] email;
	
	Scanner entradaString = new Scanner(System.in);
	
	public Contato() {
		
		
	}
	
	public Contato(Nome[] nome, Telefone[] telefone, Email[] email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		
	}
	
	public void setNome(Nome[] nome) {
		this.nome = nome;
		
	}
	
	public Nome[] getNome() {
		return this.nome;
		
	}
	
	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
		
	}
	
	public Telefone[] getTelefone() {
		return this.telefone;
		
	}
	
	public void setEmail(Email[] email) {
		this.email = email;
		
	}
	
	public Email[] getEmail() {
		return this.email;
		
	}
	
}
