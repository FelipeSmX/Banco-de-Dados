package banco;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		ConexaoBanco bank =  new ConexaoBanco();
		char esc,esc2='A';
		String e;
		
		System.out.println("Bem-vindos ao nosso Projeto: Brigadeiro com Cafe");
		System.out.println("Vamos comecar...");
		System.out.println();
		bank.conexao();
		
		
		do {
			System.out.println();
			System.out.println("Agora escolha uma opcao: \n"
				+ "[C] - Consultar tabela \n"
				+ "[I] - Inserir na tabela \n"
				+ "[U] - Atualizar registros \n"
				+ "[R] - Remover registro \n"
				+ "[J] - Ver todas as tabelas(join) \n"
				+ "[S] - Sair do sistema \n");
		do {
			Scanner scn = new Scanner(System.in);
			e = scn.next();
			esc = e.charAt(0);
			esc = Character.toUpperCase(esc);
			
		} while (esc!='C' && esc!='I' && esc!='U' && esc!='R' && esc!='J' && esc!='S');	
		if(esc=='C' || esc=='I' || esc=='U' || esc=='R') {
			do {
				System.out.println("Informe qual é a tabela que voce quer: \n"
				+ "Aluno = [A] ou Curso = [C]");
				Scanner scn = new Scanner(System.in);
				e = scn.next();
				esc2 = e.charAt(0);
				esc2 = Character.toUpperCase(esc2);
			}while(esc2!='A' && esc2!='C');
			
		}
		
		switch (esc) {
		case 'C': {
			if(esc2=='A') {
				System.out.println("Consultando tabela aluno");
				bank.ConsultTabAlun();
			}else {
			System.out.println("Consultando tabela curso");
			bank.ConsultTabCrs();}
		}break;
		
		case 'I': {
			if(esc2=='A') {
				System.out.println("Inserindo na tabela aluno");
				bank.inserirAlun();
			}else {
			System.out.println("Inserindo na tabela curso");
			bank.inserirCurs();}
		}break;
		
		case 'U': {
			if(esc2=='A') {
				System.out.println("Atualizando a tabela aluno");
				bank.atualizarAlun();
			}else {
			System.out.println("Atualizando a tabela curso");
			bank.atualizarCurs();}
		}break;
		
		case 'R': {
			if(esc2=='A') {
				System.out.println("Removendo um registro da tabela aluno");
				bank.removerAlun();
			}else {
			System.out.println("Removendo um registro da tabela curso");
			bank.removerCurs();
			}
		}break;
		
		case 'J': {
			System.out.println("Consultando Join...");
			bank.innerJoin();
		}break;
		
		case 'S': {
			System.out.println("Finalizando Sistema...");
		
		}break;
		
		}
		
		
		} while (esc!='S');
		bank.fecharConexao();
		
	}

}
