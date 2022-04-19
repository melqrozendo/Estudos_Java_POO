/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo07;

/**
 *
 * @author Melquisedeque
 */
public class ContaBanco {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //METODO CONSTRUTOR
    public ContaBanco(){
        statusInicial();
        saldoInicial();
        
    }
    //METODOS INICIAIS
    public void statusInicial(){
        this.status = false;
    }
    public void saldoInicial(){
        this.saldo = 0.00f;
    }
    //METODO de Exibição
    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status da Conta: "+this.isStatus());
        System.out.println("----------------------------------");
        
        
    //METODOS   
    } 
    public void abrirConta(String t){
        this.setTipo(t);
        this.status = true;
        if(this.tipo == "CC"){
            this.setSaldo(50);
            System.out.println("Conta Corrente Criada!");
        }else if(this.tipo == "CP"){
            this.setSaldo(150);
            System.out.println("Conta Poupança Criada!");
        }
    }
    public void fecharConta(){
        if(this.status == true && this.saldo == 0){
            this.status = false;
            System.out.println("Conta Fechada!");
        }else if(this.status == true && this.saldo >0){
            System.out.println("ERRO! Conta com Dinheiro.");
        }else if(this.status == true && this.saldo <0){
            System.out.println("ERRO! Conta em Débito.");
        }
    }
    public void depositar(float s){
        if(this.status == true){
            this.saldo = this.saldo + s; 
            //setSaldo(getSaldo() + s)
            System.out.println("Deposito realizado com sucesso!");
        }else if(this.status == false){
            System.out.println("Impossível Depositar.");
        }
    }
    public void sacar(float s){
        if(this.status == true){ 
               if(this.saldo >= s){
                    this.saldo = this.saldo - s;
                    //setSaldo(getSaldo() - s)
                    System.out.println("Saque realizado com sucesso!");
               }else{
                   System.out.println("Saldo insuficiente.");
               }
       }else{
            System.out.println("Impossível Sacar.");
        } 
        
    }
    public void pagarMensal(){
        int valor = 0;
        if(this.tipo == "CC"){//A mensalida de conta corrente é R$12,00
            valor = 12;
        }else if(this.tipo == "CP"){//A mensalidade de conta poupança é R$ 20,00
            valor = 20;
        }
        if(this.status == true){
            if(this.saldo >  valor){
                this.saldo = this.saldo - valor;
                System.out.println("Pagamento Mensal da Conta!");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível Pagar");
        }
        
    }
    
    //METODOS ESPECIAIS
    public void setNumConta(int id){
        this.numConta = id;
    }
    public int getNumConta(){
        return numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(float s){
        this.saldo = s;   
    }
    public float getSaldo(){
        return saldo;
    }
    public void setStatus(boolean st){
        this.status = st;   
    }
    public boolean isStatus(){//is - é o metodode retorno booleano
       return status;
    }

    
}
