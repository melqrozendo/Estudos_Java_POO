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
public class Livro implements Publicacao {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //METODOS
    
    //metodo de Exibição toString
    public String detalhes(){
        return "Livro{ \n" + "titulo = " + titulo + ","
                + "\n autor = " + autor + ","
                + "\n totPaginas = " + totPaginas + ","
                + "\n pagAtual = " + pagAtual + ","
                + "\n aberto = " + aberto + ","
                + "\n leitor = " + leitor.getNome() + ","
                + "\n idade = " + leitor.getIdade() + ","
                + "\n sexo = " + leitor.getSexo() +'}';
    }
    
    //METODO CONSTRUTOR
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        //INICIALIZANDO OBJETO INSTANCIADO COM:
        this.aberto = false;
        this.pagAtual = 0;
        
    }
    //METODOS ESPECIAIS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    //METODOS ABSTRATOS DA INTERFACE - PUBLICACAO
    @Override
    public void abrir() {
        this.aberto = true;
        System.out.println("Livro aberto!");
    }

    @Override
    public void fechar() {
        this.aberto = false;
        System.out.println("Livro fechado!");
    }

    @Override
    public void folhear(int p) {
        if(p > this.totPaginas){
            this.pagAtual = 0;
            System.out.println("Pagina não existente!");
        }else{
           this.pagAtual = p; 
        }
        switch (p){
            case 10:
                System.out.println("CAPÍTULO - #1");
                break;
            case 50:
                System.out.println("CAPÍTULO - #2");
                break;
            case 100:
                System.out.println("CAPÍTULO - #3");
                break;
        }
        
    }

    @Override
    public void avancarPag() {
        if(this.totPaginas == this.pagAtual){
            System.out.println("Livro Finalizado!");
        }else{
            this.pagAtual = this.pagAtual + 1;
        }
        
    }

    @Override
    public void voltarPag() {
        if(this.pagAtual == 0){
            System.out.println("Prefácio do Livro!");
        }else{
            this.pagAtual = this.pagAtual - 1;
        }
        
    }
    
}
