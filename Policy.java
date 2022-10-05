
public class Policy
{
    //Instance variables, p stands for 'policy', and h stands for 'holder'
    private int pNumber, phAge;
    private String phFirstName, phLastName, providerName, smokerStatus, smoker = "smoker";
    private int phHeight, phWeight;

    //Default constructor
    public Policy(){
	    pNumber = 0;
        providerName = "";
        phAge = 0;
        phFirstName = "";
        phLastName = "";
        smokerStatus = "";
        phHeight = 0;
        phWeight = 0;

	}

	 //Constructor with parameters 
	public Policy(int pn, String pna, int pa, String fn, String ln, String ss, int phh, int phw){
	    pNumber = pn;
        providerName = pna;
        phAge = pa;
        phFirstName = fn;
        phLastName = ln;
        smokerStatus = ss;
        phHeight = phh;
        phWeight = phw;
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
     * 	The setPolicyNumber() function sets the Policy Holder's weight
     * 
     * @param pn, policy number, an int
     * 
     * */
    public void setPolicyNumber(int pn){
        pNumber = pn;
    }
    
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

}