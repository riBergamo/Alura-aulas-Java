package br.com.bytebank.banco.testesMain.io;

import br.com.bytebank.banco.cliente.Cliente;
import br.com.bytebank.banco.conta.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();

        cliente.setNome("Riane");
        cliente.setProfissao("Dev");
        cliente.setCpf("123-569-985-05");

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.setTitular(cliente);
        cc.depositar(222.3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));//binario
        oos.writeObject(cc);

        oos.close();
    }
}
