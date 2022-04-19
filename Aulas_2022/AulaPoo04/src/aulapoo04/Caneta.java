/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo04;

/**
 *
 * @author Melquisedeque
 */
public class Caneta {
    public String modelo;
    public String cor;
    private boolean tampado;
    
    public Caneta(){//Metodo construtor - para apenas um objeto instanciado
        this.modelo = "Bic";
        this.cor = "Azul";
        this.tampar();
    }
    public void tampar(){
        this.tampado = true;
    }
    public void status(){//Metodo de Exibição
        System.out.println(this.modelo);
        System.out.println(this.cor);
        System.out.println(this.tampado);
        
    }
    
    
}
