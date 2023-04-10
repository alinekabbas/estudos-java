package edu.loops;

import java.util.Scanner;

//FOR

//Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
//Ex.: 5!=5.4.3.2.1=120

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial= scan.nextInt();

        int multiplicador = 1;

        System.out.print(fatorial +"! = ");

        for (int i = fatorial; i >= 1; i--) {
            multiplicador = multiplicador * i;
        }
        System.out.println(multiplicador);
    }
}
