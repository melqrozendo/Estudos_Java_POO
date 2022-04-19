/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo12;

/**
 *
 * @author Melquisedeque
 */
public class AulaPoo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamifero m = new Mamifero();
        m.setPeso(25.6f);
        m.setIdade(8);
        m.setMembros(4);
        m.setCorPelo("Preto");
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        System.out.println(m.toString());
        System.out.println("==============================================================");
        
        Canguru c = new Canguru();
        c.setPeso(52.6f);
        c.setIdade(15);
        c.setMembros(4);
        c.setCorPelo("Marrom");
        c.locomover();
        c.alimentar();
        c.emitirSom();
        
        System.out.println(c.toString());
        System.out.println("==============================================================");
        
        Cachorro k9 = new Cachorro();
        k9.setPeso(9.5f);
        k9.setIdade(15);
        k9.setMembros(4);
        k9.setCorPelo("Cinza");
        k9.locomover();
        k9.alimentar();
        k9.emitirSom();
        //k9.reagir("Amigo");
        //k9.reagir(true);
        k9.reagir(20, 31);
        
        System.out.println(k9.toString());
        System.out.println("==============================================================");
        
        Reptil r = new Reptil();
        r.setPeso(12.5f);
        r.setIdade(6);
        r.setMembros(0);
        r.setCorEscama("Verde");
        r.locomover();
        r.alimentar();
        r.emitirSom();
        
        System.out.println(r.toString());
        System.out.println("==============================================================");
        
    }
    
    
}
