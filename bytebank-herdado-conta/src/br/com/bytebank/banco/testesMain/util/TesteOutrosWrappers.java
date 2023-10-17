package br.com.bytebank.banco.testesMain.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29);//autoboxing
        System.out.println(idadeRef.intValue());//unboxing

        Double dRef = 3.2;//o java ja entende que é double
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.FALSE;//autoboxing
        System.out.println(bRef.booleanValue());//unboxing

        //Usando a classe mais genérica(pode ser integer, double, float)
        Number refNumero = Float.valueOf(29.9f);

        List<Number> lista = new ArrayList<>();//lista onde so aceita Numbers
        lista.add(10);
        lista.add(10.5);
        lista.add(10.5f);

        System.out.println(lista.get(1));//mostra oq tem na posição 1

    }
}
