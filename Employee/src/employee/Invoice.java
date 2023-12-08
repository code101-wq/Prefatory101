
package employee;

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    public Invoice(String part, String description, int count, double price){
        this.partDescription = description;
        this.partNumber = part;
        setQuantity(count);
        setPricePerItem(price);
    }
    public String getPartDescription() {
        return partDescription;
    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public double getPricePerItem() {
        return pricePerItem;
    }
    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int count){
        this.quantity = (count < 0) ? 0 : count;
    }
    public String toString(){
        return String.format("%s: \n%s: %s (%s) \n%s: %,.2f", "Invoice","Part Number", getPartNumber(), getPartDescription(),"Quantity", getQuantity(), "Price per Item", getPricePerItem());
    }
    public double getPaymentAmount(){
        return getQuantity()*getPricePerItem();
    }
}
