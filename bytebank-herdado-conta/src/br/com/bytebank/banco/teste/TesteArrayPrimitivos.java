package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivos {
    public static void main(String[] args) {
        int[] idades = new int[5];

        idades[0] = 0;
        idades[1] = 1;
        idades[2] = 2;
        idades[3] = 3;
        idades[4] = 4;

        System.out.println(idades[4]);

        //
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] = i * i;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }


    }
}
