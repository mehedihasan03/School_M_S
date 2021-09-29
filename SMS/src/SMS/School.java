package SMS;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int earnedTotal;
    private static int spentTotal;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        earnedTotal = 0;
        spentTotal = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public static int getEarnedTotal() {
        return earnedTotal;
    }

    public static void UpdateEarnedTotal(int earn) {
        earnedTotal += earn;
    }

    public static int getSpentTotal() {
        return spentTotal;
    }

    public static void updateSpentTotal(int spent) {
        earnedTotal -= spent;
    }
    
    
    
    
    
}
