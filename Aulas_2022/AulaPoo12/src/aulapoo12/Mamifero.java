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
public class Mamifero extends Animal {
    //ATRIBUTOS
    protected String corPelo;
    
    //METODOS DE SOBREPOSIÇÃO - POLIMORFISMO DE SOBREPOSIÇÃO
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamífero");
    }
    
    //METODOS ESPECIAL

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    //METODO DE EXIBIÇÃO

    @Override
    public String toString() {
        return "Mamifero{" + " peso= "+ this.peso + ", idade= " + this.idade + ", membros= " + this.membros + ", corPelo= " + corPelo + '}';
    }
    
}
