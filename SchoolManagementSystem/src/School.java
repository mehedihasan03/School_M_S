package SchoolManagementSystem;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalEarnMoney;
    private static int totalSpentMoney;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalEarnMoney = 0;
        totalSpentMoney = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public static int getTotalEarnMoney() {
        return totalEarnMoney;
    }

    public static void updateTotalEarnMoney(int earnMoney) {
        totalEarnMoney += earnMoney;
    }

    public static int getTotalSpentMoney() {
        return totalSpentMoney;
    }

    public static void updateTotalSpentMoney(int spentMoney) {
        totalEarnMoney -= spentMoney;
    }
    
    public int getAllSize(){
        return (teachers.size()+students.size());
    }
    
    
    
}
