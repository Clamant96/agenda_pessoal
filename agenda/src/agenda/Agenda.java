package agenda;

import java.util.Scanner;

public class Agenda {
	private String nomeAgenda;
	private int perfil = 0;
	private int opcao;
	private boolean lock = false;
	private int contador = 0;
	
	Contato contato = new Contato();
	Scanner entradaString = new Scanner(System.in);
	Scanner entradaInt = new Scanner(System.in);
	
	public Agenda() {
		
		
	}
	
	public Agenda(String nomeAgenda, int perfil, int opcao, boolean lock, int contador) {
		this.nomeAgenda = nomeAgenda;
		this.perfil = perfil;
		this.opcao = opcao;
		this.lock = lock;
		this.contador = contador;
		
	}
	
	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
		
	}
	
	public String getNomeAgenda() {
		return this.nomeAgenda;
		
	}
	
	public void setPerfil(int perfil) {
		this.perfil = perfil;
		
	}
	
	public int getPerfil() {
		return this.perfil;
		
	}
	
	public void setOpcao(int opcao) {
		this.opcao = opcao;
		
	}
	
	public int getOpcao() {
		return this.opcao;
		
	}
	
	public void setLock(boolean lock) {
		this.lock = lock;
		
	}
	
	public boolean getLock() {
		return this.lock;
		
	}
	
	public void setContador(int contador) {
		this.contador = contador;
		
	}
	
	public int getContador() {
		return this.contador;
		
	}
	
	Nome[] nome = new Nome[3];
	Telefone[] telefone = new Telefone[3];
	Email[] email = new Email[3];

	Nome nome1 = new Nome();
	Nome nome2 = new Nome();
	Nome nome3 = new Nome();
	Telefone telefone1 = new Telefone();
	Telefone telefone2 = new Telefone();
	Telefone telefone3 = new Telefone();
	Email email1 = new Email();
	Email email2 = new Email();
	Email email3 = new Email();
	
	public void executarContato() {
		System.out.println("Bem vindo a minha agenda pessoal");
		System.out.print("Qual o nome de sua agenda: ");
		setNomeAgenda(entradaString.nextLine());
		
		do {
			System.out.println("\nMINHA AGENDA: "+ getNomeAgenda() +"\n");
			
			System.out.println("MENU | SELECIONE UMA DAS OPCOES PARA NAVEGAR NA AGENDA\n");
			
			System.out.println("1 | CADASTRAR CONTATO");
			System.out.println("2 | VERIFICAR CONTATO");
			System.out.println("3 | EXIBIR TODOS OS CONTATO");
			System.out.println("0 | SAIR\n");
			
			System.out.print("==> ");
			setOpcao(entradaInt.nextInt());
			
			switch(getOpcao()) {
				case 1:
					System.out.println("\nPERFIL | CADASTRO DE USUARIO\n");
					cadastrandoContato();
				break;
				
				case 2:
					System.out.println("\nPERFIL | VERIFICAR CONTATO\n");
					
					System.out.println("Escolha o perfil que deseja exibir");
					
					System.out.println("Perfil 1 | "+ nome1.getPrimeiroNome() +" "+ nome1.getSobreNome());
					System.out.println("Perfil 2 | "+ nome2.getPrimeiroNome() +" "+ nome2.getSobreNome());
					System.out.println("Perfil 3 | "+ nome3.getPrimeiroNome() +" "+ nome3.getSobreNome());
					System.out.print("==> ");
					setOpcao(entradaInt.nextInt());
					
					verificarContato(getOpcao());
				break;
				
				case 3:
					System.out.println("EXIBIS TODOS CONTATOS");
					imprimirContatos();
				break;
				
				case 0:
					System.out.println("Sair");
					setLock(true);
				break;
				
				default:
					System.out.println("Opcao invalida, tente novamente!");
				break;
			
			}
			
		}while(getLock() == false);
		
	}
	
	//CADASTRAR PERFIL NOME / SOBRENOME
	public void cadastrandoContato() {		
		switch(getContador()) {
			case 0:
				nome1.cadastrar();
				telefone1.celular();
				email1.enderecoEmail();
				
				nome[getContador()] = nome1;
				telefone[getContador()] = telefone1;
				email[getContador()] = email1;
				setContador(getContador() + 1);
				
			break;
			
			case 1:
				nome2.cadastrar();
				telefone2.celular();
				email2.enderecoEmail();
				
				nome[getContador()] = nome2;
				telefone[getContador()] = telefone2;
				email[getContador()] = email2;
				setContador(getContador() + 1);
				
			break;
			
			case 2:
				nome3.cadastrar();
				telefone3.celular();
				email3.enderecoEmail();
				
				nome[getContador()] = nome3;
				telefone[getContador()] = telefone3;
				email[getContador()] = email3;
				setContador(getContador() + 1);
				
			break;
			
			default:
				System.out.println("Essa opcao nao tem como ser ativada parca");
				
			break;
		
		}
		
		contato.setNome(nome);
		contato.setTelefone(telefone);
		
	}
	
	//VERIFICAR CONTATO ESPECIFICO
	public void verificarContato(int perfilUsuario) {
		perfilUsuario--;
		
		if(perfilUsuario >= 0 && perfilUsuario <= 2 && nome[perfilUsuario] != null) {
			System.out.println("Nome: "+ nome[perfilUsuario].getPrimeiroNome() +" "+ nome[perfilUsuario].getSobreNome());
			System.out.println("Cel.: "+"("+telefone[perfilUsuario].getDdd() +") "+ telefone[perfilUsuario].getCelular());
			System.out.println("E-mail: "+ email[perfilUsuario].getEndereco() +"@"+ email[perfilUsuario].getServidor());
			
		}else {
			System.out.println("Esse perfil nao consta no sistema");
		
		}
		
	}
	
	//IMPRIMIR TODOS OS CONTATOS NA TELA
	public void imprimirContatos() {
		if(getContador() == 3) {
			if(contato != null && contato.getNome() != null) {
				/*for(Nome n : contato.getNome()) {
					System.out.println(n.getPrimeiroNome() +" "+ n.getSobreNome());
					
				}*/
				for(int i = 0; i < nome.length; i++) {
					System.out.println(nome[i].getPrimeiroNome() +" "+ nome[i].getSobreNome());
					
				}
				
			}
		}else {
			System.out.println("E necessario tres perfis cadastrados para acessar essa opcao");
			
		}
		
	}
	
}
