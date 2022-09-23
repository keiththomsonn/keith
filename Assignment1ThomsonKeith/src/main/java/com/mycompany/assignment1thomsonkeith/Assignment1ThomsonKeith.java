
package com.mycompany.assignment1thomsonkeith;

/**
 *
 * @author Keith
 */
import java.util.Scanner;
public class Assignment1ThomsonKeith {
    public static void main(String[] args) {
        String business = "Bernadette's Flowers";
        System.out.print(business + "\n25 Hopeton Road\nStratford, PE\nC1B 1H6\n");
        double num1;
        double num2;
        double num3;
        
         Scanner input = new Scanner(System.in);
        
        System.out.println("How many 'Welcome Baby Boy' bouquets?");
        num1 = input.nextDouble();
        
        System.out.println("How many 'Welcome Baby Girl' bouquets?");
        num2 = input.nextDouble();
        
        System.out.println("How many 'Very Special Delivery' bouquets?");
        num3 = input.nextDouble();
        double tax = subTotal(num1, num2, num3) * 0.15 ;
        double total = subTotal(num1, num2, num3) + tax;
        System.out.println("Order Summary");
        System.out.println("Number of Welcome Baby Boy bouquets: " + num1);
        System.out.println("Number of Welcome Baby Girl bouquets: " + num2);
        System.out.println("Number of Very Special Delivery bouquets: " + num3);   
        System.out.println("Subtotal: $" + subTotal(num1, num2, num3));
        System.out.println("Tax: $"+ tax);
        System.out.println("Total Cost: $" + total);
    }
    private static double subTotal(double num1, double num2, double num3)
    {
        return (num1 * 90) + (num2 * 85) + (num3 * 100);
    }
    
}

