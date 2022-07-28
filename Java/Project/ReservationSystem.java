import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.FileDialog;
import java.util.Random;
import java.awt.Frame;


   public class ReservationSystem
{
    private ArrayList<Vehicle>vehicleReservationList;
    private ArrayList<Customer>customerList;
    private String lastReservationNumber;
    private Random randomGenerator;
    private String FileName;
    private boolean firstCallToGenerateReservationNo;
    private String lastNumberGeneratedFileName;
    private boolean reservationNo;
    
    public ReservationSystem()
    {
       this.vehicleList = new  ArrayList<Vehicle>();
       this.customerList = new ArrayList<Customer>();
       randomGenerator = new Random();
       
    }

    public void printAllVehicles()
    {
        for (int x=0; x<vehicleList.size(); x++)
        {
           vehicleList.get (x).printDetails();
        }
    }
     
    public int customerList()
    {
        return 0;
    }
    
    public Customer getCustomer (String customerID)
    {
        if(vehicle.containsKey(vehID))
        {
            return vehicle.get(vehID);
        }
        
        else
        {
            return null;
        }
    }
    
    public void writeVehicleData (String FileName) throws FileNotFoundException
    {
        PrintWriter pWriter = new PrintWriter(fileName);
        for (Vehicle a : Vehicle)
      {
          String lineOfOutput = a.getRegNo() ;
                                a.getMake();
          pWriter.println(lineOfOutput);
      }
    }
    
    public void deleteVehicleReservation (int reservationNo)
    {
        
    }
    
    public boolean makeVehicleReservation()
    {
            //boolean validationCheck;
            String  reservationNo=generateReservationNo();
            VehicleReservation newReservation;
        
            if(!customer.containsKey(customerID))
            {
                System.out.println("Not Correct ID");
                return false;
            }
            else if (!vehicle.containsKey(vehID) )
            {
                system.out.println("Not correct vehicle ID");
                return false;
            }
            else if (!DateUtil.isValidDateString(startDate))
            {
                system.out.println("Enter correct date");
                return false;
            }
            
            else
            {
                newReservation = new VehicleReservation();
                return true;
            }
            
    }
    
    public void readVehicleData(String fileName)
    {
         FileDialog filebox = new FileDialog(myFrame,"Open", FileDialog.LOAD);
         fileBox.setVisible(true); 
         Frame myFrame = null;
          Scanner scanner = new Scanner (dataFile) ;
         
         while ( scanner.hasNext() )
         {
             String lineOfText = scanner.nextLine();
                 
                 if (!lineOfText.StartsWith("//") && (!lineOfText.isEmpty() && (!lineOfText.startsWith("["))))
               {
                 System.out.println(lineOfText);
                 scanner sc2 = new Scanner(lineOfText);
                 Vehicle vehicleHonda = new Vehicle();
               }
    
         }
    }
    
     public void storeCustomer()
     {
        Customer customer = new Customer();
        CustomerList.add(customer);
     }
    
     public void printAllCustomers() 
      {  
       if (customer() == 0) {
            system.out.println ("No customers");
       }
       else  
       {
          system.out.println ("The list of Customer");
       }
     }
     
     public String generateReservationNo() throws FileNotFoundException
     {
         String reservationNo = "0";
          if (firstCallToGenerateReservationNo == true)
          {
              Scanner scanner = new Scanner(new File (lastNumberGeneratedFileName));
              lastReservationNumber = scanner.nextInt();
              lastReservationNumber = lastReservationNumber +1;
              reservationNo = reservationNo+lastReservationNumber;
             while (reservationNo.length() !=6)
            {
              reservationNo = "0"+reservationNo;
            }
                PrintWriter pWriter = new PrintWriter(lastNumberGeneratedFileName);
                pWriter.print(reservationNo);
                pWriter.close();
                reservationNo = false;
                return reservationNo;
          }
          else
          {
            lastReservationNumber = lastReservationNumber +1;
            reservationNo = reservationNo+lastReservationNumber;
            while (reservationNo.length() != 6)
            {
                reservationNo = "0"+reservationNo;
            }
            PrintWriter pWriter = new PrintWriter(lastNumberGeneratedFileName);
            pWriter.print(reservationNo);
            pWriter.close();
            return reservationNo;
          }
    }
    
      public void writeCustomerData(String fileName) throws FileNotFoundException
     {
         Frame owner = null;
         FileDialog fileBox = new FileDialog(owner, "", FileDialog.SAVE);
         fileBox.setVisible(true);
         
         PrintWriter pWriter = new PrintWriter(fileName);
         for (int x = 0; x <customerList.size() ; x++)
         {
             customerList.get(x).writeData(pWriter);
         }
         pWriter.close();
     }
     
     public void StoreVehicleReservation(VehicleReservation vehicleReservation)
     {
         vehicleReservationList.add(vehicleReservation);
         diary.addReservation(vehicleReservation);
     }
     
     private String generateCustomerID(String starter, int amountOfNumber)
     {
         for (int x=0; x<amountOfNumbers; x++)
         {
             int nextNumber = randomGenerator.nextInt(10);
             starter = starter + String.valueOf(nextNumber);
         }
         return starter;
     }
   }
