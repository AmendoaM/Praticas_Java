/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

/**
 *
 * @author Fatec
 */
public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String rg, String nome, double salario) {
        super(rg, nome);
    }
    
    public double getSalario(){
        return salario;
    }
   
    public void setSalario() {
        this.salario = salario;
    }
    
    public double aumentar_salario() {
        return this.salario * 0.1;
        
    }
   
}
