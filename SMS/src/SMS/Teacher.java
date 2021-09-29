package SMS;

public class Teacher {
    private String name;
    private String post;
    private int salary;
    private int salaryEarned;

    public Teacher(String name, String post, int salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public void recSalary(int salary){
        salaryEarned += salary;
        School.updateSpentTotal(salary);
    }
    
    public String toString(){
        return post + "  " + name;
    }
    
}
