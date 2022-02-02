package br.com.bytebank.banco.teste;

import java.util.Locale;

public class TesteString {
    public static void main(String[] args) {

        String nome = "Alura";

        //------------------------------------------------------------------
        String vazio = " ";
        String semEspaco = vazio.trim(); //tira os espaços dentro da string

        System.out.println(vazio);
        System.out.println(semEspaco.isEmpty()); //ve se a string esta vazia

        //------------------------------------------------------------------
        System.out.println(nome.length());//quant de letras

        //------------------------------------------------------------------
        String substring = nome.substring(3); //mostra a String apartir da posição indicada

        System.out.println(substring);

        //------------------------------------------------------------------
        int posicaoDaString = nome.indexOf("ur");

        System.out.println(posicaoDaString);

        //------------------------------------------------------------------
        char caractere = nome.charAt(2);// pega a letra da posição indicada

        System.out.println(caractere);

        //------------------------------------------------------------------
        char c = 'A'; //char é repreentado atravez das aspas simples
        char d = 'a';

        String opcaoNome2 = nome.replace(c, d);

        System.out.println(opcaoNome2);

        //------------------------------------------------------------------
        String opcaoNome1 = nome.replace("A", "a"); //cria uma nova String e troca o A por a.

        System.out.println(opcaoNome1);

        //------------------------------------------------------------------
        String opcaoNome3 = nome.toUpperCase();

        System.out.println(opcaoNome3);

        /* Essas formas não funcionam pq quando vc declara uma String ela não muda

        nome.toLowerCase();//pega todas as maiusc e transforma em minus

        nome.replace("A", "a"); //troca o A por a
        */

    }
}
