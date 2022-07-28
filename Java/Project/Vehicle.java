 import java.util.Scanner;

   public class Vehicle
     {
        // instance variables - replace the example below with your own
        private String group;
        private String vehID;
        private String regNo;
        private String make;
        private String model;
        private boolean aircon;
        private double engineSize;
        private String gearBox;
        private String fuel;
        private String transmission;
        private int mileage;
        private String dateFirstRegistered;

        public Vehicle()
        {
            // initialise instance variables
            //group = groupOfVehicle;
            //vehID = vehIDOfVehicle;
            //regNo = regNoOfVehicle;
            //make = makeOfVehicle;
        }

        public String getGroup()
        {
            return group;
        }
        
         public String getvehID()
        {
            return vehID;
        }
        
         public String getRegNo()
        {
            return regNo;
        }
        
         public String getMake()
        {
            return make;
        }
        
        public void setGroup(String inputGroup)
        {
            group = inputGroup;
        }
        
        public void setVehID(String inputVehID)
        {
            group = inputVehID;
        }
        
        public void setMake(String inputMake)
        {
            group = inputMake;
        }
        
        public void setRegNo(String inputRegNo)
        {
            group = inputRegNo;
        }
        
        public void readData(Scanner scanner)
        {
         
             group = scanner.next();
             vehID = scanner.next();
             regNo = scanner.next();
             make = scanner.next();
             model = scanner.next();
             aircon = scanner.nextBoolean();
             engineSize = scanner.nextDouble();
             gearBox = scanner.next();
             fuel = scanner.next();
             transmission = scanner.next();
             mileage = scanner.nextInt();
             dateFirstRegistered = scanner.next();
         
        }
         
        public void printDetails()
         {
             System.out.println(make + model+ " Group: " +group+ " ID:"+vehID);
             System.out.println(" Mileage: " +mileage);
             
         }
      }
   
