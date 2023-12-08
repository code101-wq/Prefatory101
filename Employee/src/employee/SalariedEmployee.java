
package employee;

public class SalariedEmployee extends Employee {
    private double weeklySalary;
    public SalariedEmployee(String first, String last, int id, double salary){
        super(first, last, id);
        setWeeklySalary(salary);
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public void setWeeklySalary(double salary){
        weeklySalary = salary < 0.0 ? 0.0 : salary;
    }
    /*public double earnings(){
        return getWeeklySalary();
    }*/
    public String toString(){
        return String.format("Salaried Employee: " + "%s\n%s: %,.2f", super.toString(), "Weekly Salary", getWeeklySalary());
    }
    
    public double getPaymentAmount(){
        return getWeeklySalary();
    }
}
