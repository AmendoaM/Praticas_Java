/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica04;

/**
 *
 * @author Fatec
 */
public class Disciplina {
    private String nome;
    private int codigo;
    private int cargahoraria;

    public Disciplina(String nome, int codigo, int cargahoraria){
        this.nome = nome;
        this.codigo=codigo;
        this.cargahoraria=cargahoraria;
    }    
    
    public String getNome() {
        return this.nome;
    }
    
    public void imprimir() {
        System.out.println("Nome da disciplina: " + nome);
        System.out.println("O código desta disciplina é: " + codigo);
        System.out.println("A carga horária desta disciplina é: " + cargahoraria);
    }
    
    public int getCargaHoraria(){
        return this.cargahoraria;
    }
}
