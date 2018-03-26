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
     public static void main(String args[])
    {
        System.out.println("Input : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Sum of Fibonacci" + 
        " numbers is : "+ calculateSum(n));
    }

    static int calculateSum(int n)
    {
        if (n <= 0)
           return 0;
      
        int fibo[]=new int[n+1];
        fibo[0] = 0; fibo[1] = 1;
      
        // Initialize result
        int sum = fibo[0] + fibo[1];
      
        // Add remaining terms
        for (int i=2; i<=n; i++)
        {
            fibo[i] = fibo[i-1]+fibo[i-2];
            sum += fibo[i];
        }
      
        return sum;
    }
}
