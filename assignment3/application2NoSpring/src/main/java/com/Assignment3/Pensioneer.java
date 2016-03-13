package com.Assignment3;

/**
 * Created by student on 3/9/16.
 */
public class Pensioneer  implements LoanIntrest{

    public Pensioneer(){}

    public double calcIntrest(double principal,int years){

        return principal*0.5*years;
    }


}
