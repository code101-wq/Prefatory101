
package employee;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee(String first, String last, int id, double sales, double rate){
        super(first, last, id);
        setGrossSales(sales);
        setCommissionRate(rate);
    }
    public double getCommissionRate(){
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate){
        this.commissionRate = commissionRate;
    }
     public double getGrossSales(){
        return grossSales;
    }
    public void setGrossSales(double grossSales){
        this.grossSales = grossSales;
    }
    
    /*public double earnings() { //before getPaymentAmount method
        return getCommissionRate()*getGrossSales();
    }*/
    public String toString(){
        return String.format("Commission Employee: " + "%s\n%s: %,.2f", super.toString(), "Gross Sales", getGrossSales(), "Commission Rate", getCommissionRate());
    }
    
    public double getPaymentAmount() {
        return getCommissionRate()*getGrossSales();
    }

    /*@Override
    public double getPaymentAmount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}
