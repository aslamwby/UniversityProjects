
import java.util.*;
public class Commercial extends Vehicle
{
    // instance variables - replace the example below with your own
    private int payload;
    
    /**
     * Constructor for objects of class Commercial
     */
    public Commercial()
    {
        super();

    }
   
    public void readData(Scanner scanner)
    {
        super.readData(scanner);
        payload = scanner.nextDouble();
    }
    
    public double getPayload()
    {
        return payload;
    }
    
    public void setPayload (double payload)
    {
        this.payload = payload;
    }
}
