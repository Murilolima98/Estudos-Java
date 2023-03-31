package algoritimos;
import java.util.Scanner ;


public class Listaexercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro valor ");
		int valor1= sc.nextInt();
		
		System.out.println("Digite o segundo valor ");
		int valor2= sc.nextInt();
		sc.close();
		

			for (int i = valor1 ; i <=valor2; i++) {
			if(i%2==0) {
				System.out.println(i + "par");
			} else {
				System.out.println(i + "ímpar");
			}
			
			for(int p = valor2;  p <= valor1; p++) {
				if (p%2==0) {
					System.out.println(p + " par");
				} else {
					System.out.println(p + " Ímpar");
					
				}
			}
			}
		
	}

}
