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
public class AulaPoo11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoa P = new Pessoa();
        Aluno A = new Aluno();
        Professor Pr = new Professor();
        Funcionario Fun = new Funcionario();
        Bolsista Bol = new Bolsista();
        
        //P.setNome("Melq");
        //P.setIdade(23);
        //P.setSexo("M");
        //P.fazerAniver();
        //System.out.println(P.toString());
        
        A.setNome("Rozendo");
        A.setIdade(53);
        A.setSexo("M");
        A.setMatricula(0111);
        A.setCurso("Engenharia");
        //
        System.out.println(A.toString());
        A.cancelarMatricula();
        A.mensalidade();
        
        Pr.setNome("Joana");
        Pr.setIdade(55);
        Pr.setSexo("F");
        Pr.setEspecialidade("AeroEspacial");
        Pr.setSalario(8500.0f);
        //
        System.out.println(Pr.toString());
        Pr.receberAum(580.0f);
      
        Fun.setNome("Melquisia");
        Fun.setIdade(25);
        Fun.setSexo("F");
        Fun.setSetor("Administrativo");
        Fun.setTrabalhando(false);
        //
        System.out.println(Fun.toString());
        Fun.mudarTrabalho();
        
        Bol.setNome("John");
        Bol.setIdade(45);
        Bol.setSexo("M");
        Bol.setBolsa(true);
        //
        System.out.println(Bol.toString());
        Bol.mensalidade();
        Bol.renovarBolsa();
            
    }
    
}
