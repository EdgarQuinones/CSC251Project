import java.util.*;
import java.io.*;

public class Project_Edgar_Quinones
{
	public static void main(String[] args) {
		
		//Variables used for holding data and calculations
		int pNumber, phAge;
    	String phFirstName, phLastName, providerName, smokerstatus, smoker = "smoker", nonsmoker = "non-smoker";
    	int phHeight, phWeight, numOfSmokers = 0, numOfNonSmokers = 0;
    	
    		ArrayList<Policy> policysList = new ArrayList<Policy>();
				
			File file = new File("PolicyInformation.txt");
			try (Scanner inputFile = new Scanner(file)) {
			
			
			while(inputFile.hasNext()) {
				
				
				pNumber = inputFile.nextInt();
				providerName = inputFile.nextLine();
				providerName = inputFile.nextLine();
				phFirstName = inputFile.nextLine();
				phLastName = inputFile.nextLine();
				phAge = inputFile.nextInt();
				smokerstatus = inputFile.nextLine();
				smokerstatus = inputFile.nextLine();
				phHeight = inputFile.nextInt();
				phWeight = inputFile.nextInt();
				
				
	            if(inputFile.hasNext())
	            { 
	               inputFile.nextLine();
	               inputFile.nextLine();
	            }
				
	            policysList.add(new Policy(pNumber, providerName, phAge, phFirstName, phLastName, smokerstatus, phHeight, phWeight));
			}
				
			
				
			
			for(int i =0; i < policysList.size(); i++)
	         { 
				System.out.println("Policy Number: "+policysList.get(i).getPolicyNumber());
				System.out.println("Provider Name: "+policysList.get(i).getProviderName());
				System.out.println("Policyholder's First Name: "+policysList.get(i).getFirstName());
				System.out.println("Policyholder's Age: "+policysList.get(i).getAge());
				System.out.println("Policyholder's Smoking Status: "+policysList.get(i).getSmokingStatus());
				System.out.println("Policyholder's Height: "+policysList.get(i).getHeight());
				System.out.println("Policyholder's Weight: "+policysList.get(i).getWeight());
				System.out.printf("Policyholder's BMI: %,.2f",policysList.get(i).getPolicyHoldersBMI());
				System.out.println();
				System.out.printf("Policy Price: %,.2f\n\n",policysList.get(i).getInsurancePrice());
				
				if(policysList.get(i).getSmokingStatus().equalsIgnoreCase("smoker")) {
					numOfSmokers++;
				}else {
					numOfNonSmokers++;
				}
	         }
			
			System.out.println("The number of policies with a smoker is: "+numOfSmokers);
			System.out.println("The number of policies with a non-smoker is: "+numOfNonSmokers);
			
			
		}
			catch (FileNotFoundException e) {//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
		//use the getMessage method of the exception we "caught" to print out it's message about what went wrong
		System.out.println("Something went wrong r+"
				+ "ading the file: " + e.getMessage());
	}
		
		

		


	}
}
