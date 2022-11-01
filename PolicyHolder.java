
public class PolicyHolder
{
    //Instance variables, p stands for 'policy', and h stands for 'holder'
    private int phAge;
    private String phFirstName, phLastName,  smokerStatus, smoker = "smoker";
    private int phHeight, phWeight;
    

   
   
  /*Constructor that accepts arguments for the policy holder's age, first and last name, smoking status, and the height/weight
    This constructor can be used to initialize the fields. 
    @param phAge - age
    @param phFirstName - first name
    @param phLastName - last name
    @param smokerStatus - smoking status
    @param phHeight - height
    @param phWeight - weight
    
  */


	 //Constructor with parameters 
	public PolicyHolder(int pa, String fn, String ln, String ss, int phh, int phw){
        phAge = pa;
        phFirstName = fn;
        phLastName = ln;
        smokerStatus = ss;
        phHeight = phh;
        phWeight = phw;
	}
   
    /*The copy constructor creates a copy of the policy holder class class that it is passed as a parameter.
     We use this to avoid secuirty holes.  
     @param object2 - the object to copy
   */
   public PolicyHolder(PolicyHolder object2)
   {
        phAge = object2.phAge;
        phFirstName = object2.phFirstName;
        phLastName = object2.phLastName;
        smokerStatus = object2.smokerStatus;
        phHeight = object2.phHeight;
        phWeight = object2.phWeight;
      
   }
   /*
   public TextBook(TextBook object2)
   {
      title = object2.title;
      author = object2.author;
      publisher = object2.publisher;
      price = object2.price;
   }

   
   */
   

	//below are accessors
	
    
    
    /**
     * 	The getAge() function outputs the age of Policy Holder
     * 
     * @return Policy Holder's age (int)
     * */
    public int getAge(){
        return phAge;
    }
    
    /**
     * 	The getFirstName() function outputs Policy Holder's first name
     * 
     * @return Policy Holder's first name (String)
     * */
    public String getFirstName(){
        return phFirstName;
    }
    
    /**
     * 	The getLastName() function outputs Policy Holder's last name
     * 
     * @return Policy Holder's last name (String)
     * */
    public String getLastName(){
        return phLastName;
    }
    
    /**
     * 	The getSmokingStatus() function outputs Policy Holder's smoking status
     * 
     * @return Policy Holder's smoking status (String)
     * */
    public String getSmokingStatus(){
        return smokerStatus;
       
    }
    
    /**
     * 	The getHeight() function outputs Policy Holder's height
     * 
     * @return Policy Holder's height (double)
     * */
    public int getHeight(){
        return phHeight;
    }
    
    /**
     * 	The getWeight() function outputs Policy Holder's weight
     * 
     * @return Policy Holder's weight (double)
     * */
    public int getWeight(){
        return phWeight;
    }

    //Below are all Mutator methods
   
    
    /**
     * 	The setAge() function sets the Policy Holder's age
     * 
     * @param a, Policy Holder's age, an int
     * 
     * */
    public void setAge(int a){
        phAge = a;
    }
    
    /**
     * 	The setFirstName() function sets the Policy Holder's first name
     * 
     * @param fn, Policy Holder's first name, a String
     * 
     * */
    public void setFirstName(String fn){
        phFirstName = fn;
    }
    
    /**
     * 	The setFirstName() function sets the Policy Holder's last name
     * 
     * @param ln, Policy Holder's last name, a String
     * 
     * */
    public void setLastName(String ln){
        phLastName = ln;
    }
    
    /**
     * 	The setSmokingStatus() function sets the Policy Holder's smoking status
     * 
     * @param ss, Policy Holder's smoker status, a String
     * 
     * */
    public void setSmokingStatus(String ss){
        smokerStatus = ss;
    }
    
    /**
     * 	The setHeight() function sets the Policy Holder's height
     * 
     * @param h, Policy Holder's height, a double
     * 
     * */
    public void setHeight(int h){
        phHeight = h;
    }
    
    /**
     * 	The setWeight() function sets the Policy Holder's weight
     * 
     * @param w, Policy Holder's weight, a double
     * 
     * */
    public void setWeight(int w){
        phWeight = w;
    }
    
    /**
     * 	The getPolicyHoldersBMI() function calculates and returns the Policy Holder's BMI
     * 
     * @return Policy Holder's BMI
     * */
    public double getPolicyHoldersBMI(){
        return ((double)(getWeight() * 703) / (getHeight() * getHeight()));
    }

    /**
     * 	The getInsurancePrice() function calculates and returns the insurance price
     * 
     * @return Policy Holder's insurance price
     * */
    public double getInsurancePrice(){
    	double price = 600;
        if(getAge() > 50){
            price+= 75;
        }
        if(getSmokingStatus().equalsIgnoreCase("smoker")){
            price+= 100;
        }
        if(((getHeight() * 703) / (getHeight() * getHeight())) > 35){
            price+= (double)((((getWeight() * 703) / (getHeight() * getHeight()))-35)*20);
        }

        return price;
    }

    /**
      toString method
      @return - A string containing the policy holder information.
  */ 

   /*
     We make use of the String.format method to format the price. 
   */
   
   public String toString()
   {
      return String.format("Policy Holder's First Name: " + phFirstName + 
             "\nPolicyholder's Last Name: " + phLastName + 
             "\nPolicyholder's Age: " + phAge +
             "\nPolicyholder's Smoking Status: " + smokerStatus +
             "\nPolicyholder's Height: " + phHeight +
             "\nPolicyholder's Smoking Weight: " + phWeight+
             "\nPolicyholder's BMI: %.2f\nPolicy Price: " + getInsurancePrice(), getPolicyHoldersBMI());
             
   }

}