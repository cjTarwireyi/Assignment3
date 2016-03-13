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

        int option;
        Book book[] = new Book[5];
        Student[] student = new Student[5];
        Subject[] subject = new Subject[5];

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter:\n1  HashSet\n2  Lists\n3  Maps  ");
        option=Integer.parseInt(scan.nextLine());
        if(option==1) {


            book[0] = new Book("Programming", "PR02");
            book[1] = new Book("Project Management", "PM02");
            book[2] = new Book("Technical Programming", "TP02");
            book[3] = new Book("Java", "JV02");



            Set<Book> bookSet = new HashSet<Book>();

            for (int control = 0; control < 3; control++) {

                bookSet.add(book[control]);
            }
            bookSet.add(book[1]);

            System.out.print("Following books are required:\n" + bookSet);
        }
        else if(option==2) {
            //This section demo Lists


            student[0] = new Student("Cornelious", "Tarwireyi");
            student[1] = new Student("Junior", "Tarwireyi");
            student[2] = new Student("Paddy", "Mahara");
            student[3] = new Student("Usarah", "Routers");
            book[4] = new Book("Database", "DB02");


            List studentList = new ArrayList<Student>();

            for (int control = 0; control < 3; control++) {
                studentList.add(student[control]);
            }
            studentList.add(book[4]);
            System.out.print("\n\n\nList of students and book:\n" + studentList);

        }
        else if(option==3) {
            //This section demo Maps


            String mapKey;

            subject[0] = new Subject("Development Software", "DS");
            subject[1] = new Subject("Technical Programming2", "TP");
            subject[2] = new Subject("Internet Programming3", "IRP");
            subject[3] = new Subject("Project Management", "PM");
            subject[4] = new Subject("Information System", "IS");

            Map subjectMap = new HashMap();

            subjectMap.put( "DS300",subject[0]);
            subjectMap.put( "IS300",subject[4]);
            subjectMap.put( "TP200",subject[1]);
            subjectMap.put( "IRP300",subject[2]);
            subjectMap.put( "IS300",subject[4]);
            System.out.print("Enter ey to display the subject");
            mapKey=scan.nextLine();
            if (subjectMap.containsKey(mapKey)) {

                System.out.print("\nThe subject you searched for is: \n\n" + subjectMap.get(mapKey));
            }
            else
            {
                System.out.print("\nYou have entered a wrong key\n\n");
            }

        }
        else{

            System.out.print("You entered wrong option");
        }

    }
}
