/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo13;

/**
 *
 * @author Melquisedeque
 */
public class Visualizacao {
    private Usuario espectador;
    private Video filme;
    
    //METODO CONSTRUTOR
    public Visualizacao(Usuario espectador, Video filme){    
        this.espectador = espectador;
        this.filme = filme;
        //quando chamar o metodo visualização
        this.espectador.setTotAssitido(this.espectador.getTotAssitido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }    
    
    //METODO DE SOBRECARGA - POLIMRFISMO DE SOBRECARGA
    public void avaliar(){
        this.filme.setAvaliacao(5);//se chamar metodo avaliar sem parametro - setar no avaliar na classe Video
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);//se chamar metodo avaliar com parametro nota - setar na avaliação da classe Video a nota
    }
    public void avaliar(float porcentagem){
        int tot = 0;
        if(porcentagem <= 20){
            tot = 5;//se a porcentagem for menor ou igual a 20% - setar na avaliação da classe Video a nota 5
        }else if(porcentagem <=50){
            tot = 7;//se a porcentagem for menor ou igual a 50% - setar na avaliação da classe Video a nota 7
        }else if(porcentagem <=90){
            tot = 9;//se a porcentagem for menor ou igual a 90% - setar na avaliação da classe Video a nota 9
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }    
    
    //METODO ESPECIAIS
    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    //METODO DE EXIBIÇÃO

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }
    
}
