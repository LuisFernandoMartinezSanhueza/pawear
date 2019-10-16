/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puebacsm;

/**
 *
 * @author lx699
 */
public class PuebaCsm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "Pico pal que lee";
    }
    
    public static String repeticion(String frase){
       
        for(int j = 0; j < 90000; j++){
         for(int i = 0; i < 90000;i++){
             frase+=repeticion(frase);
               System.out.printlm(frase);
             }
        }
}
