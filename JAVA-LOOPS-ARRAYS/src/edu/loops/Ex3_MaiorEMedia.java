package edu.loops;

import java.util.Scanner;

//DO-WHILE

//Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int contador = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if(numero > maior) maior = numero;

            contador = contador + 1;
        } while (contador < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Media dos números: " + soma/5);
    }
}