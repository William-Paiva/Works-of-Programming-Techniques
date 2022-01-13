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
				System.out.println("A área do quadrado é: ");
				qr.areaSqAndRec();
				
			}else if(option==2) {
				SqRec qr = new SqRec();
				
				System.out.println("Digite o lado A do retângulo: ");
				qr.sideA = scanner.nextDouble();
				System.out.println("Digite o lado B do retângulo: ");
				qr.sideB = scanner.nextDouble();
				System.out.println("A área do retângulo é: ");
				qr.areaSqAndRec();
				
			}else if(option==3) {
				Triangle t = new Triangle();
				
				System.out.println("Digite a base do triângulo: ");
				t.base = scanner.nextDouble();
				System.out.println("Digite a altura do triângulo: ");
				t.high = scanner.nextDouble();
				System.out.println("A área do triângulo é: ");
				t.areaT();
				
			}else if(option==4) {
				Circle c = new Circle();
				
				System.out.println("Digite o raio do círculo: ");
				c.ray = scanner.nextDouble();
				c.areaC();
				
			}else if(option==9) {
				System.out.println("Saindo do programa...");
				
			}else {
				System.out.println("Digite uma opção válida!");
			}
			
		}while(option!=9);
			System.out.println("Obrigado!");
	
		scanner.close();

	}
	
	public static int menu() {
		System.out.println("\n----CALCULANDO ÁREAS----\n");
		System.out.println("Escolha um polígono abaixo:\n ");
		System.out.println("1. Quadrado");
		System.out.println("2. Retângulo");
		System.out.println("3. Triângulo");
		System.out.println("4. Círculo");
		System.out.println("9. Sair");
		
		return scanner.nextInt();
	}

}


