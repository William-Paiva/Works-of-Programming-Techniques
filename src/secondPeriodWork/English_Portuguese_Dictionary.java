package secondPeriodWork;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class English_Portuguese_Dictionary {

	public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> en_us = new ArrayList<String> ();
		ArrayList<String> pt_br = new ArrayList<String> ();
		
		int option;
		
		do {
			option = menu(scanner);
			
			if(option == 9) {
				break;
			}
			if(option==1) {
				searchWord(en_us, pt_br, scanner);	
			}
			else if(option == 2) {
				add(en_us, pt_br, scanner);
			}
			else if(option == 3) {
				edit(en_us, pt_br, scanner);
			}
			else if(option == 4) {
				remove(en_us, pt_br, scanner);
			}
			else if(option == 5) {
				showArray(en_us, pt_br);
			}
			else {
				System.out.println("Digite uma op��o v�lida!!!");
			}
			
		}while(option !=9);
		System.out.println("Obrigado por usar nosso dicion�rio!");
	}	
	
	public static void showArray(ArrayList<String>en_us, ArrayList<String>pt_br) {
		System.out.println("Palavras em ingl�s: ");
		System.out.println( Arrays.toString( en_us.toArray() ) );
		System.out.println("Palavras em portugu�s: ");
		System.out.println( Arrays.toString( pt_br.toArray() ) );
	}

	public static boolean check(ArrayList<String> words, String wordAdd) {
		return words.contains(wordAdd);
	}
	
	public static void searchWord(ArrayList<String> en_us, ArrayList<String> pt_br, Scanner scanner ) {
		
	    System.out.println("Digite uma palavra em ingl�s ou em portugu�s para saber sua tradu��o: ");
		
		String wordAdd = scanner.nextLine();
		
		if(check(en_us, wordAdd)) {
			int index = en_us.indexOf(wordAdd);
			System.out.println( "A tradu��o para a palavra "+wordAdd+" � "+ pt_br.get(index)+"." );
		}
		else if(check(pt_br, wordAdd)) {
			int index = pt_br.indexOf(wordAdd);
			System.out.println( "A tradu��o para a palavra "+wordAdd+" � "+ en_us.get(index)+"." );
		}else {
			System.out.println("A palavra n�o existe no dicion�rio!");
			System.out.println("Tente novamente!");
		}	
		
	}
	
	public static void add(ArrayList<String>en_us, ArrayList<String>pt_br, Scanner scanner ) {
		    
		int subOption; 
		
		do {
			subOption = subMenu(scanner);
		if(en_us.size() > 99) {
			System.out.println("Limite atingido! Voc� n�o pode mais adicionar palavras!");
			break;
		}else if(subOption == 9) {
			break;
		}else if(subOption == 1) {
			addEn_us(en_us, pt_br, scanner);
		}else if(subOption == 2) {
			addPt_br(en_us, pt_br, scanner);
		}else {
			System.out.println("Digite uma op��o v�lida!!!");
		}
	}while((subOption != 9));
			System.out.println("Retornando ao menu principal!");
		
}

	public static void addEn_us(ArrayList<String>en_us, ArrayList<String>pt_br, Scanner scanner) {
		
		System.out.println("Digite a palavra em ingl�s que quer adicionar: ");
		String wordAddEn_us = scanner.nextLine();
		
		if(check(en_us, wordAddEn_us)) {
			System.out.println("Esta palavra j� existe, tente adicionar outra!");
		}
		else {
			en_us.add(wordAddEn_us);
			System.out.println( "Adicionando a palavra em ingl�s: "+ wordAddEn_us+"\n" );
			System.out.println("Adicione a tradu��o em portugu�s: ");
			String wordTr = scanner.nextLine();
			pt_br.add(wordTr);
			System.out.println( "Adicionando a tradu��o em portugu�s: "+wordTr );
			
		}
	}
	
	public static void addPt_br(ArrayList<String>en_us, ArrayList<String>pt_br, Scanner scanner) {
		
		System.out.println("Digite a palavra em portugu�s que quer adicionar: ");
		String wordAddPt_br = scanner.nextLine();
		
		if(check(pt_br, wordAddPt_br)) {
			System.out.println("Esta palavra j� existe, tente adicionar outra!");
		}
		else {
			pt_br.add(wordAddPt_br);
			System.out.println( "Adicionando a palavra em portugu�s: "+ wordAddPt_br+"\n" );
			System.out.println("Adicione a tradu��o em ingl�s: ");
			String wordTr = scanner.nextLine();
			en_us.add(wordTr);
			System.out.println( "Adicionando a tradu��o em ingl�s: "+wordTr );
			
		}
	}

	public static void edit(ArrayList<String> en_us, ArrayList<String>pt_br, Scanner scanner) {
		
		System.out.println("Digite a palavra em ingl�s ou em portugu�s que gostaria de editar: ");
		
		String wordEdit = scanner.nextLine();
		
		if(check(en_us, wordEdit)) {
			int index = en_us.indexOf(wordEdit);
			System.out.println("Agora digite a nova palavra:");
			en_us.set( index, new String (scanner.nextLine()));
			System.out.println( "Trocando a palavra " + wordEdit+" pela palavra " + en_us.get(index)+".");
		}
		else if(check(pt_br, wordEdit)) {
			int index = pt_br.indexOf(wordEdit);
			System.out.println("Agora digite a nova palavra:");
			pt_br.set( index, new String (scanner.nextLine()));
			System.out.println( "Trocando a palavra "+wordEdit+" pela palavra "+pt_br.get(index)+".");
		}else {
			System.out.println("A palavra n�o existe no dicion�rio!");
			System.out.println("Tente novamente!");
		}
		
	}
	
	public static void remove(ArrayList<String> en_us, ArrayList<String> pt_br, Scanner scanner) {
		
		System.out.println("== ATEN��O!!! ==\n");
		System.out.println("Lembre-se, a palavra escolhida e sua tradu��o ser�o removidas!!!\n");
		System.out.println("Digite a palavra em ingl�s ou portugu�s para remov�-las: ");
		
		String wordRemove = scanner.nextLine();
		
		if(check(en_us, wordRemove)) {
			int index = en_us.indexOf(wordRemove);
			System.out.println( "Removendo as palavras " + en_us.get(index)+" e " + pt_br.get(index));
			en_us.remove(index);
			pt_br.remove(index);
		}
		else if(check(pt_br, wordRemove)) {
			int index = pt_br.indexOf(wordRemove);
			System.out.println( "Removendo as palavras " + pt_br.get(index)+" e "+ en_us.get(index));
			pt_br.remove(index);
			en_us.remove(index);
		}else {
			System.out.println("A palavra n�o existe no dicion�rio!");
			System.out.println("Tente novamente!");
		}
	}
	
	public static int menu(Scanner scanner) {
		System.out.println("\n");
		System.out.println("=== DICION�RIO DE INGL�S/PORTUGU�S ===\n");
		System.out.println("Escolha uma das op��es abaixo: \n");
		System.out.println("1 - PROCURAR UMA PALAVRA ");
		System.out.println("2 - ADICIONAR UMA PALAVRA ");
		System.out.println("3 - EDITAR UMA PALAVRA ");
		System.out.println("4 - EXCLUIR UMA PALAVRA ");
		System.out.println("5 - VER TODAS AS PALAVRAS EXISTENTES NO DICION�RIO!!! \n");
		System.out.println("9 - SAIR ");
		int option = scanner.nextInt();
		scanner.nextLine();
		return option;
	}
	
	public static int subMenu(Scanner scanner) {
		System.out.println("\n");
		System.out.println("== ADICIONANDO PALAVRAS ==\n");
		System.out.println("Escolha:\n");
		System.out.println("1 - ADICIONAR PALAVRA EM INGL�S ");
		System.out.println("2 - ADICIONAR PALAVRA EM PORTUGU�S ");
		System.out.println("9 - VOLTAR AO MENU PRINCIPAL \n");
		int subOption = scanner.nextInt();
		scanner.nextLine();
		return subOption;
		
	}

}
