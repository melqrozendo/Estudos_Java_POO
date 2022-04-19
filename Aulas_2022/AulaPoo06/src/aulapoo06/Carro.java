/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo06;

/**
 *
 * @author Melquisedeque
 */
public class Carro {
    private String modelo;
    private String nome;
    private String cor;
    private float motor;
    
    public Carro(String m, String n, String c, float mot){
        this.setModelo(m);
        this.setNome(n);
        this.setCor(c);
        this.setMotor(mot); 
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public String getModelo(){
        return modelo;
    } 
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return nome;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public String getCor(){
        return cor;
    }
    public void setMotor(float mot){
        this.motor = mot;
    }
    public float getMotor(){
        return motor;
    }
    public void status(){
        System.out.println("Modelo:\t "+this.getModelo());
        System.out.println("Nome:\t "+this.getNome());
        System.out.println("Cor:\t "+this.getCor());
        System.out.println("Motor:\t "+this.getMotor()); 
        System.out.println("========================================");
        
        if(this.modelo == "Ford"){
            System.out.println("Melhor Carro já produzido no Brasil!");
        }else{
            System.out.println("ERRO");
        }
        System.out.println("========================================");
    }
}
