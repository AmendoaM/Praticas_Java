/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;

/**
 *
 * @author Usuário
 */
public class Peixe extends Animal {
    private String tipoHabitat;

    public Peixe(String tipoHabitat, String nome, double peso) {
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }
   
    public String getTipoHabitat(){
        return tipoHabitat;
    }
    
    public void setTipoHabitat(){
        this.tipoHabitat = tipoHabitat;
    }
}

