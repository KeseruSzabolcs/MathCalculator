package org.FastTrackIT;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("First number? ");
        //double a = scanner.nextDouble();
        //System.out.println("Second number? ");
        //double b = scanner.nextDouble();
        //System.out.println( "Hello World!" );
        Calculate calculate = new Calculate();
        calculate.add(1.1, 1.1);
        System.out.println(calculate.result);
        calculate.multiply(1.1,1.1);
        System.out.println(calculate.result);
        calculate.divide(1.1,1.1);
        System.out.println(calculate.result);

    }
}
