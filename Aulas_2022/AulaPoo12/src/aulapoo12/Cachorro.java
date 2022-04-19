/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo12;

/**
 *
 * @author Melquisedeque
 */
public class Cachorro extends Mamifero {
    
    //METODO DE SOBREPOSIÇÃO - POLIMORFISMO DE SOBREPOSIÇÃO
    @Override
    public void alimentar(){
        System.out.println("Ração de Dog");
    }
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
    //METODO SOBRECARREGADO - POLIMORFISMO DE SOBRECARGA
    public void reagir(String frase){
        if(frase.equals("Amigo")){
            System.out.println("Latir");
        }else if(frase.equals("Mal")){
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora,int min){
        if(hora >= 6 && hora < 14 && min <=59 ){
            System.out.println("Abanar Rabo - MANHÃ");
        }else if(hora >= 14 && hora < 18 && min <= 59){
            System.out.println("Latir - TARDE");
        }else if(hora >= 18 && hora < 22 && min <=59){
            System.out.println("Ignorar - NOITE");
        }else{
            System.out.println("Dormindo - MADRUGADA");
        }   
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar Rabo");
        }else if(dono == false){
            System.out.println("Latir e Rosnar");
        }
        
    }
}
