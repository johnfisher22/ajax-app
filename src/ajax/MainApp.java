/**
 * 
 */
package ajax;


/**
 * Main class that contains the driving main method for this application.    
 * Default Main method for for this application.    
 * @author Johnfisher Uchem
 * @version 1.0.1   08/10/2024 
 * @since Ajax Clients Employees Manager 1.0.2 
 * 
 */

public class MainApp 
{
/**
 * Driver method for this application.   
 * @param args the args parameter in the main method. 
 */
public static void main(String[] args) 
{

		//LAUNCH APP
	new GeneralServices().ajaxclientsEmployeesManager();
	
	// You can also launch this app with the code below
	/**
	 * 	GeneralServices appLauncher = new GeneralServices();
	 *	appLauncher.ajaxclientsEmployeesManager();
	 */

	
}

}