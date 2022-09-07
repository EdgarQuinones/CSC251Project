
public class Policy
{
    //Instance variables, p stands for 'policy', and h stands for 'holder'
    private int pNumber, phAge;
    private String phFirstName, phLastName, providerName, smokerStatus, smoker = "smoker";
    private double phHeight, phWeight;

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

	 //Constructor with perameters 
	public Policy(int pn, String pna, int pa, String fn, String ln, String ss, double phh, double phw){
	    pNumber = pn;
        providerName = pna;
        phAge = pa;
        phFirstName = fn;
        phLastName = ln;
        smokerStatus = ss;
        phHeight = phh;
        phWeight = phw;
	}

    //Below are all Accessor methods
    public int getPolicyNumber(){
        return pNumber;
    }
    public String getProviderName(){
        return providerName;
    }
    public int getAge(){
        return phAge;
    }
    public String getFirstName(){
        return phFirstName;
    }
    public String getLastName(){
        return phLastName;
    }
    public String getSmokingStatus(){
        return smokerStatus;
       
    }
    public double getHeight(){
        return phHeight;
    }
    public double getWeight(){
        return phWeight;
    }

    //Below are all Mutator methods
   
    public void setPolicyNumber(int pn){
        pNumber = pn;
    }
    public void setAge(int a){
        phAge = a;
    }
    public void setFirstName(String fn){
        phFirstName = fn;
    }
    public void setLastName(String ln){
        phLastName = ln;
    }
    public void setSmokingStatus(String ss){
        smokerStatus = ss;
    }
    public void setHeight(double h){
        phHeight = h;
    }
    public void setWeight(double w){
        phWeight = w;
    }

    //Calculates the policy holder's BMI
    public double getPolicyHoldersBMI(){
        return ((phWeight * 703) / (phHeight * phHeight));
    }

    //Calculates Insurance price
    public double getInsurancePrice(){
        double price = 600;
        if(phAge > 50){
            price+= 75;
        }
        if(smokerStatus.equalsIgnoreCase(smoker)){
            price+= 100;
        }
        if(((phWeight * 703) / (phHeight * phHeight)) > 35){
            price+= ((((phWeight * 703) / (phHeight * phHeight))-35)*20);
        }

        return price;
    }

}