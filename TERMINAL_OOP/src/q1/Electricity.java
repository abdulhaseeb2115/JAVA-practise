package q1;
public class Electricity {
    
    protected int units;
    protected double pricePerUnit;

    public Electricity(int units, double pricePerUnit) {
        this.units = units;
        this.pricePerUnit = pricePerUnit;
    }
    
    public double calculateBill()
    {
        return units *pricePerUnit;
    }
    
}