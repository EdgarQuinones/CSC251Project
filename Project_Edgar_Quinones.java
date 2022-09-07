import java.util.Scanner;

public class Project_Edgar_Quinones
{
	public static void main(String[] args) {
		
		//Variables used for holding data and calculations
		int pNumber, phAge;
    	String phFirstName, phLastName, providerName, smokerstatus, smoker = "smoker", nonsmoker = "non-smoker";
    	double phHeight, phWeight;
		
		try (//Scanner keyboard used for user input
		Scanner keyboard = new Scanner(System.in)) {
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
			//This do while loop makes sure the user enters the correct input
			while(!(smokerstatus.equalsIgnoreCase(smoker))&& !(smokerstatus.equalsIgnoreCase(nonsmoker))){
				
				  System.out.println("\nNot a valid option try again.");
				  System.out.println(smokerstatus.equalsIgnoreCase(smoker));
					
				  System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
				
				  smokerstatus = keyboard.nextLine();
			  }
			
			
			

			System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
			phHeight = keyboard.nextDouble();

			System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
			phWeight = keyboard.nextDouble();

			//Using the constructor and user input, information is put into the object
			policy = new Policy(pNumber, providerName, phAge, phFirstName, phLastName, smokerstatus, phHeight, phWeight);

			//All the data, plus the calculated BMI and insurance price is shown to the user

			System.out.println("\nPolicy Number: "+policy.getPolicyNumber());
			System.out.println("Provider Name: "+policy.getProviderName());
			System.out.println("Policyholder's First Name: "+policy.getFirstName());
			System.out.println("Policyholder's Age: "+policy.getAge());
			System.out.println("Policyholder's Smoking Status: "+policy.getSmokingStatus());
			System.out.println("Policyholder's Height: "+policy.getHeight());
			System.out.println("Policyholder's Weight: "+policy.getWeight());
			System.out.printf("Policyholder's BMI: %,.2f",policy.getPolicyHoldersBMI());
			System.out.println();
			System.out.printf("Policy Price: %,.2f",policy.getInsurancePrice());
		}
		
		

		


	}
}
