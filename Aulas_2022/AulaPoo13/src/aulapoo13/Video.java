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
public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //METODO CONSTRUTOR
    public Video(String titulo) {    
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    //METODOS ESPECIAIS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {//A avaliação de um video vai ser a media das avaliações que ele tem.
        //calcular a media das avaliações
        int nova;
        nova = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    

    //METODOS ABSTRATOS
    @Override
    public void play() {
        this.setReproduzindo(true);
        System.out.println("PLAY!");
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
        System.out.println("PAUSE!");
    }

    @Override
    public void like() {
        this.curtidas = this.curtidas + 1;
        System.out.println("LIKE!");
    }
    
    //METODO DE EXIBIÇÃO

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + '}';
    }
    
    
    
}
