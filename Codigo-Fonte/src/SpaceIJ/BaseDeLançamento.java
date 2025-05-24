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
public class BaseDeLançamento {
  ControleDeLançamento lancamento = new ControleDeLançamento();

    public BaseDeLançamento() {
        System.out.println("A base de lançamento está preparada!");
    }
  
  public void lancarFoguete() {
      if(lancamento.getAtorizado() == true){
           for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
           System.out.println("Foguete lançado com sucesso");
           System.out.println("fuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
      }
      else{
          System.out.println("Não foi possivel lançar o foguete, não está autorizado");
      }
  }
}
