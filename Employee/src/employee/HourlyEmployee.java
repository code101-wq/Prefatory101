
package employee;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    public HourlyEmployee(String first, String last, int id, double hourlyWage, double hoursWorked){
        super(first, last, id);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }
    public double getHours() {
        return hours;
    }
    public void setHours(double hours){
        this.hours = hours;
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage){
        this.wage = wage;
    }
    
    /*public double earnings(){ //before getPaymentAmount method
        if (getHours() <= 40)
            return getWage()*getHours();
        else
            return 40*getWage()+(getHours()-40)*getWage()*1.5;
    }*/
    public String toString(){
        return String.format("Hourly Employee: " + "%s\n%s: %,.2f", super.toString(), "Hourly Salary", getWage());
    }
    
    public double getPaymentAmount(){
        if (getHours() <= 40)
            return getWage()*getHours();
        else
            return 40*getWage()+(getHours()-40)*getWage()*1.5;
    }
}
