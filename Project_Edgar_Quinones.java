import java.util.Scanner;
import java.util.*;

public class Project_Edgar_Quinones
{
	/*Demonstrate your Policy class by writing a Demo class 
		 
		The Demo class should ask the user to enter all necessary information, create a single instance of the Policy 
		class using the constructor that accepts arguments, and then display all the information about the policy using 
		the appropriate methods of the Policy class. See the Sample Input and Output below for how to format the input and 
		output of the Demo class (make sure to match the wording and formatting exactly). */
	public static void main(String[] args) {
		
		//Variables used for holding data and calculations
		int pNumber, phAge;
    	String phFirstName, phLastName, providerName, smokerstatus;
    	boolean phSmokingStatus = false;
    	double phHeight, phWeight;
		
		//Scanner keyboard used for user input
		Scanner keyboard = new Scanner(System.in);

		//Policy Object used for data storing and calcuations
		Policy policy; 

		//Gets users input and stores data for future use
		System.out.print("Please enter the Policy Number: ");
		pNumber = keyboard.nextInt();
		keyboard.nextLine();

		System.out.print("\nPlease enter the Provider Name: ");
		providerName = keyboard.nextLine();

		System.out.print("\nPlease enter the Policyholder's First Name: ");
		phFirstName = keyboard.nextLine();

		System.out.print("\nPlease enter the Policyholder's Last Name: ");
		phLastName = keyboard.nextLine();

		System.out.print("\nPlease enter the Policyholder's Age: ");
		phAge = keyboard.nextInt();
		keyboard.nextLine();

		System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
		smokerstatus = keyboard.nextLine();
		//This if statement sets boolean for smoking status and will be used in the object
		if(smokerstatus== "smoker"){
            phSmokingStatus = true;
        }else{
            phSmokingStatus = false;
        }
		

		System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
		phHeight = keyboard.nextDouble();

		System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
		phWeight = keyboard.nextDouble();

		//Using the constructor and user input, information is put into the object
		policy = new Policy(pNumber, providerName, phAge, phFirstName, phLastName, phSmokingStatus, phHeight, phWeight);

		//All the data, plus the calculated BMI and insurance price is shown to the user

		System.out.println("\nPolicy Number: "+policy.getPolicyNumber());
		System.out.println("Provider Name: "+policy.getProviderName());
		System.out.println("Policyholder's First Name: "+policy.getFirstName());
		System.out.println("Policyholder's Age: "+policy.getAge());
		System.out.println("Policyholder's Smoking Status: "+policy.getSmokingStatus());
		System.out.println("Policyholder's Height: "+policy.getHeight());
		System.out.println("Policyholder's Weight: "+policy.getWeight());
		System.out.printf("Policyholder's BMI: %.2f",policy.getPolicyHoldersBMI());
		System.out.println();
		System.out.printf("Policy Price: %.2f",policy.getInsurancePrice());
		
		System.out.print(smokerstatus);
		System.out.print(phSmokingStatus);

		


	}
}
