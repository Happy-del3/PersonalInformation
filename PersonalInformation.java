import java.util.Scanner;
import java.time.LocalDate;
  
public class PersonalInformation {
 
    public static void main(String[] args) {
        // Declare variables
        int age, year, month, day;
        char gender, choice;
        long phoneNumber;
        String fullNames, lastName, emailAddress, status;
        
        // Instantiate --> Create the Scanner object
        Scanner input = new Scanner(System.in);
        
        // Prompt for user to enter their full names
        System.out.print("Please enter your full names: ");
        
        // Read a String from the keyboard, and store it in fullNames
        fullNames = input.nextLine();
        
        // Prompt for user to enter their last name
        System.out.print("Please enter your last name: ");
        
        // Read a String from the keyboard, and store it in lastName
        lastName = input.nextLine();
        
        // Prompt for user to enter their age
        System.out.print("Please enter your age: ");
        
        // Read an integer from the keyboard, and store it in age
        age = input.nextInt();
        
        // Prompt for user to enter their birth year
        System.out.print("Please enter your birth year in YYYY format: ");
        
        // Read an integer from the keyboard, and store it in year
        year = input.nextInt();
                
        // Prompt for user to enter their birth month
        System.out.print("Please enter your birth month in MM format: ");
        
        // Read an integer from the keyboard, and store it in month
        month = input.nextInt();
        
        // Prompt for user to enter their birth day
        System.out.print("Please enter your birth day in DD format: ");
        
        // Read an integer from the keyboard, and store it in day
        day = input.nextInt();
     
        // Instantiate --> Create the LocalDate 
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
		
	// Prompt for user to enter their email address
        System.out.print("Please enter your email address: ");
        
        // Read a String from the keyboard, and store it in emailAddress
        emailAddress = input.next();
        
        // Prompt for user to enter their cellphone number
        System.out.print("Please enter your cellphone number: ");
        
        // Read a long from the keyboard, and store it in phoneNumber
        phoneNumber = input.nextLong();
        
        // Prompt for user to enter their gender
        System.out.print("Please enter your gender (Male(M/m) or Female(F/f)): ");
        
        // Read a char from the keyboard, and store it in gender
        gender = input.next().charAt(0);
       
        // Prompt for user to choose their Marital status
        System.out.print("Please choose your marital status \n" +
                           "S/s - Singled \n" +
                           "M/m - Married \n" +
                           "D/d - Divorced \n" +
                           "W/w - Widowed \n\n" +
                           "Your choice: ");
        
        // Read a char from the keyboard, and store it in choice
        choice = input.next().charAt(0);
        
        // Determine marital status by entering code either in uppercase or lowercase
        switch(choice){
            case 'S':
            case 's': 
                status = "Singled";
                break;
            case 'M':
            case 'm':
                status = "Married";
                break;
            case 'D':
            case 'd':
                status = "Divorced";
                break;
            case 'W':
            case 'w':
                status = "Widowed";
                break;
            default:
                status = "Unknown";
                
        }
        
        // Display the personal information
        System.out.println("\n=========================================== \n" + 
                           "            PERSONAL INFORMATION        \n\n" +
                           "Full names is " + fullNames + "\n" +
                           "Last name is " + lastName + "\n" + 
                           "Age is " + age + "\n" +
                           "Date of Birth in YYYY-MM-DD is " + dateOfBirth + "\n" +
						   "Email address is " + emailAddress + "\n" +
                           "Cellphone number is 0" + phoneNumber + "\n" +
                           "Gender is " + gender + "\n" +
                           "Marital status is " + status + "\n" +
                           "===========================================");
        
    }
    
}
