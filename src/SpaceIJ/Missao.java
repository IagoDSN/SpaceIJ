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
public class Missao {
    
    Foguete foguete = new Foguete();
    Cientista cientista = new Cientista("Alfredo Souza", "122234365-45", 20000);
    Engenheiro engenheiro = new Engenheiro("Gerson Junior", "13410289682", 30000, true);
    
    private String local;
    private double tempo, distancia;
   
    
    public String getLocal(){
        return this.local;
    }
    public void setLocal(String local){
        this.local = local;
    }
    
    public double getTempo(){
        return this.tempo;
    }
    public void setTempo(double tempo){
        this.tempo = tempo;
    }
    
    public double getDistancia(){
        return this.distancia;
    }
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
    
    public void definirDestino(String local, double distanciaKM){
        this.local = local;
        this.distancia = distanciaKM;
        System.out.println("Local e distancia definidos!");
    }
    public void calcularTempoDeViagem(){
        tempo = this.distancia / this.foguete.velocidade;
        System.out.println("O tempo que a viajem demorará será de "+this.tempo/24+ " Dias");
    }
}
