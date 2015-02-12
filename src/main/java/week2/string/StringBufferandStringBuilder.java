
package week2.string;

public class StringBufferandStringBuilder 
{

    public static void main(String[] args) 
    {
       String name1 = "Hello";
       name1 = name1.concat(" World");
        System.out.println("==============String ธรรมดา ================");
        System.out.println("Ans = " + name1);
        System.out.println("============================================");
        StringBuffer name2 = new StringBuffer("Hello");
        name2.append(" World");
        System.out.println("==============StringBuffer ================");
        System.out.println("Ans = " + name2);
        System.out.println("============================================");
         System.out.println("==============แก้ไข String ธรรมดา ================");
         System.out.println("Ans = " + name1);
         System.out.println("name1.replace(\"h\",\"e\") Ans = " + name1.replace("e","o"));
         System.out.println("============================================");
         System.out.println("==============แก้ไข StringBuffer ================");
        System.out.println("Ans = " + name2);
        System.out.println("name2.insert(5,\"y\") Ans = " + name2.insert(5,"y"));
        System.out.println("============================================");
        StringBuilder name3 = new StringBuilder(name2);
        System.out.println("==============StringBuilder ================");
        System.out.println("Ans = " + name3);
        System.out.println("name3.delete(4,5) Ans = " + name3.delete(4,5));
        System.out.println("============================================");
         
    }
    
}
