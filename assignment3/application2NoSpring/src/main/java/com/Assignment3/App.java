package com.Assignment3;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Double principal,rate;
        int years;
        Scanner scan=new Scanner(System.in);
        Pensioneer pensioner = new Pensioneer();

        System.out.print("Enter principal amount");
        principal=Double.parseDouble(scan.nextLine());
        System.out.print("Enter principal Rate");
        rate=Double.parseDouble(scan.nextLine());
        System.out.print("Enter principal Years");
        years= Integer.parseInt(scan.nextLine());

        System.out.println( "The intrest ammount is: "+pensioner.calcIntrest(principal,rate,years) );
    }
}
