package algoritimos;
import java.util.Scanner;


public class ListaExercicio9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Digete seu salário ");
		float salario = sc.nextFloat();
		
		float a = 0.3f ;

		
		System.out.println("digite o valor da sua prestação");
		float prestacao = sc.nextFloat();
		sc.close();
		
		
		
		if(prestacao <= salario * a) {
			System.out.println("Empréstimo concedido");
			
		}else 
			System.out.println("Empréstimo negado ");

	}

}
