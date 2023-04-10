package edu.arrays;

import java.util.Random;

//ARRAYS UNIDIMENSIONAIS

//Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre os números e seus sucessores.

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random randon = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = randon.nextInt(100);
            numerosAleatorios[i] = numero;         
        }

        System.out.print("Numeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessores de Numeros Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) + " ");
        }
        
    }
}
