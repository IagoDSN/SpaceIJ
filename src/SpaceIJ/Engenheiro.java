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
public class Engenheiro {
   private String nome, cpf;
    private double salario;
    private boolean status=true, autorizacao;

        public Engenheiro(){
            System.out.println("O engenheiro foi chamado");
    }
    
        public Engenheiro(String nome, String cpf, double salario, boolean autorizacao) {
        this();
        this.salario = salario;
        this.autorizacao = autorizacao;
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
        
        public boolean getAutorizacao(){
            return this.autorizacao;
            
        }
        public void setAutorizacao(boolean autorizacao){
            this.autorizacao = autorizacao;
        }
    
    public void aumentarSalarioPorcentagem(double valor){
        this.salario = this.getSalario() + (this.getSalario() * (valor/100));
        System.out.println("O salario do Engenheiro " +this.getNome()+ " foi aumentado para "+this.getSalario()+ ". Pelo desconto de "+valor+"%");
    }
    
    public void autorizarLancamento(){
        if(this.autorizacao == false){
        this.autorizacao = true;
            System.out.println("Lançamento autorizado com sucesso");
        }
        else{
            System.out.println("O lançamento já está autorizado");
        }
    }
    
    public void demitir(){
        if(this.status == false){
            System.out.println("O Engenheiro "+this.nome+" já está demitido");
        }else{
            this.status = false;
            System.out.println("O Engenheiro "+this.nome+" foi demitido");
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
