/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo09;

/**
 *
 * @author Melquisedeque
 */
public class AulaPoo09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        //CRIANDO OBJETOS PARA A CLASSE LUTADOR
        //criando vetor para criar OBJETOS e definir seus paramentros
        Lutador L[] = new Lutador[6];
        //peso Pesado 
        L[0] = new Lutador("Melq", "Brasileiro", 23, 1.90f, 110.0f, 17, 2, 5);
        L[1] = new Lutador("Hulk", "Americano", 25, 1.95f, 108.0f, 19, 4, 5);
        //peso Medio
        L[2] = new Lutador("Rozendo", "Russo", 50, 1.95f, 70.6f, 22,4,1);
        L[3] = new Lutador("Michael", "Alemão", 46, 1.95f, 72.6f, 21,5,1);
        //peso Leve
        L[4] = new Lutador("Rock", "Polones", 55, 1.65f, 65.6f, 26,9,6);
        L[5] = new Lutador("Marcos", "Frances", 58, 1.67f, 67.6f, 18,3,7);
        
        //CRIANDO OBJETO PARA A CLASSE LUTA
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(L[0], L[1]);
        UFC01.lutar();
        L[0].status();
        L[1].status();
        UFC01.marcarLuta(L[2], L[3]);
        UFC01.lutar();
        L[2].status();
        L[3].status();
        UFC01.marcarLuta(L[4], L[5]);
        UFC01.lutar();
        L[4].status();
        L[5].status();
        
    }
    
    
}
