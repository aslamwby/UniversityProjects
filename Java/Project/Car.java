import java.io.*;
import java.util.*;

   public class Car extends Vehicle
   {
        // instance variables - replace the example below with your own
        private String bodyType;
        private int noOfDoors;
        private int noOfSeats;

        public Car()
        {
            super();
        }
        
        public void printDetails()
         {
          System.out.println("Body type: "+bodyType+".");
          System.out.println("Number of doors: "+noOfDoors+".");
          System.out.println("Number of seats:"+noOfSeats+".");
         }
         
        public void readData (Scanner scanner)
         {
          bodyType = scanner.next();
          noOfDoors = scanner.nextInt();
          noOfSeats = scanner.nextInt();
         }
         
         public String getBodyType()
        {
             return bodyType;
        }
        
        public int getNoOfDoors()
        {
             return noOfDoors;
        }
        
        public int getNoOfSeats()
        {
             return noOfSeats;
        }
        
        public void readData()
        {
            //super.readData();
        }
}
