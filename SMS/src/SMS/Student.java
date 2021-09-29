package SMS;

public class Student {
    private int id;
    private String name;
    private int section;
    private int paidFees;
    private int totalFees;

    public Student(int id, String name, int section) {
        this.id = id;
        this.name = name;
        this.section = section;
        this.paidFees = 0;
        this.totalFees = 25000;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
           
    public int getPaidFees() {
        return paidFees;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public void payFees(int fees) {
        paidFees += fees;
        School.UpdateEarnedTotal(paidFees);
    }

    public int getRemainingFees() {
        return totalFees - paidFees;
    }

    public String toString(){
        return "Studnt Name: " + name;
    }
    
    
    
}
