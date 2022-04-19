/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo03;

/**
 *
 * @author Melquisedeque
 */
public class AulaPoo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.setModelo("Bic");
        c1.setPonta(0.5f);
        
        System.out.println(c1.getModelo());
        System.out.println(c1.getPonta());
    }
    
}
