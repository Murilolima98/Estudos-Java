package algoritimos;
import java.util.Scanner;

public class ListaExercicio4 {
	
	public static void main(String[] args) {
		
	
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um valor");
		int valor = sc.nextInt();
	
		if(valor >256) {
		System.out.println("Seu valor � maior que 256");
		} else {
		System.out.println("Seu valor � menor que 256");
		}
	}
}