/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Questao2;

/**
 *
 * @author Fatec
 */
public class Zoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro ("Totoro", 12, "SRD");
        Cachorro cachorro2 = new Cachorro ("Jean", 5, "vira-lata" );
        
        Peixe peixe1 = new Peixe ("mar","Joao Paulo",0.05);
        Peixe peixe2 = new Peixe ("aquario","Jonas",1);
        
        System.out.println("Nome do cachorro: " + cachorro1.getNome() +" | Peso: "+ cachorro1.getPeso()+" | Raca: " + cachorro1.getRaca());
        System.out.println("Nome do cachorro: " + cachorro2.getNome() +" | Peso: "+ cachorro2.getPeso()+" | Raca: " + cachorro2.getRaca());
        System.out.println("Habitat do peixe: " + peixe1.getTipoHabitat()+" | Nome: "+ peixe1.getNome()+" | Peso: " + peixe1.getPeso());
        System.out.println("Habitat do peixe: " + peixe2.getTipoHabitat()+" | Nome: "+ peixe2.getNome()+" | Peso: " + peixe2.getPeso());
        
    }
    
    
}
