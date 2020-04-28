import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?" +
                                "&serverTimezone=UTC" +
                                "&useSSL=false" +
                                "&allowPublicKeyRetrieval=true",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ) {
            int choose;
            int studentID;
            String studentName;
            String address;
            String phone;
            Scanner input = new Scanner(System.in);
            List<student> studentList = new ArrayList<>();
            controller addStudent = new controller();
            do {
                System.out.println("1. Add student records\n2. Display student records\n3.Save\n4.Exit");
                System.out.print("Enter choose: ");
                choose = input.nextInt();
                switch (choose) {
                    case 1:
                        student stu1 = new student();
                        System.out.print("Enter ID Stundent: ");
                        studentID = input.nextInt();
                        System.out.print("Enter Student Name: ");
                        studentName = input.next();
                        System.out.print("Enter Address Student: ");
                        address = input.next();
                        System.out.print("Enter Student's phone: ");
                        phone = input.next();
                        stu1.setStudentID(studentID);
                        stu1.setName(studentName);
                        stu1.setAddress(address);
                        stu1.setPhone(phone);
                        studentList = addStudent.addStudents(stu1);
                        break;
                    case 2:
                        for (int i = 0; i < studentList.size(); i++) {
                            System.out.println((i + 1) + "." + studentList.get(i));
                        }
                        break;
                    case 3 :
                        int countInsert = stmt.executeUpdate(addStudent.insertStudent((student) studentList));
                        System.out.println("Insert successfull");
                }
            } while (choose == 4);
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
