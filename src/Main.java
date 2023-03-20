import  java.util.ArrayList;
import  java.util.Scanner;

public class Main {
public static ArrayList<library> libraries = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kütüphane sistemine hoşgeldiniz");
        System.out.println("1- Add Student\n2- Remove Student\n3- Print All Students\n4- Exit");
        while (true){
            int islem = scanner.nextInt();

            switch (islem){
                case 1:


                    System.out.print("Enter student name: ");
                    String name = scanner.next();

                    System.out.println("Enter student Surname: ");
                    String surName = scanner.next();

                    System.out.print("Enter student id: ");
                    int studentNum = scanner.nextInt();

                    System.out.print("Enter book id: ");
                    int bookId = scanner.nextInt();

                    library library = new library(name, surName, bookId,studentNum);
                    libraries.add(library);

                    System.out.println("Student Book added successfully.");
                    break;


                case 2:
                    System.out.print("Enter student book id: ");
                    int bookid = scanner.nextInt();

                    for (library s : libraries) {
                        if ( s.getBookId() == bookid) {
                            libraries.remove(s);
                            System.out.println("Book removed successfully.");
                            break;
                        }
                    }
                    break;


                case 3:
                    System.out.println("All Students:");
                    for (library s : libraries) {
                        System.out.println("Name: " + s.getName() + ", Surname: " + s.getSurname() +  ", Student Number: "+ s.getStudentNum() + ", Book Id: " + s.getBookId());
                    }
                    break;


                case 4:
                    System.exit(0);


                default:
                    System.out.println("Invalid choice.");
            }


        }

    }
}