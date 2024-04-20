package com.cracken;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String phrase;
        int age = 27;
        double nbre1 = 10, nbre2 = 2;

        int result = (int) (nbre1 / nbre2);

        String stg = new String();
        String string = new String(" when I'll celebrate");
        stg = " my favorite age";
        phrase = "hello joel";
        System.out.println( phrase.charAt(3) + " " + result);
        System.out.print(age + stg + string);
    }
}
