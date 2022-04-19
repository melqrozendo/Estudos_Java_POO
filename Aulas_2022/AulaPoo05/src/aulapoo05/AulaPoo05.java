/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo05;

/**
 *
 * @author Melquisedeque
 */
public class AulaPoo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro car01 = new Carro("Ford","Fiesta","Branco",1.5f);
        car01.status();
        Carro car02 = new Carro("Renault", "Clio", "Preto",2.0f);
        car02.status();
    }
    
}
