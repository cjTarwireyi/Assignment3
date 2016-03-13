package com.Assignment3;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by student on 3/9/16.
 */
@Configuration
public class Appconfig {
@Bean(name = "calculate Intrest")
    public LoanIntrest getIntrest(){
    return new Pensioneer();
}
    @Bean(name="Loan")
    public LoanIntrest getStudent(){
        return new StudentIntrest();
    }


}
