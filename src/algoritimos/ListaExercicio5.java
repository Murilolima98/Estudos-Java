package algoritimos;
import java.util.Scanner ;


public class ListaExercicio5 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Digite o primeiro valor ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite seu segundo valor ");
		int valor2 = sc.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("Valor 1 maior que valor 2");
		} else {
			System.out.println("Valor 2 é maior que valor 1 ");
		}
	
		
		

	}

}
