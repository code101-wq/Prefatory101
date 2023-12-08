
package employee;

public class PayrollSystemTest {

    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", 121, 200000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", 225, 4000, 55);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue","Jones",85,500000,.06);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis", 200, 50000, .04,150000);
        
        /*System.out.println("Employees processed individually: \n");
        System.out.printf("%s\n%s: %,.2f\n\n", salariedEmployee, "Earned", salariedEmployee.earnings());
        System.out.printf("%s\n%s: %,.2f\n\n", hourlyEmployee, "Earned", hourlyEmployee.earnings());        
        System.out.printf("%s\n%s: %,.2f\n\n", commissionEmployee, "Earned", commissionEmployee.earnings());
        System.out.printf("%s\n%s: %,.2f\n\n", basePlusCommissionEmployee, "Earned", basePlusCommissionEmployee.earnings());*/
        
        //4-element employee array
        Employee employees[] = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        
        System.out.println("Employees processed polymorphically: \n");
        for (Employee currentEmployee : employees){
            System.out.println("\n"+currentEmployee);
            //determine if object is a BasePlusCommissionEmployee
            /*if(currentEmployee instanceof BasePlusCommissionEmployee){
                //downcast Employee ref to BasePlusCommissionEmployee ref
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                double oldBaseSalary = employee.getBaseSalary();
                employee.setBaseSalary(1.10*oldBaseSalary);
                System.out.printf("\nNew base salarywith 10%% increase is %,.2f\n", employee.getBaseSalary());
                System.out.printf("Earned %,.2f\n\n", currentEmployee.earnings());
            }*/
        }
        Payable payableObjects[] = new Payable[4];
        payableObjects[0] = new Invoice("01234", "Seat", 2, 10500);
        payableObjects[1] = new Invoice("56789", "Door", 3, 45000);
        payableObjects[2] = new SalariedEmployee("John", "Reat", 122, 200500);
        payableObjects[3] = new SalariedEmployee("Lisa", "Suit", 231, 194500);
        System.out.println("Invoices and Employees processed polymorphically: \n");
        for (Payable currentPayable : payableObjects){
            System.out.printf(" \n%s: %,.2f\n\n", "Payment Due", currentPayable.getPaymentAmount());
        }
    }
    
}
