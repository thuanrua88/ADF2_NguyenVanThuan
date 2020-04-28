import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class controller {
        String sqlInsert;
        List<student> students = new ArrayList<>();

        public List<student> addStudents (student student){
        students.add(student);
        return students;
    }
        public String insertStudent(student student){
            sqlInsert = "Insert into students values(" + student.getStudentID() + ",'" + student.getName() + "','" + student.getAddress() + "','" + student.getPhone() + "')";
            return sqlInsert;
        }
}

