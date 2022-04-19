/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo05;

/**
 *
 * @author Melquisedeque
 */
public class Carro {
    public String modelo;
    public String nome;
    public String cor;
    public float motor;
    
    //Metodo construtor - com passagem de parametros - para varios objetos instanciados
    public Carro(String m, String n, String c, float mot){
        this.modelo = m;
        this.nome = n;
        this.cor = c;
        this.motor = mot;
    }
    public void status(){
        System.out.println("Modelo:\t "+this.modelo);
        System.out.println("Nome:\t "+this.nome);
        System.out.println("Cor:\t "+this.cor);
        System.out.println("Motor:\t "+this.motor);
        System.out.println("---------------------------");
    }
    
}
