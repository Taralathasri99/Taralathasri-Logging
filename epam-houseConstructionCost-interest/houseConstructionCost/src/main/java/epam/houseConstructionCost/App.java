package epam.houseConstructionCost;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 *
 */
public class App extends Construction
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
       Construction obj=new Construction();
       Scanner sc=new Scanner(System.in);
       LOGGER.info("Enter the option you want to choose 1.Standard materials 2.Above Standard material 3.High Standard materials");
       int choice=sc.nextInt();
       LOGGER.info("Enter the total area of the house");
       int area=sc.nextInt();
       LOGGER.info("Enter you want Automated or not");
       String automated=sc.next();
       if(choice==1)
       {
    	  LOGGER.info("Construction cost of a house is: Rs "+obj.standardMaterials(area)); 
       }
       else if(choice==2)
       {
    	   LOGGER.info("Construction cost of a house is: Rs "+obj.aboveStandardMaterials(area)); 
       }
       else if(choice==3 || choice==4)
       {
    	   LOGGER.info("Construction cost of a house is: Rs "+obj.highStandardMaterials(area,automated)); 
       }
       else
    	   LOGGER.info("Invalid choice");
    }
}
