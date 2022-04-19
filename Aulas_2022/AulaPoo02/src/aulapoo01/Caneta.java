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
    //ATRIBUTOS - definindo visibilidade
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    //METODOS - definindo visibilidade
    public void status(){
        //System.out.println("--------------------------");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+cor);
        System.out.println("Ponta: "+ponta);
        System.out.println("Carga: "+carga+"%");
        System.out.println("A caneta está tampada: "+this.tampada);
        System.out.println("--------------------------------------");
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("NÃO PODE RABISCAR COM A CANETA "+this.cor);
        }else{
            System.out.println("PODE RABISCAR COM A CANETA "+this.cor);
        }
        System.out.println("--------------------------------------");
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
}
