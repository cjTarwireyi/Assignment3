package com.Assignment3;

/**
 * Created by student on 3/8/16.
 */
public class Subject {
    private String subjectCode;
    private String subjectName;

    public Subject(String subject,String code){
        subjectCode=code;
        subjectName= subject;
    }

    public String getSubjectCode(){

        return subjectCode;
    }
        public String getSubjectName(){
            return subjectName;
        }
    public String  toString() {
        return subjectCode+"         "+subjectName+"\n";
    }
}
