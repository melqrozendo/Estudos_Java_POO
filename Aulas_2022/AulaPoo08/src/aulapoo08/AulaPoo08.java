/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo08;

/**
 *
 * @author Melquisedeque
 */
public class AulaPoo08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CRIANDO OBJETOS
        //No encapsulamento os metodos que chamo com os objetos são apenas os metodos abstratos
        ControleRemoto c1 = new ControleRemoto();
        c1.EstadoAtual();
        
        c1.ligar();
        c1.maisVolume();
        c1.play();
        
        c1.abrirMenu();
        
        c1.pause();
    }
    
}
