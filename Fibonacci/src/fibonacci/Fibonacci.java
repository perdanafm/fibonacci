/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i;
        System.out.println("Input : ");
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        System.out.print(n2);   
        for(i=1;i<count;++i)   {    
            n3=n1+n2;    
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3;    
        }    
    }
}
