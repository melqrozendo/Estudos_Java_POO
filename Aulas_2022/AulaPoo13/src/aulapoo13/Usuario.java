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
public class Usuario extends Pessoa {
    //ATRIBUTOS
    private String login;
    private int totAssitido;
    
    //METODO CONSTRUTOR
    public Usuario(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssitido = 0;
    }
    
    
    //METODO ESPECIAIS
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitido() {
        return totAssitido;
    }

    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }
    
    //METODO DE EXIBIÇÃO

    @Override
    public String toString() {
        return "Usuario{" + "nome= " + this.nome + ", idade= " + this.idade + ", sexo= " + this.sexo + ", login=" + login + ", totAssitido=" + totAssitido + '}';
    }
    
    
    
}
