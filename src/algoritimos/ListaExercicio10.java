package algoritimos;
import java.util.Scanner;	

public class ListaExercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite vetor");
		int a = sc.nextInt();
		System.out.print("digite segundo vetor");
		int b = sc.nextInt();
		System.out.print("digite o terceiro vetor");
		int c = sc.nextInt();
		System.out.print("digite o quarto vetor");
		int d = sc.nextInt();
		System.out.print("digite o quinto vetor");
		int e = sc.nextInt();

		int zero= 0 ;
				
		int vetor[]= { a,b,c,d,e} ;
		for (int i=0; i<= vetor.length-1 ; i++) {
		System.out.println(zero = zero + vetor [i]);
		sc.close();
		}
	
	}

}
