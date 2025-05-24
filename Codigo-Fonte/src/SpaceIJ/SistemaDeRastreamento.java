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
public class SistemaDeRastreamento {
    Missao missao = new Missao();

    public SistemaDeRastreamento() {
        System.out.println("A missão foi confirmada pelos gerentes");
    }
    
    public void rastrearFoguete(double localPresente){
        if(localPresente > missao.getDistancia()){
            System.out.println("O foguete ultrapassou o destino! Verifique os dados.");
        }else{
            if(localPresente == missao.getDistancia()){
                System.out.println("Ele está no destino");
            }
            else{
        if(localPresente >= missao.getDistancia()/2 && localPresente < missao.getDistancia()){
            System.out.println("O foguete está mais perto de "+missao.getLocal()+", "+(missao.getDistancia()-localPresente)+"Km de distancia de "+missao.getLocal());
        }else{
            System.out.println("O foguete está mais perto da Terra, "+missao.getDistancia()+"Km de distancia da Terra");
        }
    }
        }
  }
  }
