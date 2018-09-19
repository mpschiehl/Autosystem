/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.EventQueue;
import view.Sistema;

/**
 *
 * @author Alunos
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          EventQueue.invokeLater(new Runnable() {

              @Override
              public void run() {
                  new Sistema();
              }
          });
    }
    
}
