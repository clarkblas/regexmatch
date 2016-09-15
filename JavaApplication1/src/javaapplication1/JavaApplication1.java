package javaapplication1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class JavaApplication1 {
   
    
    public static boolean isTrue(String str)
       {
       return str.matches("[tT]true");
       }
    public static boolean containsFalse(String str)
       {
       return str.matches(".*false.*");
       }
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println(isTrue("True"));
        System.out.println(containsFalse("adhfahasdfalsehasdha"));
        Scanner sc = new Scanner(new FileReader("input.txt"));
        
        while(sc.hasNext())
        {
            System.out.println(sc.nextLine());
        }
        
    }
}
