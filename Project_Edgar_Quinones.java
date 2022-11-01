import java.util.*;
import java.io.*;

public class Project_Edgar_Quinones
{
	public static void main(String[] args) {
		
		//Variables used for holding data and calculations
		int pNumber, phAge, numOfPolicyClassesMade = 0;
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
				
               PolicyHolder policyHolder = new PolicyHolder(phAge, phFirstName, phLastName, smokerstatus, phHeight, phWeight);
               Policy policy = new Policy(pNumber, providerName,policyHolder);
               
               
	            policysList.add(policy);
               
               
               
			}
				
			
				
			
			for(int i =0; i < policysList.size(); i++)
	         { 
               numOfPolicyClassesMade++; 
				System.out.println(policysList.get(i));
            System.out.println();
				
				if(policysList.get(i).getPolicySmokingStatus().equalsIgnoreCase("smoker")) {
					numOfSmokers++;
				}else {
					numOfNonSmokers++;
				}
	         }
			
         System.out.println("There were "+numOfPolicyClassesMade+" Policy objects created.");
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
