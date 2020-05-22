/**
 * This class models a mobile phone.
 * 
 * @author  (Awais Taslem) 
 * @group   (1 (one))
 * @version (1.1 15/10/2019 @ 20:16)
 */
public class Mobile
{
    // instance variables - replace the example below with your own
    private String model;           //Name of the phone
    private int screenSize;         //Screen size in inches
    private int memorySize;         //Storage of the phone in GB
    private String provider;        //Cell provider such as EE or O2
    private String contractType;    //Type of contract such as pay as you go or 24 month contract
    private double cameraRes;       //The megapixels of the camera
    private int charge;             //the battery charge percentage
    private boolean gps;            //if the phone has gps or not
    private String screenRes;       //the resoloution of the screen
    private int batterySize;        //the size of the battery
    private boolean flashlight;     //if the phone has a flashlight or not
    private String material;        //what material the phone is made out of
    //private int hour;
    

    /**
     * Constructor for objects of class Mobile
     * This asks the user to input the name and screen size and other attributes of the phone into the system
     */
    //Take provider1 and contractType1 out of this
    public Mobile(String model1, int screenSize1, int memorySize1, double cameraRes1, boolean gps1)//Therare 5 paremeters
    {
        // initialise instance variables
        //Assigning the user input to private varibales above
       model = model1;
       screenSize = screenSize1;
       memorySize = memorySize1;
       cameraRes = cameraRes1;
       charge = 100;
       gps = gps1;
    }
    
    public void setProvider(String provider1)
    {
        provider = provider1;   //Assinging the provider to the provider variable above
    }
    
    public void setContractType(String contractType1)
    {
        contractType = contractType1;   //Assigning the contract type to the contracttype variable above
    }
    
    public void changeProvider(String newProvider, String newContractType)  //No point in doing this twice
    {
        provider = newProvider;             //changing the provider and the contract type
        contractType = newContractType;
    }

    public void changeBattery(int changeAmount)
    {
        charge = changeAmount;      //user can chnage the amount of charge in the phone, default is 100%
    }
    
    public void chargeUp()
    {
        charge = 100;   //instant charge upto 100%
    }
    
    public void switchedOnFor(int hour)
    {
        charge = charge - hour;     //simlates power draw on the phone
    }
    
    public String getType()
    {
       return model;        //gets the model
    }
    
    public String getProvider()
    {
        return provider;        //gets the provider
    }
    
    public int getCharge()
    {
        return charge;      //gets the current charge amount
    }
    
    //4 New attributes
    public void material(String material1)//What material the phone is made of such as metal for iphones or glass for samsungs
    {
        material = material1;
    }
    
    public void screenResoloution(String resoloution)//The resouloution of the screen. widtch by height (1920 x 1080)
    {
        screenRes = resoloution;
    }
    
    public void batteryCapacity(int capacity)//The capacity of the battery in mHa
    {
        batterySize = capacity;
    }
    
    public void flashlightYesNo(boolean yesNo)
    {
        flashlight = yesNo;     //Does it have a flshlight yes or no (true or false).
    }
    
    //4 new gets
    public String getMaterial()
    {
        return material;    //getting the material variable
    }
    
    public String getscreenResoloution()
    {
        return screenRes;   //getting the screenRes variable
    }
    
    public int getBatteryCapacity()
    {
        return batterySize;     //getting the batterySize variable
    }
    
    public boolean getFlashlight()
    {
        return flashlight;      //getting the flashlight variable
    }
    
    public void turnGPSOnOff()      //Allows the user to turn off and turn on the gps when they want to
    {
        if(gps == true)
        {
            gps = false;
        }
        else if(gps == false)
        {
            gps = true;
        }
    }
    
    public void printDetails()//A method that outputs the details of the phone in a reciept form
    {
        System.out.println("##############################################");
        System.out.println("Phone Model = " + model);               //using concatanation to join the text with the variables
        System.out.println("Screen sisze = " + screenSize);
        System.out.println("Memory Size = " + memorySize);
        System.out.println("Service Provider = " + provider);
        System.out.println("Contract type = " + contractType);
        System.out.println("Camera Megapixels = " + cameraRes);
        System.out.println("Battery = " + charge);
        System.out.println("Is there a gps " + gps);
        System.out.println("The screen resoloution is " + screenRes);
        System.out.println("The battery size is " + batterySize + " mAh");
        System.out.println("Is there a flashlight " + flashlight);
        System.out.println("The material is " + material);
        System.out.println("##############################################");
    }
    
    public void checkCharge()//This method checks what the battery percentage is at
    {
        //charge = charge - hour;
        if (charge <= 25) //If less than or eqaul to 25 it outputs a messege
        {
            System.out.println("Please charge your phone battery is at " + charge + "%");   ////using concatenation to join the text with the variables
        }
        else if (charge == 0)//if equal to 0 then phone shutsdown
        {
            System.out.println("Phone is now turning off");
        }
        else//the battery is resonably charged
        {
            System.out.println("Your phone charge is sufficient");
        }
   }
   
   public void printReport()//Method that prints a report on the details of the phone
   {   //using concatanation to join the text with the variables to make a report
       System.out.println("This mobile is a " + model + " with the service provider " + provider + "\n"
       + "and the type of contract is " + contractType + "." + "\n"
       + "It has a screen size of " + screenSize + " inches and a camera resoloution of " + cameraRes + " megapixels." + "\n" 
       + "It has " + memorySize + "GB of memory." + " The phones battery size is " + batterySize + " mAh." + "\n"
       + "The screen resoloution is " + screenRes + ". " + "The phone is made out of " + material + "." + "\n"
       + "At present it has " + charge + "% battery charge remaining.");
   }
}
