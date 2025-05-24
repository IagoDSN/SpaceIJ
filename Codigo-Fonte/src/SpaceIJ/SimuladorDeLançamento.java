/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpaceIJ;

import java.util.Scanner;

/**
 *
 * @author 13410289682
 */
public class SimuladorDeLançamento {
    public static void main(String[] args) {
        BaseDeLançamento missao1 = new BaseDeLançamento();
        Scanner entrada = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        
        String nomeFoguete;
        double quantiMax, velocidade, gasolina;
        int pimpeiro, aleatorio;
        
    while(true){
        System.out.println("Digite 1 para acessar o programa ou digite 2 para sair: ");
        pimpeiro = entrada.nextInt();
        
        System.out.println("---------------Está preparado para fazer uma viajem emocionante para Marte?------------------");
        
        if(pimpeiro == 1){
        //Definição da missão
        missao1.lancamento.sistema.missao.setDistancia(54600000);
        missao1.lancamento.sistema.missao.setLocal("Marte");
        
        
        System.out.println("-------Criação do foguete------\n");
          System.out.println("Digite o nome do foguete: ");
          nomeFoguete = scan.nextLine();
        System.out.println("Digite a quantidade maxima de combustivel suportada: ");
        quantiMax = entrada.nextDouble();
        System.out.println("Digite a velocidade maxima do foguete: ");
        velocidade = entrada.nextDouble();
        
        missao1.lancamento.sistema.missao.foguete.criarFoguete(nomeFoguete, quantiMax, velocidade);
        
        System.out.println("\n-------------------------------------------");
        aleatorio = 0;
        gasolina = 0;
        
        while(true){
        System.out.println("Digite 1 para abaster o foguete ou digite 2 para prosseguir com o lançamento(Tenha consciência que não podera lançar o foguete com combustivel incompleto): ");
        aleatorio = entrada.nextInt();
        if(aleatorio == 1){
            while(true){
         System.out.println("Digite o valor que deseja abastecer o foguete: ");
          gasolina = entrada.nextDouble();
          if(gasolina<0){
              System.out.println("Você realmente tentou colocar combustivel negativo no foguete? Tente novamente");    
          }else{
              break;
          }
            }
        missao1.lancamento.sistema.missao.foguete.abastecer(gasolina);
        }else{
           if(aleatorio == 2){
        break;
            }else{
               System.out.println("Você digitou um número além dos referidos! Tente novamente");
           }
        }
        }
        System.out.println("A quantidade de combustivel no foguete é: "+missao1.lancamento.sistema.missao.foguete.getComsbustivel());
        System.out.println("-------------------------------------------\n");
        
        missao1.lancamento.sistema.missao.calcularTempoDeViagem();
        missao1.lancamento.sistema.missao.cientista.demitir();
        missao1.lancamento.sistema.missao.engenheiro.aumentarSalarioPorcentagem(10);
        
        System.out.println("\n");   
        System.out.println("O engenheiro "+missao1.lancamento.sistema.missao.engenheiro.getNome()+" está na empresa? "+missao1.lancamento.sistema.missao.engenheiro.verificarStatus());
        System.out.println("O cientista "+missao1.lancamento.sistema.missao.cientista.getNome()+" está na empresa? "+missao1.lancamento.sistema.missao.cientista.verificarStatus());
        
        missao1.lancamento.setAtorizado(false);
        missao1.lancamento.sistema.missao.engenheiro.setAutorizacao(false);
        
        System.out.println("\n----------------------------------------------------");
        missao1.lancamento.sistema.missao.engenheiro.autorizarLancamento();
        missao1.lancamento.verificarCondicoes();
        missao1.lancarFoguete();
        if(missao1.lancamento.getAtorizado() == true){
        System.out.println("----------------------------------------------------\n");
        System.out.println("\n         |");
        System.out.println("        / \\");
        System.out.println("       /   \\");
        System.out.println("      /=====\\");
        System.out.println("      | Spac |");
        System.out.println("      |  🚀   |");
        System.out.println("      |  IJ  |");
        System.out.println("      |_____ |");
        System.out.println("      |  | | |");
        System.out.println("      /=======\\");
        System.out.println("     /         \\");
        System.out.println("    /           \\");
        System.out.println("   /             \\");
        System.out.println("  /               \\");
        System.out.println(" /_________________\\");
        System.out.println(" ~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("--------------------------------------------");
        System.out.println("Rastreamento do foguete");
        missao1.lancamento.sistema.rastrearFoguete(20000);
        missao1.lancamento.sistema.rastrearFoguete(40000000);
        missao1.lancamento.sistema.rastrearFoguete(54600000);
        System.out.println("--------------------------------------------");
    }
    }
    else{
            if(pimpeiro == 2){
                System.out.println("O Programa finalizou");
                break;
            }
            else{
                System.out.println("Você digitou um numero além dos referidos");
            }
            }
}
    }
    }

