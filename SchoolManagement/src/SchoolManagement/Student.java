package SchoolManagement;

public class Student {
    private int id;
    private String name;
    private int session;
    private int feesPaid;
    private int feesTotal;
    
    public Student(int id, String name,int session){
        this.id = id;
        this.name = name;
        this.session = session;
        this.feesPaid = 0;
        this.feesTotal = 20000; 
    }
    
    public void setGrade(int session){
        this.session = session;
    }
    
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSession() {
        return session;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    
    public int getRemainingFeess(){
        return feesTotal-feesPaid;
    }
    
    @Override
    public String toString(){
        return "Student ID: "+ id + " name: " + name + " fees paid: " + feesPaid + " remaining fees: " + getRemainingFeess();
    }
    
    
    
    
    
}
