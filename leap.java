# leep.java
import java.io.*;
import java.util.*;
public class leap
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%4==0)
        {
            System.out.println("leep year");
        }
        else
        {
            System.out.println("not a leep year");
        }
    }
}
