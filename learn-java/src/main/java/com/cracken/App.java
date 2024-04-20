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

        String i = new String();
        double result = (float) (nbre1 / nbre2);

        i = i.valueOf(result);

        double k = Double.valueOf(i).intValue();

        String stg = new String();
        String string = new String(" when I'll celebrate");
        stg = " my favorite age";
        phrase = "hello joel";
        System.out.println( phrase.charAt(3) + " " + i + " " + k);
        System.out.print(age + stg + string);
    }
}
