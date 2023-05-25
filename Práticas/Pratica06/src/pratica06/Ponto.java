/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pratica06;

/**
 *
 * @author Usuário
 */
public class Ponto {
    public int x;
    public int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
        
    }

    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
        
    }
    
    public void setY(int Y) {
        this.y = y;
    }
    
    public double calculoDistancia(Ponto p1, Ponto p2) {
        
       double result = Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
      return result;
    }
}


