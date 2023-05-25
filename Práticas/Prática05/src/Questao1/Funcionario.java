/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

/**
 *
 * @author Fatec
 */
public class Funcionario extends Pessoa {

    private double salario;

    public Funcionario(String rg, String nome, double salario) {
        super(rg, nome);
        this.salario = salario;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentarSalario(double percentual) {
        double novoSalario;
        novoSalario = salario + salario * percentual;
        return novoSalario;
    }
    
    public void imprimir() {
        System.out.println("Rg: " + rg + " Nome: " + nome + " Salario: " + salario + " Novo salario: " + aumentarSalario(0.1));
    }

}
