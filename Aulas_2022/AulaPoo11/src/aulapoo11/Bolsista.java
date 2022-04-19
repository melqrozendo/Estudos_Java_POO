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
public class Bolsista extends Aluno {
    private boolean bolsa;
    
    public void renovarBolsa(){
        System.out.println("BOLSA RENOVADA!");
        System.out.println("====================================================");
    }
    //metodo sobreposto da classe mae ALUNO - 
    //POLIMORFISMO DE SOBREPOSIÇÃO
    @Override//sobrepor
    public void mensalidade(){
        System.out.println("MENSALIDADE PAGA COM DESCONTO DE BOLSA!");
        System.out.println("====================================================");
    }

    public boolean isBolsa() {
        return bolsa;
    }

    public void setBolsa(boolean bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" + "nome=" + this.nome + ", idade =" + this.idade + ", sexo=" + this.sexo + ", bolsa=" + bolsa + '}';
    }
    
    
}
