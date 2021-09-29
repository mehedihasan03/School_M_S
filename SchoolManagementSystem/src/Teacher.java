package SchoolManagementSystem;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int earnSalary;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.earnSalary = 0;
    }    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public void recieveSalary(int salary){
        earnSalary += salary; 
        School.updateTotalSpentMoney(salary);
    }

    public String toString(){
        return name + " " + earnSalary;
    }
    
    
    
    
    
    
    
}
