package epam.Interest;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;


import org.apache.logging.log4j.LogManager;

public class App extends interest
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
	public static void main( String[] args )
    {
       interest obj1=new interest();
       int principle,time,noOfYears;
       float rateOfInterest;
       LOGGER.info("Enter the type of Interest 1.Simple Interest 2.Compound Interest");
       Scanner sc=new Scanner(System.in);
       int choice=sc.nextInt();
       LOGGER.info("Enter the principle amount,Time,Rate of Interest");
	   principle=sc.nextInt();
	   time=sc.nextInt();
	   rateOfInterest=sc.nextFloat();
       if(choice==1)
       {
    	   LOGGER.info("Simple interest is: Rs."+obj1.simpleInterest(principle,time,rateOfInterest));    	   
       }
       else
       {
    	   LOGGER.info("Enter the no of years for compound interest");
    	   noOfYears=sc.nextInt();
    	   LOGGER.info("Compound interet is:Rs."+obj1.compoundInterest(principle, time, rateOfInterest, noOfYears)); 	   
       }
       
    }
}