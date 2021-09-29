package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Teacher> teacherList = new ArrayList<>();
        Teacher josim = new Teacher(11, "Josim Uddin", 25000);
        Teacher khaled = new Teacher(13, "Omar Khaled", 20000);
        Teacher kamal = new Teacher(12, "Abu Hena Mostofa Kamal", 22000);
        Teacher fahmida = new Teacher(12, "Fahmida Jannat", 22000);

        teacherList.add(josim);
        teacherList.add(khaled);
        teacherList.add(kamal);
        teacherList.add(fahmida);

        List<Student> studentList = new ArrayList<>();
        Student mehedi = new Student(26033, "Mehedi Hasan", "Zoology");
        Student arif = new Student(26034, "Arifur Rahman", "Zoology");
        Student jinia = new Student(26035, "Mahmuda Farjana", "Zoology");
        Student nishu = new Student(26036, "Ayesha Akhter", "Zoology");
        Student shimu = new Student(26037, "Fatema Alam", "Zoology");
        Student mohon = new Student(26038, "Mohon Das", "Zoology");
        Student piyas = new Student(26039, "Montu Bhoumic", "Zoology");
        Student tamanna = new Student(26040, "Rabeya Begum", "Zoology");
        Student rabbi = new Student(26032, "Rabby Khan", "Zoology");

        studentList.add(arif);
        studentList.add(mehedi);
        studentList.add(mohon);
        studentList.add(rabbi);
        studentList.add(jinia);
        studentList.add(nishu);
        studentList.add(shimu);
        studentList.add(piyas);
        studentList.add(tamanna);

        rabbi.setName("Nazim Uddin");

        School ngc = new School(teacherList, studentList);
        //ngc.addTeachers(teacherList);
        //ngc.addStudents(studentList);

        System.out.println("Student's information");
        for (Student student : studentList) {
            System.out.println(student.getName());
        }
        System.out.println("=====================================================");
        System.out.println("Teacher's INformation");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getName());
        }

        mehedi.feesPaid(12000);
        jinia.feesPaid(15000);
        mohon.feesPaid(12000);
        rabbi.feesPaid(15000);
        arif.feesPaid(12000);
        nishu.feesPaid(15000);
        piyas.feesPaid(12000);
        tamanna.feesPaid(15000);
        shimu.feesPaid(12000);

        System.out.println(ngc.getTotalEarnMoney());

        josim.recieveSalary(josim.getSalary());
        khaled.recieveSalary(khaled.getSalary());
        kamal.recieveSalary(kamal.getSalary());
        //fahmida.recieveSalary(fahmida.getSalary());

        System.out.println(ngc.getTotalEarnMoney());

        ngc.getTeachers().size();
        System.out.println(ngc.getAllSize());

        System.out.println("is empty " + studentList.isEmpty());

        System.out.println("remove " + teacherList.remove(fahmida));

        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getName());
        }

        System.out.println(studentList.indexOf(tamanna));

        studentList.clear();
        for (Student student : studentList) {
            System.out.println(student.getName());
        }

        teacherList.add(fahmida);
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.getName());
        }
        System.out.println("===============================================");
        studentList.add(arif);
        studentList.add(mehedi);
        studentList.add(jinia);
        studentList.add(nishu);
        studentList.add(shimu);
        studentList.add(piyas);

        for (Student student : studentList) {
            System.out.println(student.getName());
        }

        Iterator<Student> g = studentList.iterator();
        System.out.println(g.hasNext());
        System.out.println("========================");
        System.out.println(g.next());
        System.out.println("========================");
        for (Student student : studentList) {
            System.out.println(student.getName());
        }
        System.out.println("========================");

        g.remove();
        for (Student student : studentList) {
            System.out.println(student.getName());
        }
        System.out.println("========================");
        
        System.out.println(studentList.stream());
    }
}
