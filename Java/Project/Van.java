
import java.util.Scanner;
public class Van extends Commercial
{
    // instance variables - replace the example below with your own
    private double loadVolume;
    private boolean slidingDoors ;
    
        public Van()
        {
            super();
            loadVolume = 0;
            this.slidingDoors = slidingDoors;
        }

        public double getLoadVolume()
        {
             return loadVolume;
       
        }
        
        public void setLoadVolume( double loadVolume)
        {
            this.loadVolume = loadVolume;
        }
        
         public boolean SlidingSideDoor()
        {
             return this.slidingDoors;
       
        }
        
        public void readData(Scanner scanner)
        {
            super.readData(scanner);
            loadVolume = scanner.nextDouble();
            String slidingDoors = scanner.next();
            if(slidingDoors.equals("yes"))
            {
                slidingDoors = true;
            }
            else
            {
                slidingDoors = false;
            }
            
        }
        
    }
