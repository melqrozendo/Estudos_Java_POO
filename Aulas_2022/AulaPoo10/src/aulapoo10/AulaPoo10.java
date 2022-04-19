/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo10;

/**
 *
 * @author Melquisedeque
 */
public class AulaPoo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[1];
        Livro[] l = new Livro[1];
        
        p[0] = new Pessoa("Melq", 23, "Masculino");
        l[0] = new Livro("MATH", "Pedrojosefh", 300, p[0]);
        
        l[0].abrir();
        l[0].folhear(50);
        p[0].fazerAniver();
        System.out.println(l[0].detalhes());
    }
    
}
