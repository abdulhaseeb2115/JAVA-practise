package q2;
public class Product {
    private String name;
    private Date dateOfExpiry;
    private double price;

    public Product(String name, Date dateOfExpiry, double price) {
        this.name = name;         this.dateOfExpiry = dateOfExpiry;         this.price = price;   
    }

    public String getName() 
{   return name;    }

    public Date getDateOfExpiry() 
{        return dateOfExpiry;    }

    public double getPrice() 
{        return price;    }

   }