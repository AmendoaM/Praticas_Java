/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica04;

import java.util.ArrayList;

/**
 *
 * @author Fatec
 */
public class Curso {
    private String nome;
    private int numero;
    private ArrayList<Disciplina> disciplinas;
    
    public Curso(String nome, int numero, ArrayList listaDisciplinas){
        this.numero = numero;
        this.nome = nome;
        this.disciplinas = listaDisciplinas;
    }
    
    public void imprimir(){
        for (Disciplina disciplina : disciplinas) {
            disciplina.imprimir();
        }
    }
    
    public int calcularTotalHora(){
        int horas = 0;
        for (Disciplina disciplina : disciplinas){
            horas += disciplina.getCargaHoraria();
        }
        return horas;
    }
    
    public void exibeDisciplinaCargaMaior() {
        Disciplina maior = disciplinas.get(0);
        
        for (Disciplina disc : disciplinas) {
            if (disc.getCargaHoraria() > maior.getCargaHoraria()) {
                maior = disc;
            }
        }
        System.out.println("A disciplina com maior carga horaria e " + maior.getNome());
        System.out.println("A carga horaria e de: " + maior.getCargaHoraria());
    }
}
