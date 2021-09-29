package SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher patwari = new Teacher(11, "Patwari", 13000);
        Teacher vuiya = new Teacher(12, "Vuiya", 12500);
        Teacher badal = new Teacher(13, "Badal", 13500);
        Teacher taiyab = new Teacher(14, "Taiyab", 14000);
        Teacher sekhar = new Teacher(15, "Sekhar", 14500);
        
        List<Teacher> teacherList = new ArrayList<>();
        
        teacherList.add(patwari);
        teacherList.add(vuiya);
        teacherList.add(badal);
        teacherList.add(taiyab);
        teacherList.add(sekhar);
        
        Student mehedi = new Student(1241, "Mehedi", 10);
        Student zishan = new Student(1242, "Zishan", 10);
        Student zunayed = new Student(1243, "Zunayed", 10);
        Student milon = new Student(1244, "Milon", 10);
        Student jabed = new Student(1245, "Jabed", 10);
        Student jahid = new Student(1246, "Jahid", 10);
        Student sifat = new Student(1247, "Sifat", 10);
        
        List<Student> studentList = new ArrayList<>();
        
        studentList.add(mehedi);
        studentList.add(zishan);
        studentList.add(zunayed);
        studentList.add(sifat);
        studentList.add(jabed);
        studentList.add(milon);
        studentList.add(jahid);
        
        
        School nzs = new School(teacherList, studentList);
        
    // add a new teacher
        Teacher josim = new Teacher(11, "Josim", 11500);
        nzs.addTeacher(josim);
    
    //fees paid by student.
        mehedi.payFees(18000);
        zishan.payFees(16000);
        jabed.payFees(12000);
        jahid.payFees(17000);
        milon.payFees(15000);
        zunayed.payFees(14500);
        sifat.payFees(17000);
        
    //School total earning 
        System.out.println("NZS total earned: " + nzs.getTotalMoneyEarned());
    
    //Teachers salay
        patwari.receiveSalary(patwari.getSalary());
        vuiya.receiveSalary(vuiya.getSalary());
        badal.receiveSalary(badal.getSalary());
        taiyab.receiveSalary(taiyab.getSalary());
        sekhar.receiveSalary(sekhar.getSalary());
        
    // School fund
        System.out.println("after giving teachers salary NZS has: " + nzs.getTotalMoneyEarned());
        
    //Student information.
        System.out.println(mehedi);
     
    //Teacher information
        System.out.println(patwari);
    
        System.out.println("Student's information: ");
        
        for (Student student : studentList) {
            System.out.print(student.getId() + " ");
            System.out.print(student.getName() + " ");
            System.out.print(student.getSession()+ " ");
            System.out.println();
        }
        
        System.out.println("Teacher's information: ");
        for (Teacher sir : teacherList) {
            System.out.print(sir.getId() + " ");
            System.out.print(sir.getName() + " ");
            System.out.print(sir.getSalary()+ " ");
            System.out.println();
        }
        
    }
}
