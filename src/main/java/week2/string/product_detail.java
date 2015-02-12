
package week2.string;

import java.util.ArrayList;
import java.util.Scanner;

public class product_detail 
{
 String pcode,date,id,size,name;
 int n;
 ArrayList code = new ArrayList();
 void inputdata()
 {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter product code => ddmmyyyy0000MBreeze : (Press Exit to Exit)");
     do
     {
         System.out.print("product code : ");
         pcode = scan.nextLine();
         if(!(pcode.equals("exit")))
             
         {
             code.add(pcode);
         }
     } while (!(pcode.equals("exit")));
 }
    void showdata()
    {
        if(code.size()>0)
        {
            System.out.printf("%-8s%-6s%-5s%-20s \n","date","id","size","name");
            int i;
            for(i=0;i<code.size();i++)
            {
             date = getinfo(code.get(i).toString(),0,8);   
             id = getinfo(code.get(i).toString(),8,12);
             size = getinfo(code.get(i).toString(),12,13);
             name = getinfo(code.get(i).toString(),13,code.get(i).toString().length());
             System.out.printf("%-8s%-6s%-5s%-10s \n",date,id,size,name);
            }
        }
    }
    String getinfo(String code,int a,int b)
    {
        String info = code.substring(a,b);
        return info;
    }

}
