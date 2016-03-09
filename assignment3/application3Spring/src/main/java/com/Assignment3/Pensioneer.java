package com.Assignment3;

/**
 * Created by student on 3/9/16.
 */
public class Pensioneer implements LoanIntrest{

    public Pensioneer(){}

    public double intrest(double principal,double rate,int years){

        return principal*rate*years;
    }


}
