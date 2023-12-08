
package employee;

public abstract class Employee implements Payable{
    private String firstName;
    private String lastName;
    private int id;
    public Employee (String first, String last, int id){
        setFirstName(first);
        setLastName(last);
        setId(id);
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String toString() {
        return String.format("%s %s\nID: %s", getFirstName(), getLastName(), getId());
        
    }
    
    //abstr method: to be overridden by subclasses
    //public abstract double earnings();
}
