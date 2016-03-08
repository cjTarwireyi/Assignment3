package com.Assignment3;

/**
 * Created by student on 3/8/16.
 */
public class Student {
    private String name;
    private String surname;

    public Student(String studentName ,String studentSurname){
        name =studentName;
        surname=studentSurname;
    }

    public String getName(){
        return name;

    }
    public String getSurname(){
        return surname;
    }
    public String toString(){
        return name+"    "+surname+"\n";
    }


}
