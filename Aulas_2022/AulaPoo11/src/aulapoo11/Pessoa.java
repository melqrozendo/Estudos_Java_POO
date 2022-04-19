/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo11;

/**
 *
 * @author Melquisedeque
 */
//Classe Mãe ou Superclasse Abstrata que não pode instanciar objetos
public abstract class Pessoa {
    //ATRIBUTOS
    protected String nome;
    protected int idade;
    protected String sexo;
    
    //add metodo ToString - metode de exibição

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
    //METODOS
    //metodo final que não pde ser sobreposto em outra classe por @Override
    public final void fazerAniver(){
        this.idade = this.idade + 1;
    }
    //METODOS ESPECIAIS
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }
}
