package edu.aline.variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        //tipos primitivos
        //estudar a classe String que representa texto na aplicação

        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        short numeroCurto2 = (short) numeroNormal; //não é tão usado assim. Utiliza-se mais a tipagem int

        //variavel declarada, podendo assim alterar seu valor
        int numero = 5;
        numero = 10;

        int modulo = 18 % 3;

        System.out.println(modulo);

        //As constantes devem ser declaradas em caixa alta e com a palavra reservada 'final' em seu inicio, para garantir que não sofrerá alteração ao longo do código.
        final double VALOR_DE_PI = 3.14;


    }
}
