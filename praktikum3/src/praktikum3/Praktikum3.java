/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author Lab Informatika
 */
public class Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 6/10;
        
        
        try{
            a = Integer.parseInt(args[0]);
            
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    
}
