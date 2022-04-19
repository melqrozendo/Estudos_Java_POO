/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo13;

/**
 *
 * @author Melquisedeque
 */
public class AulaPoo13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[1];
        v[0] = new Video("Aula 01 -  Programação");
        v[0].play();
        //v[0].pause();
        v[0].like();
        
        System.out.println(v[0].toString());
        System.out.println("===========================================");
        
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Melq", 23, "M", "melq.rozendo13@outlook.com");
        u[1] = new Usuario("Rozendo", 55, "M", "rozendo.rozendo13@outlook.com");
        
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());
        System.out.println("===========================================");
        
        //conceito de agregação: parametros de usuario, video
        Visualizacao p[] = new Visualizacao[2];
        p[0] = new Visualizacao(u[0], v[0]);
        p[0].avaliar();
        System.out.println(p[0].toString());
        
        p[1] = new Visualizacao(u[1], v[0]);
        p[1].avaliar();
        System.out.println(p[1].toString());
    }
    
}
