package com.Assignment3;

/**
 * Created by student on 3/13/16.
 */
public class StudentIntrest implements LoanIntrest  {
    @Override
    public double calcIntrest(double principal, int years) {
        return principal*0.2*years ;
    }

    public StudentIntrest(){


    }


}
