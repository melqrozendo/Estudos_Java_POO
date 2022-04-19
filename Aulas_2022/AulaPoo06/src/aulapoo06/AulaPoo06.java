/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo06;

/**
 *
 * @author Melquisedeque
 */
public class AulaPoo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro c1 = new Carro("Ford", "KA", "Vermelho", 1.5f);
        c1.status();
        Carro c2 = new Carro("BMW", "x6", "Prata", 2.3f);
        c2.status();
    }
    
}
