package edu.arrays;

//ARRAYS UNIDIMENSIONAIS

//Ordem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.

public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, 0, 15, 50, 8};

        System.out.print("Vetor: ");
        int contador = 0;
        while (contador < (vetor.length)) {
            System.out.print(vetor[contador] + " ");
            contador++;    
        }
        
        System.out.print("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
