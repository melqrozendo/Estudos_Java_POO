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
public abstract class Animal {
    //ATRIBUTOS
    protected float peso;
    protected int idade;
    protected int membros;
    
    //METODOS ABSTRATOS
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    //METODOS ESPECIAIS

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
    
}
