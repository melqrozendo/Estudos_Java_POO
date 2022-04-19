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
public class Peixe extends Animal {
    //ATRIBUTOS
    private String corEscama;
    //METODOS
    public void soltarBolha(){
        System.out.println("Soltando bolhass");
    }
    
    //METODOS DE SOBREPOSIÇÃO  - POLIMORFISMO DE POSIÇAO
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Algas");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Peixe");
    }
    //METODOS ESPECIAIS

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //METODO DE EXIBIÇÃO
    @Override
    public String toString(){
        return "Peixe{" + ", peso= " +this.peso + ", idade= " + this.idade + ", membros= " + this.membros + ", corEscama= " + this.corEscama + "}";
    }
    
}
