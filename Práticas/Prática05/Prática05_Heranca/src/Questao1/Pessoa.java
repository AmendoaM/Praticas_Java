/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

/**
 *
 * @author Fatec
 */
public class Pessoa {
    private String rg;
    private String nome;
    
    public Pessoa(String rg, String nome){
        this.rg = rg;
        this.nome = nome;
    }
      
    public String getRg() {
        return rg;
        
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
           
    }

