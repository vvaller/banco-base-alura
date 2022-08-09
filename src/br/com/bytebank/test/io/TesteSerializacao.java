package br.com.bytebank.test.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws Exception {
		
		   Cliente cliente = new Cliente();
	        cliente.setNome("Vinicius");
	        cliente.setProfissao("Dev");
	        cliente.setCpf("234113131");

	        ContaCorrente cc = new ContaCorrente(222, 333);
	        cc.setTitular(cliente);
	        cc.deposita(222.3);

	        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
	        oos.writeObject(cc);
	        oos.close();

	}

}
