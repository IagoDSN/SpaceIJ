/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceIJ;

/**
 *
 * @author 13410289682
 */
public class Cientista {
   private String nome, cpf;
    private double salario;
   private boolean status=true;
   
   public Cientista(){
       System.out.println("O ciêntista foi chamado");
   }
   
   public Cientista(String nome, String cpf, double salario) {
        this();
        this.salario = salario;
        this.nome = nome;
        this.cpf = cpf;
    }
    
   public String getNome(){
            return this.nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public String getCpf(){
            return this.cpf;
        }
        public void setCpf(String cpf){
            this.nome = cpf;
        }
        
        public double getSalario(){
            return this.salario;
        }
        public void setSalario(double salario){
            this.salario = salario;
        }
        
        public boolean getStatus(){
            return this.status;
        }
        public void setStatus(boolean status){
            this.status = status;
        }

    
   
    public void aumentarSalarioPorcentagem(double valor){
        this.salario = this.salario + (this.salario * (valor/100));
        System.out.println("O salario do Cientista " +this.nome+ " foi aumentado para "+this.salario + ". Pelo desconto de "+valor+"%");
    }
    public void demitir(){
        if(this.status == false){
            System.out.println("O Cientista "+this.nome+" já está demitido");
        }else{
            this.status = false;
            System.out.println("O Cientista "+this.nome+" foi demitido");
        }
    }
    public boolean verificarStatus(){
        if(this.status == true){
            return(true);
        }
        else{
            return(false);
        }
    }
    
}

