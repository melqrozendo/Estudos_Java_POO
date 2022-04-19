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
public class Ave extends Animal {
    //ATRIBUTOS
    private String corPena;
    
    //METODO
    public void construirNinho(){
        System.out.println("Construindo Ninho");
    }
    
    //METODOS DE SOBREPOSIÇÃO - POLIMORFISMO DE SOBREPOSIÇÃO
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    @Override
    public void alimentar(){
        System.out.println("Alpiste");
    }
    @Override
    public void emitirSom(){
        System.out.println("Som de Ave");
    }
    //METODOS ESPECIAL

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    //METODO DE EXIBIÇÃO
    @Override
    public String toString(){
        return "Ave{" + ", peso= " +this.peso + ", idade= " + this.idade + ", membros= " + this.membros + ", corPena= " + this.corPena + "}";
    }
    
}
