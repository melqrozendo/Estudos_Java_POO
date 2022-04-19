/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo08;

/**
 *
 * @author Melquisedeque
 */
public class ControleRemoto implements Controlador {
    //CRIANDO ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //CRIANDO METODOS ESPECIAIS -- CONSTRUTOR
    public ControleRemoto(){
        this.vIniciar();
        this.lIniciar();
        this.tIniciar();
    }
    //metodo de inicio
    private void vIniciar(){
        this.volume = 50;
    }
    private void lIniciar(){
        this.ligado = false;
    } 
    private void tIniciar(){
        this.tocando = false;
    } 
    //metodo de exibição inicial
    public void EstadoAtual(){
        System.out.println("Ligado: " +this.isLigado());
        System.out.println("Tocando: "+this.isTocando());
        System.out.println("Volume: " +this.getVolume());
        System.out.println("==========================");
        
    }
    //CRIANDO METODOS ESPECIAIS -- GETTER E SETTER
    private int getVolume(){
        return volume;
    }
    private void setVolume(int v){
        this.volume = v;
        
    }
    private boolean isLigado(){
        return ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
        
    }
    private boolean isTocando(){
        return tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
        
    }
    //IMPLAMENTANDO INTERFACE DE ENCAPSULAMENTO
    //CHAMANDO METODOS ABSTRATOS DA INTERFACE
    //--@Override -> SOBREESCREVER: significa que já tinha um metodo abstrado definido
    //--e que agora os paramentros dos metodos vao ser definidos.
    
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("CONTROLE LIGADO...");
    }

    @Override
    public void desligar() {
        this.setLigado(false);
            System.out.println("CONTROLE DESLIGADO...");
    }

    @Override
    public void abrirMenu() {
        System.out.println("----------MENU----------");
        System.out.println("Está Ligado? " + this.isLigado());
        System.out.println("Está Tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            if(this.getVolume() == 0){
                
            }else{
                System.out.print("|");
            }
            
        }
        System.out.println(" ");
        System.out.println("-----------X------------");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 10);
            System.out.println("Volume (+)");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 10);
            System.out.println("Volume (-)");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
        this.setVolume(0);
        System.out.println("Volume (...)");
    }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
            System.out.println("Volume (<<<)");
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){//se o controle estiver ligado e não tiver tocando...setar para verdade ao chamar o metodo play;
            this.setTocando(true);
            System.out.println("( P )");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
            System.out.println("( || )");
        }

    }
}
