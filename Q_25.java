/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javagit;

import java.util.Scanner;

public class Q_25 {
     public static void main( String[] args )
	{
            int age;
            String name ;
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Hey, What's your name? ");
            name = sc.next();
            
            System.out.print("Ok, " + name + ", how old are you? ");
            age = sc.nextInt();
            
            if (age < 16)
                     {
                         System.out.println("You can't drive");
                     }
            else if (age < 18)
                 {
                     
                     System.out.println("You can't vote");
                 }
            else if (age < 25)
             {
                 
                 System.out.println("You can't rent a car") ;
             }
            else if (age >= 25)
            {
                System.out.println("You can do pretty much anything");
            }
            
            
            }
    
}
