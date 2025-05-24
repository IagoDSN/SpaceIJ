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
public class ControleDeLançamento {
    SistemaDeRastreamento sistema = new SistemaDeRastreamento();
    private boolean atorizado;

    public ControleDeLançamento() {
        System.out.println("O painel de controle de lançamento está configurado corretamente!");
    }
    
    public boolean getAtorizado(){
            return this.atorizado;
        }
        public void setAtorizado(boolean atorizado){
            this.atorizado = atorizado;
        }
    
    public void verificarCondicoes(){
        if(sistema.missao.engenheiro.getAutorizacao() == true && sistema.missao.foguete.getComsbustivel() == sistema.missao.foguete.getMaximoCombustivel() && sistema.missao.foguete.isVerificado() == true && sistema.missao.getDistancia()>0 && sistema.missao.getLocal()!=""){
            this.atorizado = true;
            System.out.println("O lançamento do foguete foi autorizado");
        }
        else{
            System.out.println("O lançamento do foguete não foi autorizado, verifique as condições!");
        }
    }
}
