
package controlstatement;

import java.util.Scanner;

public class ElseIfLadderDemo
{
     
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
        
        int num;
        System.out.println("enter any integer");
        num =input.nextInt();
        
        if (num>0) 
        {
             System.out.println("positive");   
         }
        else if (num<0) {
             System.out.println("negative");
        }
        else
            System.out.println("Zero");
           
    
     }
}