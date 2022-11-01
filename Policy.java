
public class Policy
{
    //Instance variables, p stands for 'policy', and h stands for 'holder'
    private int pNumber;
    private providerName;
    private PolicyHolder policyHolder;

    

	 //Constructor with parameters 
	public Policy(int pn, String pna,PolicyHolder policy){
	    pNumber = pn;
        providerName = pna;
        policyHolder = new PolicyHolder(policy);
       
	}

	//below are accessors
	
    /**
     * 	The getPolicyNumber() function outputs the policy number
     * 
     * @return policy number (int)
     * */
    public int getPolicyNumber(){
        return pNumber;
    }
    
    /**
     * 	The getProviderName() function outputs the Policy Holder's name
     * 
     * @return Policy Holder's name (String)
     * */
    public String getProviderName(){
        return providerName;
    }
    
    /**
      getPolicyHolder method
      @return - return a reference to a copy of this policyholder object
  */

   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder); 
   }

    
   
    //Below are all Mutator methods
   
    /**
     * 	The setPolicyNumber() function sets the Policy Holder's weight
     * 
     * @param pn, policy number, an int
     * 
     * */
    public void setPolicyNumber(int pn){
        pNumber = pn;
    }
    
    /**
      @param policy - a PolicyHolder object  
   */  
   
   public void setPolicyHolder(PolicyHolder policy)
   {
      policyHolder = new PolicyHolder(policy);
   }

   /**
     * 	The getPolicyHoldersBMI() function calculates and returns the Policy Holder's BMI
     * 
     * @return Policy Holder's BMI
     * */
    public double getPolicyHoldersBMI(){
        return ((double)(phWeight * 703) / (phHeight * phHeight));
    }

    /**
     * 	The getInsurancePrice() function calculates and returns the insurance price
     * 
     * @return Policy Holder's insurance price
     * */
    public double getInsurancePrice(){
    	double price = 600;
        if(phAge > 50){
            price+= 75;
        }
        if(smokerStatus.equalsIgnoreCase(smoker)){
            price+= 100;
        }
        if(((phWeight * 703) / (phHeight * phHeight)) > 35){
            price+= (double)((((phWeight * 703) / (phHeight * phHeight))-35)*20);
        }

        return price;
    }
   
   /**
      toString method
      @return - A string containing the Policy information.
  */ 
      
  /** We make use of the String.format method to format the policy information. */
   
   public String toString()
   {
      return String.format("Provider Number: " + pNumber +
             "\nProvider Name: " + providerName +
             "\nContact Hours: " + contactHours +
             "\nPolicy Holder: " + policyHolder.toString() + //we use the Policy Holders's toString() method for convenience here
                 );
         
   }

    
}