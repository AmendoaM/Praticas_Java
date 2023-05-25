/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Scanner;

/**
 *
 * @author Fatec
 */
public class Teste {
      public static void main(String[] args) {
                
                Scanner scan = new Scanner(System.in);
               
                
                System.out.println("Escreva os dados do aluno na seguinte ordem: ");
                System.out.println("R.A.: ");
                System.out.println("Nome: ");
                System.out.println("Gênero: ");
                System.out.println("R.G.: ");
                System.out.println("CPF: ");
                System.out.println("Data de nascimento (dia/mês/ano) : ");
                

                int ra = scan.nextInt();
                String nome = scan.next();
                String genero = scan.next();
                String rg = scan.next();
                String cpf = scan.next();
                int dia = scan.nextInt();
                int mes = scan.nextInt();
                int ano = scan.nextInt();
               
                
                DataNasc nasc = new DataNasc(dia, mes, ano);
                String dataFormatada = nasc.getDataFormatada();
                
                System.out.println(nasc.getDataFormatada());
                
                Aluno aluno = new Aluno(ra, nome, genero, rg, cpf, nasc);

                System.out.println("Aluno registrado com sucesso! Seguem abaixo os dados: ");
                aluno.imprimirAluno();
                
            }
 


}
