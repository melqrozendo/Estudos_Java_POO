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
public class Aluno extends Pessoa{
    //ATRIBUTOS
    private int matricula;
    private String curso;
    
    //METODOS
    public void cancelarMatricula(){
        System.out.println("MATRICULA CANCELADA!");
        System.out.println("====================================================");
    }
    public void mensalidade(){
        System.out.println("MESALIDADE PAGA!");
        System.out.println("====================================================");
    }
    
    //METODS ESPECIAIS
    public void setMatricula(int mat){
        this.matricula = mat;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getCurso(){
        return curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +"nome=" + this.nome + ", idade=" + this.idade + ", sexo=" + this.sexo + ", matricula=" + matricula + ", curso=" + curso + '}';
    }
    
}
