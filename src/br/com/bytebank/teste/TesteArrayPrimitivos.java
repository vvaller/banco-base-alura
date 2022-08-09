package br.com.bytebank.teste;

public class TesteArrayPrimitivos {

	// Array Utiliza []
	public static void main(String[] args) {

		int[] idades = new int[5]; // Inicializa com valor padrao
//		
//		idades[0] = 12;
//		idades[1] = 21;
//		idades[2] = 14;
//		idades[3] = 57;
//		idades[4] = 23;
//		
//		int idade1 = idades[1];
//		
//		System.out.println(idade1);

		for (int i = 0; i < idades.length; i++) {

			idades[i] = i * i * 4 ;

		}
		
		for (int i = 0; i < idades.length; i++) {

			System.out.println(idades[i]);

		}
		
		int[] refs = {1,2,3,4,5};
		
		System.out.println(refs[3]);

	}

}
