import java.io.PrintWriter;
import java.util.*;
   public class Customer
   {
            private String customerID;
            private String firstName;
            private String surname;
            private String initials;
            private String title;
    
         public Customer(String customerIDOfCustomer, String firstNameOfCustomer, String surnameOfCustomer, String initialsOfCustomer, String titleOfCustomer )
        {
            customerID = customerIDOfCustomer;
            firstName = firstNameOfCustomer;
            surname = surnameOfCustomer;
            initials = initialsOfCustomer;
            title = titleOfCustomer;
         }

        public Customer()
            {
              customerID = "Unknown";
            }
        
        public void readCustomerData()
            {
            
            }

        public String getCustomerID()
        {
             return customerID;
        }
        
        public String getfirstName()
        {
             return firstName;
        }

        public String getSurname()
        {
             return surname;
        }

        public String getInitials()
        {
             return initials;
        }
        
        public String getTitle()
        {
             return title;
        }
        
        public void setCustomerID(String inputCustomerID)
        {
            customerID = inputCustomerID;
        }
        
        public void setSurname(String inputSurname)
        {
            customerID = inputSurname;
        }
        
        public void setFirstName(String inputFirstName)
        {
            customerID = inputFirstName;
        }
        
        public void setinitials(String inputinitials)
        {
            customerID = inputinitials;
        }
        
        public void generateCustomerID(String prefixID, int digitsID)
        {
            Random random = new Random();
             for (digitsID = 0; digitsID < 6; digitsID++)
             {
                digitsID = random.nextInt(10);
                System.out.println("CustomerID : " +prefixID+ (digitsID * 6));
            }
            
        }
        
         public void writeData(PrintWriter printW)     
         
         {
           printW.println("CustomerID: "+customerID+".","Name: "+firstName+" "+surname+".", "Customer Initials: "+initials+".", "Customer Title: "+title+".");
         }
        
        public void printDetails()
         {
             System.out.println("CustomerID: "+customerID+".");
          System.out.println("Name: "+firstName+" "+surname+".");
          System.out.println("Customer Initials: "+initials+".");
          System.out.println("Customer Title: "+title+".");
          
          
         }
   }
