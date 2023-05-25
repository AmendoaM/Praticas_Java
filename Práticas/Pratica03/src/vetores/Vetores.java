/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetores;

import java.util.Scanner;

/**
 *
 * @author Fatec
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    int vetor[];
//    vetor = new int [5];
//    vetor[0] =5;
//    vetor[1] =2; 
//    vetor[2] =4;
//    vetor[3] =8;
//    vetor[4] =10;
//    int soma=vetor[0]+vetor[1]+vetor[2]+vetor[3]+vetor[4];
//    System.out.println(soma);

    Scanner ler = new Scanner(System.in);
    
    int n = 10;
    int vetor[] = new int[n];
    int i;
    int soma = 0;

    
    for (i=0; i<n; i++) {
        System.out.printf("Informe %do. valor de %d: ", (i+1), n);
        vetor[i] = ler.nextInt();
        soma = soma + vetor[i];
    }
        int resultado = soma/n;
        System.out.printf("A media desses nusmeros e %d: ", resultado);
    }
    
}
