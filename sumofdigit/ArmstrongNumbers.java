package sumofdigit;

import java.util.Scanner;

public class ArmstrongNumbers 
{
     public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int sum= 0,r,temp,num;
        System.out.println("enter any number : ");
        num =input.nextInt();
        
        temp =num;
        
        while(temp != 0)
        { 
            r = temp %10;
            sum = sum + r*r*r;
            temp = temp/10 ;
        }
       System.out.println("sum of digits : " +sum);
          if (num== sum) 
          {
            System.out.println("Armstrong number");
            
          }
        else{
                System.out.println("Not Armstrong number");
            }
    }
    
}
