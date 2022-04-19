/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo01;

/**
 *
 * @author Melquisedeque
 */
public class AulaPoo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;//atributo com visibilidade privada
        c1.carga = 80;
        //c1.tampada = true;//atributocom visibilidade privada
        
       c1.tampar();//chamada de metodo  public que altera visibilidade de atributo privado na classe Caneta
       c1.status();
       
    }
    
}
