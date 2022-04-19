/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo10;

/**
 *
 * @author Melquisedeque
 */
public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private int idade;
    private String sexo;
    
    //METODOS
    public void fazerAniver(){
       this.idade = this.idade + 1; 
    }
    //METODO CONSTRUTOR
    public Pessoa(String n, int id, String sex){
        this.nome = n;
        this.idade = id;
        this.sexo = sex;
    }
    //METODOS ESPECIAIS
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public int getIdade(){
        return idade;
    }
    public void setSexo(String sex){
        this.sexo = sex;
    }
    public String getSexo(){
        return sexo;
    }
}
