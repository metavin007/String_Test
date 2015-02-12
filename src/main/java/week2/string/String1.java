
package week2.string;

import java.util.Scanner;

public class String1 
{
    public static void main(String[] args) 
    {
     String Input1 = "JAVA";
        System.out.print("Enter Input2 = ");
        Scanner scan = new Scanner(System.in);
        String Input2 = scan.nextLine();
      
        System.out.println("Input1 = " + Input1);
        System.out.println("Input2 = " + Input2);
        if (Input1 == Input2)
        {
            System.out.println("Input1 = Input2");
        }
        else
        {
            System.out.println("Input1 != Input2");
        }
          Input1 = Input2;
          System.out.println("Input1 = " + Input1);
        System.out.println("Input2 = " + Input2);
        if (Input1 == Input2)
        {
            System.out.println("Input1 = Input2");
        }
        else
        {
            System.out.println("Input1 != Input2");
        }
    }
    
}
