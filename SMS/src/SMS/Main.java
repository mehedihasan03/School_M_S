package SMS;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        Teacher farid = new Teacher("Farid Ahmed", "Trainer", 80000);
        teacherList.add(farid);        
        
        List<Student> studentList = new ArrayList<>();        
        Student mehedi = new Student(1263377, "Mehedi Hasan", 5000);
        studentList.add(mehedi);
        
        School idb = new School(teacherList, studentList);
        System.out.println(farid);
        System.out.println(mehedi);
        
        mehedi.payFees(20000);
        
        farid.recSalary(farid.getSalary());
        
        System.out.println(idb.getEarnedTotal());
    }
    
}
