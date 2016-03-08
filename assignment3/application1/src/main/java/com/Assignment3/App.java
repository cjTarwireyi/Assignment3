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

        Book book[]= new Book[5];

        book[0]=new Book("Programming","PR02");
        book[1]=new Book("Project Management","PM02");
        book[2]=new Book("Technical Programming","TP02");
        book[3]=new Book("Java","JV02");
        book[4]=new Book("Database","DB02");

        Set<Book>bookSet=new HashSet<Book>();

        for(int control=0;control<5;control++)
        {

            bookSet.add(book[control]);
        }

        System.out.print("Following books are required:\n"+bookSet);

        //This section demo Lists
        Student [] student = new Student[5];
        student[0]= new Student("Cornelious","Tarwireyi");
        student[1]= new Student("Junior","Tarwireyi");
        student[2]= new Student("Paddy","Mahara");
        student[3]= new Student("Usarah","Routers");

        List<Student> studentList = new ArrayList<Student>();

        for(int control=0; control<4;control ++){
            studentList.add(student[control]);
        }

        System.out.print("\n\n\nThe following students are registerd:\n"+studentList);


        //This section demo Maps

        Subject []subject=new Subject[5];

        subject[0]=new Subject("Development Software","DS300");
        subject[1]=new Subject("Technical Programming2","TP200");
        subject[2]=new Subject("Internet Programming3","IRP300");
        subject[3]=new Subject("Project Management","PM300");
        subject[4]=new Subject("Information System","IS300");

        Map subjectMap=new HashMap();

        subjectMap.put(subject[0],"DS300");
        subjectMap.put(subject[4],"IS300");
        subjectMap.put(subject[1],"TP200");
        subjectMap.put(subject[2],"IRP300");
        subjectMap.put(subject[3],"PM300");

        System.out.print("\nThe following subjects are part of the coures\n\n"+subjectMap);


    }
}
