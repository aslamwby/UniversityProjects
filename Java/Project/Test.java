import java.util.ArrayList;
import java.io.*;
import java.util.Date;
import java.util.Calendar;
import java.util.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    // instance variables - replace the example below with your own
    private Vehicle vehicle;
    private ReservationSystem reservationSystem;
    private Customer customer;

    /**
     * Constructor for objects of class Test
     */
    public Test() throws FileNotFoundException
    {
        Vehicle vehicle = new Vehicle ("A9", "BB-0009", "KV09XCY", "AUDI");
        ReservationSystem reservationSystem = new ReservationSystem (new ArrayList<Vehicle>);
        Customer customer = new Customer ("OO-4657", "Adam", "Aslam", "12/02/1999", 25);
        DateUtil DateUtil = new DateUtil ("8888", "AB-1009", "12/02/1999", 5);
       
        vehicle.printDetails();
        vehicle.radData();
    }

    
}
