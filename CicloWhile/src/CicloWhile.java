import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		do {
			System.out.println("Ingresa un par de numeros diferentes");
			n1 = input.nextInt();
			n2 = input.nextInt();
		}while(n1 != n2);
		input.close();
		System.out.println("El programa ha terminado debido a que n1 "
				+ "es igual a n2");
	}

}
