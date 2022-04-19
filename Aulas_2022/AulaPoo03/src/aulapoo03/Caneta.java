/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo03;

/**
 *
 * @author Melquisedeque
 */
public class Caneta {
    public String modelo;
    private float ponta;
    
    //Metodo setters - criados com void + metodo modificador(parametros)
    //Metodo getters - criados com tipo de variavel + metodo scessor...sem parametros
    public void setModelo(String m){
        modelo = m;
    }
    public String getModelo(){
        return modelo;
    }
    public void setPonta(float p){
        ponta = p;
    }
    public float getPonta(){
        return ponta;
    }
    
}
