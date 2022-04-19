/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo09;

/**
 *
 * @author Melquisedeque
 */
public class Lutador {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    //METODOS CONSTRUTOR + parametros
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        //setNome(no);
        //setNacionalidade(na);
        //setIdade(id);
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;    
    }
    //METODOS ESPECIAIS
    public void setNome(String no){
        this.nome = no;
    }
    public String getNome(){
        return nome;
    }
    public void setNacionalidade(String na){
        this.nacionalidade = na;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setIdade(int id){
        this.idade = id;
    }
    public int getIdade(){
        return idade;
    }
    public void setAltura(float al){
        this.altura = al;
    }
    public float getAltura(){
        return altura;
    }
    public void setPeso(float pe){
        this.peso = pe; //recebo o valor do peso do metodo construtor
        this.setCategoria();//seto para o metodo categoria
    }
    public float getPeso(){
        return peso;
    }
    private void setCategoria(){//metodo vai ser privado
        if(this.peso < 52.2){
            this.categoria = "Inválido";    
        }
        else if(this.peso <= 70.3){
            this.categoria = "Leve";
        }
        else if(this.peso <= 83.9){
            this.categoria = "Medio";
        }
        else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Invalido";
        }
    }
    public String getCategoria(){
        return categoria;
    }
    public void setVitorias(int vi){
        this.vitorias = vi;
    }
    public int getVitorias(){
        return vitorias;
    }
    public  void setDerrotas(int de){
        this.derrotas = de;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setEmpates(int em){
        this.empates = em;
    }
    public int getEmpates(){
        return empates;
    }
    
    //METODOS ABSTRATOS
    public void apresentar(){
        System.out.println("Lutador: \t "+this.getNome());
        System.out.println("Origem: \t "+this.getNacionalidade());
        System.out.println("Idade: \t\t "+ this.getIdade()+" anos");
        System.out.println("Altura: \t "+this.getAltura()+" m de altura");
        System.out.println("Pesando: \t "+this.getPeso()+" Kg");
        System.out.println("Ganhou: \t "+this.getVitorias());
        System.out.println("Perdeu: \t "+this.getDerrotas());
        System.out.println("Empatou: \t "+this.getEmpates());
    }
    public void status(){
        System.out.println("===============================");
        System.out.println("Nome: \t\t"+getNome());
        System.out.println("Categoria:\tPeso "+this.getCategoria());
        System.out.println(this.getVitorias()+" vitorias");
        System.out.println(this.getDerrotas()+" derrotas");
        System.out.println(this.getEmpates()+" empates");
        System.out.println("===============================");

    }
    public void ganharLuta(){
        //vitorias = vitorias + 1;
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        //derrotas = derrotas + 1;
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        //empates = empates + 1;
        this.setEmpates(this.getEmpates() + 1);
        
    }
    
    
}
