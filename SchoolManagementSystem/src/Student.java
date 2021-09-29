package SchoolManagementSystem;
public class Student {
    private int id;
    private String name;
    private String grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 25000;
    }
    
    public void setGrade(String grade){
        this.grade = grade;
    }

    public void feesPaid(int fees) {
        feesPaid += fees;
        School.updateTotalEarnMoney(feesPaid);
        
    }
    
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int getFeespaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    
    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }
    
    public String toString(){
        return "Name: " + name + " Subject: " + grade;
        
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}


