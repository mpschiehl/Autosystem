/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicePrint;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author Marcio Pedro Schiehl
 */
public class Impressora {

    private void imprimir(String texto) {

        FileOutputStream fos = null;
        PrintStream ps = null;
        try {
            fos = new FileOutputStream("LPT1:");
        } catch (Exception ex) {
        }
        try {
            ps = new PrintStream(fos);
        } catch (Exception exception) {
        }
        ps.print(texto);

    }
}
