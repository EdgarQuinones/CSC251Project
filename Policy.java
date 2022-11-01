
public class Policy
{
    //Instance variables, p stands for 'policy', and h stands for 'holder'
    private int pNumber;
    private String providerName;
    private PolicyHolder policyHolder;
    private static int numOfPolicyClasses = 0;

    

	 //Constructor with parameters 
	public Policy(int pn, String pna,PolicyHolder policy){
	    pNumber = pn;
        providerName = pna;
        policyHolder = new PolicyHolder(policy);
        numOfPolicyClasses++;
       
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

    public String getPolicySmokingStatus(){
    
    return policyHolder.getSmokingStatus();
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
      toString method
      @return - A string containing the Policy information.
  */ 
      
  /** We make use of the String.format method to format the policy information. */
   
   public String toString()
   {
      return String.format("Provider Number: " + pNumber +
             "\nProvider Name: " + providerName +
             "\nPolicy Holder: " + policyHolder.toString() //we use the Policy Holders's toString() method for convenience here
                 );
         
   }

    
}