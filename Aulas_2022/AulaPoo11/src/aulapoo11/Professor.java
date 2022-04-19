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
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public void receberAum(float aum){
        this.salario = this.salario + aum;
        System.out.println("AUMENTO SALARIAL RECEBIDO!");
        System.out.println("====================================================");
    }
    
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return especialidade;
    }
    public void setSalario(float salario){
        this.salario = salario;
    }
    public float getSalario(){
        return salario;
    }

    @Override
    public String toString() {
        return "Professor{" + "nome=" + this.nome + ", idade=" + this.idade + ", sexo=" + this.sexo + ", especialidade=" + especialidade + ", salario=" + salario + '}';
    }
    
}
