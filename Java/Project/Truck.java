import java.util.ArrayList;
import java.util.*;
import java.awt.*;
public class Truck extends Commercial
{
    
    private ArrayList<String>attributes;

        public Truck()
        {
            super();
            attributes = newArrayList<String>();
        }
        
        public void readData(Scanner scanner)
        {
            super.readData(scanner);
            while (scanner.hasNext())
            attributes.addNext();
        }
   
}
