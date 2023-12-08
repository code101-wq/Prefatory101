
package employee;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee(String first, String last, int id, double sales, double rate, double salary){
        super(first, last, id, sales, rate);
        setBaseSalary(salary);
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    /*public double earnings(){ //before getPaymentAmount method
        return getBaseSalary() + super.earnings();
    }*/
    public String toString(){
        return String.format("Base Salaried" + "%s\n%s: %,.2f", super.toString(), "Base Salary", getBaseSalary());
    }
    public double getPaymentAmount(){ 
        return getBaseSalary() + super.getPaymentAmount();
    }
}
