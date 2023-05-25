/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;

/**
 *
 * @author Usuário
 */
public class Cachorro extends Animal {
    public String raca;

    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }
   
     public String getRaca(){
        return raca;
    }
    
    public void setRaca(){
        this.raca = raca;
    }
}

