import java.util.*;
public class StringsLec12{
    public static void main(String args[])
    {
        /*concatenation
        Scanner sc=new Scanner(System.in);
        String first="atul";
        String second="rawat";
        String full=first+" "+second;
        System.out.println(full.length());


        //charat(prints the every single character)
        for(int i=0;i<full.length();i++)
            System.out.println(full.charAt(i));
        */
        

       /*String name1="rawat";
        String name2="rawat";
        if(name1.compareTo(name2)==0)
        {
            System.out.println("strings are equal");

        }
        else{
            System.out.println("strings are not equal");
        }*/



        //substrings
        String name="atul rawat";
        String pick=name.substring(5);
        System.out.println(pick);
        //Strings are immutable means we cannot change the string at run time





    }
}