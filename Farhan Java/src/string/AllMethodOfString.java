package string;

import java.lang.*;


public class AllMethodOfString {

    public static void main(String[] args)
    {

        String s = "Farhan"; //literal
        String s0 = "chowdhury"; //literal
        String s1 = "chowdhury"; //literal

        String s2 = new String("Jerin"); //object
        String s3 = new String("Fahmida Sultana"); //object
        String s4 = new String("laptop"); //object
        String s5 = new String("MOBILE"); //object
        String s6 = new String("Hello"); //object
        String s7 = new String("Hello"); //object
        String s8 = new String(); //object

        int len = s.length();
        System.out.println("Length of String s: "+len);//6
        boolean b = s8.isEmpty();
        System.out.println("isEmpty check of String s8: "+b);//true

        System.out.println("CharAt of String s1: "+s1.charAt(5)); //h
        System.out.println("indexOf String s3: "+s3.indexOf('t'));//11
        System.out.println("subString of String s3: "+s3.substring(3,9));//mida S
        System.out.println("toUpperCase of String s4: "+s4.toUpperCase());
        System.out.println("toLowerCase of String s5"+s5.toLowerCase());

        String message = "Hello"+"farhan"+"i'm Farhan.";
        System.out.println("length of String message"+message.length());//22

        System.out.println("Array String: ");
        String arr[] = new String[] {s,s0,s1,s2,s3,s4,s5,s6,s7,s8};
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("String "+i+": "+arr[i]);
        }

        if(s0 == s1) // this one check memory address
        {
            System.out.println("== check memory address: Yes");
        }
        else
        {
            System.out.println("No");
        }
        //Yes

        if(s6.equals(s7)) // this one check value check
        {
            System.out.println("equal() check value: Yes");
        }
        else
        {
            System.out.println("No");
        }
        //Yes






    }

}
