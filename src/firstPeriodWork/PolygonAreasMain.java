package firstPeriodWork;

import java.util.Scanner;

public class PolygonAreasMain {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
int option;
		
		do {
			option=menu();
			scanner.nextLine();
			
			if(option==1) {
				SqRec qr = new SqRec();
				
				System.out.println("Digite o lado A do quadrado: ");
				qr.sideA = scanner.nextDouble();
				System.out.println("Digite o lado B do quadrado: ");
				qr.sideB = scanner.nextDouble();
				System.out.println("A �rea do quadrado �: ");
				qr.areaSqAndRec();
				
			}else if(option==2) {
				SqRec qr = new SqRec();
				
				System.out.println("Digite o lado A do ret�ngulo: ");
				qr.sideA = scanner.nextDouble();
				System.out.println("Digite o lado B do ret�ngulo: ");
				qr.sideB = scanner.nextDouble();
				System.out.println("A �rea do ret�ngulo �: ");
				qr.areaSqAndRec();
				
			}else if(option==3) {
				Triangle t = new Triangle();
				
				System.out.println("Digite a base do tri�ngulo: ");
				t.base = scanner.nextDouble();
				System.out.println("Digite a altura do tri�ngulo: ");
				t.high = scanner.nextDouble();
				System.out.println("A �rea do tri�ngulo �: ");
				t.areaT();
				
			}else if(option==4) {
				Circle c = new Circle();
				
				System.out.println("Digite o raio do c�rculo: ");
				c.ray = scanner.nextDouble();
				c.areaC();
				
			}else if(option==9) {
				System.out.println("Saindo do programa...");
				
			}else {
				System.out.println("Digite uma op��o v�lida!");
			}
			
		}while(option!=9);
			System.out.println("Obrigado!");
	
		scanner.close();

	}
	
	public static int menu() {
		System.out.println("\n----CALCULANDO �REAS----\n");
		System.out.println("Escolha um pol�gono abaixo:\n ");
		System.out.println("1. Quadrado");
		System.out.println("2. Ret�ngulo");
		System.out.println("3. Tri�ngulo");
		System.out.println("4. C�rculo");
		System.out.println("9. Sair");
		
		return scanner.nextInt();
	}

}


