package algoritimos;

public class ExAula2 {
	
	public static void main(String[] args) {
		
		String linhas []= {
				"Romarinho;30;atacante;cortinas",
				"sheik;40;atacante;cortinas",
				"casco;34;goleiro;cortinas"
		};
		
		for(String linha:linhas) {
			String valores[] = linha.split(";");
			System.out.println("nome:"+ valores   [0]
							+"--- Idade"+valores  [1]
							+"---cargo"	+ valores [2]
							+"---empresa"+ valores[3]);
			
		}
		
		
	}

}
