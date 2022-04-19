/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo07;


/**
 *
 * @author Melquisedeque
 */
public class AulaPoo07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(001);
        p1.setDono("Melq");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.pagarMensal();
        
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(002);
        p2.setDono("Joana");
        p2.abrirConta("CP");
        p2.depositar(0);
        p2.sacar(150);
        p2.fecharConta();
        
        p2.estadoAtual();
        
        ContaBanco p3 = new ContaBanco();
        p3.setNumConta(003);
        p3.setDono("Rozendo");
        p3.abrirConta("CC");
        p3.depositar(850);
        p3.sacar(25);
        p3.sacar(60);
        
        p3.estadoAtual();
        
        
        
        
    }
    
}
