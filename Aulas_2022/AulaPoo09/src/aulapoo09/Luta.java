/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo09;

import java.util.Random;

/**
 *
 * @author Melquisedeque
 */
public class Luta {
    //ATRIBUTOS
    //os atributos desafiado e desafiante são instancia da classe Lutador, assim vai receber todo os atributos e metodos desta classe;
    //Este exemplo descreve RELACIONAMENTO POR AGREGAÇÃO;
    private Lutador desafiado;
    private Lutador desafiante;
    
    private int rounds;
    private boolean aprovada;
    
    //METODO ABSTRATOS
    //VEJA! para uma luta ser marcada:
    /*
    1 - os lutadores sejam da mesma categoria
    2 - os lutadores tem que ser diferentes
    */
    public void marcarLuta(Lutador L1, Lutador L2){
        if(L1.getCategoria().equals(L2.getCategoria()) && L1 != L2){
            this.aprovada = true;//a luta vai ser marcada
            this.desafiado = L1;//desafiado vai receber todos os atributos e metodos do Lutador 1
            this.desafiante = L2;//desafiante  vai receber todos os atributos e metodos de Lutadotr 2
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("###DESAFIADO###");
            this.desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);//o Random vai gerar 3 valores aleatorios [0 1 2]
            
            System.out.println("===============X===============");
            switch(vencedor){
                case 0://empate
                    
                    System.out.println("\tEMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1://desafiado venceu
                    System.out.println("VITÓRIA DO LUTADOR "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2://desafiante venceu
                    System.out.println("VITÓRIA DO LUTADOR "+this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;            
            }
            
        }else{
            System.out.println("A luta não pode acontecer!!!");
        }
        System.out.println("===============================");
    }
    //METODOS ESPECIAIS
    public void setDesafiado(Lutador dd){
        this.desafiado = dd;
    }
    public Lutador getDesafiado(){
        return desafiado;
    }
    public void setDesafiante(Lutador de){
        this.desafiante = de;
    }
    public Lutador getDesafiante(){
        return desafiante;
    }
}
