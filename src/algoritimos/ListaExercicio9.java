package algoritimos;
import java.util.Scanner;


public class ListaExercicio9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Digete seu sal�rio ");
		float salario = sc.nextFloat();
		
		float a = 0.3f ;

		
		System.out.println("digite o valor da sua presta��o");
		float prestacao = sc.nextFloat();
		sc.close();
		
		
		
		if(prestacao <= salario * a) {
			System.out.println("Empr�stimo concedido");
			
		}else 
			System.out.println("Empr�stimo negado ");

	}

}
