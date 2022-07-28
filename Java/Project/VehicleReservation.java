import java.util.ArrayList;
import java.io.*;
import java.util.Date;
import java.util.Calendar;
import java.util.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;

public class VehicleReservation
{
    // instance variables - replace the example below with your own
    private String reservationNo;
    private String vehID;
    private String customerID;
    private Date startDate;
    private int noOfDays;
    

    /**
     * Constructor for objects of class VehicleReservation
     */
    public VehicleReservation(String startDate, int noOfDays)
    {
        // initialise instance variables
     this.reservationNo = reservationNo;
     this.vehID = vehID;
     this.customerID = customerID;
     this.startDate = DateUtil.convertDateToShortString(startDate);
     this.noOfDays = noOfDays;
    }

    public String vehicleReservation()
    {
        // put your code here
        reservationNo = null;
        vehID = null;
        customerID = null;
        startDate = null;
        noOfDays = 0;
    }
    
    public void readData (Scanner scanner)
    {
        while (scanner.hasNext())
        reservationNo = scanner.next();
        vehID = scanner.next();
        customerID = scanner.next();
        startDate = DateUtil.convertDateToShortString(scanner.next());
        
    }
    
    public String getReservationNo()
    {
        return reservationNo;
    }
    
    public void getStartDate()
    {
        return startDate;
    }
    
    public void getNoOfDays()
    {
        return noOfDays;
    }
    
    public void writeData (PrintWriter pWriter)
    {
        pWriter.print(reservationNo+"");
        pWriter.print(vehID+"");
        pWriter.print(customerID+"");
        pWriter.print(startDate+"");
    }
    
    public void printDetails()
    {
        System.out.println(reservationNo+"");
        System.out.println(vehID+"");
        System.out.println(customerID+"");
        System.out.println(startDate+"");
    }
    
}

