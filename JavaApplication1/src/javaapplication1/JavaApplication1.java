package javaapplication1;
public class JavaApplication1 {
   
    public static boolean isTrue(String str)
       {
       return str.matches("[t/T]true");
       }
    public static void main(String[] args)
    {
        System.out.println(isTrue("True"));
    }
}
