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
public class Caneta {
    //ATRIBUTOS
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    //METODOS
    void status(){
        //System.out.println("--------------------------");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga+"%");
        System.out.println("A caneta está tampada: "+this.tampada);
        System.out.println("--------------------------------------");
    }
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("NÃO PODE RABISCAR COM A CANETA "+this.cor);
        }else{
            System.out.println("PODE RABISCAR COM A CANETA "+this.cor);
        }
        System.out.println("--------------------------------------");
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
