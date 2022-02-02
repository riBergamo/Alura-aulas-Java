package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;
//LISTA SÓ GUARDA REFRENCIAS!
public class TesteWrapperInteger {
    public static void main(String[] args) {

        int idade = 29;                                                                                                 //Integer: usado antigamente
        Integer idadeRef = Integer.valueOf(29);//aqui poderia excluir o Integer.valueOf(); pois o java ja entende so com o numero
        //transformar um Integer para outros primitivos(double, float):
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);//Constante sempre em letra maiscula
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        int valor = idadeRef.intValue();                                                                                //unboxing: transforma o objeto em primitivo. Auxiliares: valueOf() e parseInt()
        /*
        String s = args[0];
        //PARSING: transforma a String em num inteiro
        //Integer num = Integer.valueOf(s);
        int num = Integer.parseInt(s);
        System.out.println(num);
        */
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);                                                                                                //AUTOBOXING

    }
}
