/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Questão3;

/**
 *
 * @author Fatec
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Gerente gerente_01 = new Gerente("Geraldo", 131098764, 1600.00, 1234);
        Gerente gerente_02 = new Gerente("Cicero", 131097890, 1700.00, 1245);
        
        System.out.println("Nome: " + gerente_01.getNome() +
                " CPF: " + gerente_01.getCpf() +
                " | Salario: " + gerente_01.getSalario() +
                " | Senha: " + gerente_01.getSenha()
                );
        
        String senhaCorreta = gerente_01.autentica(1235) ? "Senha esta correta." : "Senha esta incorreta.";
        System.out.println(senhaCorreta);
        
        System.out.println("Nome: " + gerente_01.getNome() +
                " CPF: " + gerente_02.getCpf() +
                " | Salario: " + gerente_02.getSalario() +
                " | Senha: " + gerente_02.getSenha()
                );
        
        String senha2Correta = gerente_02.autentica(1245) ? "Senha esta correta." : "Senha esta incorreta.";
        System.out.println(senha2Correta);
        }
 }
