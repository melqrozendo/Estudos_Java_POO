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
public class Reptil extends Animal {
    //ATRIBUTOS
    private String corEscama;
    
    //METODOS DE SOBREPOSIÇÃO - POLIMORFISMO DE SOBREPOSIÇÃO
    @Override
    public void locomover(){
        System.out.println("Rastejar");
    }
    @Override
    public void alimentar(){
        System.out.println("Vegetais");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Réptil");
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
        return "Réptil{" + ", peso= " +this.peso + ", idade= " + this.idade + ", membros= " + this.membros + ", corEscama= " + this.corEscama + "}";
    }
}
