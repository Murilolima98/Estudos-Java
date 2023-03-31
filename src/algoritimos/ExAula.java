package algoritimos;

public class ExAula {

	public static void main(String[] args) {
		String nome= "Olha";
		String sobrenome =" O Romarinhooooo";
		String nomeCompleto;
		
		System.out.println(nome.toUpperCase() + "" + sobrenome.toUpperCase());
		System.out.println(nome.toLowerCase() + "" + sobrenome.toLowerCase());
		System.out.println(nome.concat(""+sobrenome));
		
		
		nomeCompleto = nome.concat(""+ sobrenome);
		System.out.println(nomeCompleto.length());
		System.out.println(nomeCompleto.isBlank());
		System.out.println(nomeCompleto.isEmpty());
		
		String separado [] = nomeCompleto.split("");
		System.out.println(separado.length);
		
		for (int i =0 ; i <=separado.length - 1; i ++) {
			System.out.println(separado[i]);
		}
		System.out.println(nomeCompleto.substring(6));
		
		
	}
	
	
	

}
