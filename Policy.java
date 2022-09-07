import java.lang.ref.PhantomReference;

public class Policy
{
    //Instance variables, p stands for 'policy', and h stands for 'holder'
    private int pNumber, phAge;
    private String phFirstName, phLastName;
    private bool phSmokingStatus;
    private double phHeight, phWeight;

    //Default constructor
    public Policy(){
	    pNumber = 0;
        phAge = 0;
        phFirstName = "";
        phLastName = "";
        phSmokingStatus = null;
        phHeight = 0;
        phWeight = 0;

	}

	 //Constructor with perameters 
	public Policy(int pn, int pa, String fn, String ln, bool ss, double phh, double phw){
	    pNumber = pn;
        phAge = pa;
        phFirstName = fn;
        phLastName = ln;
        phSmokingStatus = ss;
        phHeight = phh;
        phWeight = phw;
	}

    //Below are all Accessor methods
    public int getPolicyNumber(){
        return pNumber;
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
        if(phSmokingStatus){
            return "Smoker";
        }else{
            return "Non-Smoker";
        }
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
    public void setSmokingStatus(bool ss){
        if(ss){
            phSmokingStatus = true;
        }else{
            phSmokingStatus = false;
        }
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
        if(phSmokingStatus){
            price+= 100;
        }
        if(((phWeight * 703) / (phHeight * phHeight)) > 35){
            price+= ((((phWeight * 703) / (phHeight * phHeight))-35)*20);
        }

        return price;
    }

}