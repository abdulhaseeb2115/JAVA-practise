public class Shop {
    
    Product [] p_array = new Product[100];
    String location;
    
      
   public Shop(String location) {
        this.location = location;
    }
   
   public void addAProduct( Product p)
   {
       for (int i = 0; i< 100; i++)
       {
           if (p_array [i]==null)
           {
               p_array[i] = p;
               break;
           }
       }
           
   }