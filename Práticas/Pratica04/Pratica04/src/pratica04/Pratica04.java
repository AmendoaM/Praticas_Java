
package pratica04;

import java.util.ArrayList;


public class Pratica04 {

    public static void main(String[] args) {
        
        ArrayList<Disciplina> grade = new ArrayList<>();
        
        grade.add(new Disciplina("Freud e o nascimento da psicanálise", 123, 80));
        grade.add(new Disciplina("Psicodiagnóstico", 74, 60));
        grade.add(new Disciplina("Módulo dos tecidos aos sistemas", 467, 60));
        grade.add(new Disciplina("Psicofarmacologia", 223, 60));
        
        Curso meuCurso = new Curso("psicologia", 1, grade);
        
        meuCurso.imprimir();
        System.out.println("A carga horária total do curso é: " + meuCurso.calcularTotalHora());
        
        meuCurso.exibeDisciplinaCargaMaior();
        
        
        
    }
    
}
