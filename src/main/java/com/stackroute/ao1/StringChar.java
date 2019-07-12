package com.stackroute.ao1;
import java.util.*;

public class StringChar
{
    public static void main(String[] args)
    {
        char[] chr={'I','a','m','o','o','h','a','a'};
        String s1=" ";
        String s2="name";

        s1=s1.copyValueOf(chr); //This method will replaces existing to new string
        System.out.println("The String:"+s1);

        s2=s2.copyValueOf(chr,3,5); //Replacing of existing to new string
        System.out.println("The String:"+s2);
    }

}
