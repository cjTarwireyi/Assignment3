package com.Assignment3;
import java.util.*;
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
        int option;
        Scanner scan=new Scanner(System.in);
        Pensioneer pensioner = new Pensioneer();
        StudentIntrest student = new StudentIntrest();

        System.out.print("Enter:\n1. Pansioner Interst\n2. Student intrest");
        option= Integer.parseInt(scan.nextLine());


            System.out.print("Enter principal amount");
            principal = Double.parseDouble(scan.nextLine());
            System.out.print("Enter principal Years");
            years = Integer.parseInt(scan.nextLine());

        if(option==1) {
            System.out.println(" intrest ammount is: " + pensioner.calcIntrest(principal, years));
        }
        else if(option==2)
        {

            System.out.println(" intrest ammount is: " + student.calcIntrest(principal, years));
        }
        else
        {
            System.out.print("You entered wrong option");
        }

    }
}
