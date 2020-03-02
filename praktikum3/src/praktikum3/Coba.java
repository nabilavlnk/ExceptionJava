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
public class Coba extends Praktikum3 {
    public static void main(String[] args) {
    try {
String myString = "rpq";
        int angka = Integer.parseInt(myString);
        System.out.println(angka);
}
    catch (NumberFormatException e){
            System.out.println(e);
        }
}
}
