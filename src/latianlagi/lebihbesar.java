/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latianlagi;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class lebihbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bil1, bil2;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan 1 : ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan 2 : ");
        bil2 = input.nextInt();

        if (bil1 > bil2) {
            System.out.println("Yang lebih besar: "+bil1);
        }
        else if (bil1 < bil2){
            System.out.println("Yang lebih besar: "+bil2);
        }
        
        
}
}