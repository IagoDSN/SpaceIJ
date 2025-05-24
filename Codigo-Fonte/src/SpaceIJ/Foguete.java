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
public class Foguete {
    private String nome;
    private double quantidadeCombustivel, maximoCombustivel, velocidade;
    private boolean status, statusDeLançamento, verificado; //Status se está pronto ou não, se está lançado ou não
    private static int totalFoguetes;

    public Foguete(){
        System.out.println("Foguete Iniciado!");
        totalFoguetes++;
    }
    
    public Foguete(String nome, double quantidadeCombustivel, double maximoCombustivel, double velocidade, boolean status, boolean statusDeLançamento, boolean verificado) {
        this.nome = nome;
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.maximoCombustivel = maximoCombustivel;
        this.velocidade = velocidade;
        this.status = status;
        this.statusDeLançamento = statusDeLançamento;
        this.verificado = verificado;
    }
    
    
    
    public String getNome(){
            return this.nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        public double getComsbustivel(){
        return(this.quantidadeCombustivel);
    }   

    public double getMaximoCombustivel() {
        return maximoCombustivel;
    }

    public void setMaximoCombustivel(double maximoCombustivel) {
        this.maximoCombustivel = maximoCombustivel;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
        
    
    public void criarFoguete(String nome, double valor, double velo){
        this.maximoCombustivel = valor;
        this.nome = nome;
        this.velocidade = velo;
        this.verificado = true;
        System.out.println("Foguete criado com sucesso");
    }
    
    public void abastecer(double valor){
        if(this.quantidadeCombustivel < this.maximoCombustivel && valor+this.quantidadeCombustivel <= this.maximoCombustivel){
        this.quantidadeCombustivel = valor + this.quantidadeCombustivel;
            System.out.println("O foguete foi abastecido com "+valor+ " Litros");
        }else{
            if(this.quantidadeCombustivel == this.maximoCombustivel){
                System.out.println("O foguete já eestá com a quantidade máxima de combustivel!");
        }
          else{
            System.out.println("A quantidade de combustivel solicitada não pode ser abastecida, pois ultrapassa o limite.");
        }
    }
}
}

