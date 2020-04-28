package ADF2_NguyenVanThuan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while(i > 0) {
            System.out.println("1. Add student records\n" +
                    "2. Display student records\n" +
                    "3. Save\n" +
                    "4. Exit");
            int num = new Scanner(System.in).nextInt();
            switch (num) {
                case 1:
                    System.out.println("Add student records:");
                    StudentsController.add();
                    break;
                case 2:
                    System.out.println("Display student records");
                    StudentsController.select();
                    break;
                case 3:
                    System.out.println("Save");
                    StudentsController.save();
                    break;
                case 4:
                    System.out.println("End");
                    i = -1;break;
                default:
                    System.out.println("nothing");break;
            }
        }
    }

}
