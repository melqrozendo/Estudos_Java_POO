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
public class Funcionario extends Pessoa  {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
        if(this.trabalhando == false){
            System.out.println("FIM DO EXPEDIENTE!");
        }else if(this.trabalhando == true){
            System.out.println("INICIO DO EXPEDIENTE!");
        }
        System.out.println("====================================================");
    }
    
    public void setSetor(String setor){
        this.setor = setor;
    }
    public String getSetor(){
        return setor;
    }
    public void setTrabalhando(boolean trab){
        this.trabalhando = trab;
    }
    public boolean isTrabalhando(){
        return trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome= "+ this.nome + ", idade=" + this.idade + ", sexo=" + this.sexo + ", setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }
    
}
