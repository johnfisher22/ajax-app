package ajax;

/**
 * @author Johnfisher Uchem
 *     
 * Contains different menus for this application.  
 * 
 */
public class MenuServiceImpl implements MenuInterface
{

	/**
	 * Shows the main menu for this application 
	 */
	public void showSystemenu() 
	{
		
		System.out.println("*****************************");
		System.out.println("*   AJAX APARTMENTS INC.  *\n" 
							+ "*   APPLICATION MANAGER   *      \n");
		
		System.out.println("* ENTER 1 FOR CLIENTS SERVICES\n" 
							+ "* ENTER 2 FOR BILLS & RENT SERVICES\n"
							+ "* ENTER 3 TO ENTER APARTMENT BLOCK\n" 
							+ "* ENTER 4 FOR EMPLOYEE SERVICES\n" 
							+ "* ENTER 5 FOR EMPLOYEES SCHEDULES\n"
							+ "* ENTER 6 TO CONTACT OFFICE \n" 
							+ "* ENTER 7 TO PLAY NUMBER GAME\n"
							+ "* ENTER 8 TO USE CALCULATOR\n" 
							+ "* ENTER 9 FOR TEMPERATURE CONVERTER\n"
							+ "* ENTER 10 TO VENDING MACHINE\n" 
							+ "* ENTER 11 TO EXIT THIS PROGRAM");
		System.out.println("*****************************");
		
		
	}
	
	/**
	 * Shows the menu for office information.
	 */
	public void showOfficeInfo() 
	{
		System.out.println("OFFICE LOCATION & INFO: \n" 
							+ "3001 Dunge Street,\nBismarck, ND, USA\n"
							+ "Office number: (701)-555-4489 \n" 
							+ "Maintenance number: (701)-555-0009\n"
							+ "Office email: staff@ajax.com\n" + "For Emergency : 911\n");

	}

	/**
	 * Shows the menu for viewing management team.
	 */
	public void viewManagementTeam() 
	{
		// Telephone help lines
		System.out.println("WELCOME TO AJAX APARTMENTS !\n" 
							+ "NO SPACING BETWEEN PHONE NUMBERS!\n"
							+ "For emergency call 911\n" 
							+ "For help call 701-555-0009\n");

		// Management team information
		System.out.println("SOME OF OUR MANAGEMENT TEAM MEMBERS ARE : \n" 
							+ "Marketing Manager - Emy Hintz \n"
							+ "Human Resources Manager - Frank Kleen\n" 
							+ "Customer Service - Chris Bell\n"
							+ "Maintenance Manager - Eric Madilan\n");
	}
	
	/**
	 * Shows the menu for employees related work information
	 * 
	 */
	public void showStaffMenu() 
	{
		System.out.println("*********************************");
		System.out.println("*     EMPLOYEES APP MANAGER     *");
		System.out.println("*ENTER 1 TO GET ALL STAFF INFORMATION\n" 
							+ "*ENTER 2 TO GET A STAFF INFORMATION\n"
							+ "*ENTER 3 TO SEE HOURLY PAY RATE\n" 
							+ "*ENTER 4 TO SEE NUMBER OF HOURS WORKED:\n" 
							+ "*ENTER 5 TO EXIT");
		System.out.println("**********************************\n");
	}


	/**
	 * Displays Apartments details
	 */
	public void apartmentDetails() 
	{
		System.out.println("OUR APARTMENTS FACILITIES HAVE :\n" + "2 standard bedrooms\n"
							+ "1 sittingroom\n" + "2 kitchens & 2 toilets\n" + "1 balcony \n"
							+ "2 air conditioners & other comfort machines\n");

	}

	/**
	 * Shows residents menu
	 */
	public void showResidentsMenu() 
	{
		System.out.println("ENTER 1 TO SEE ALL RESIDENTS\n" 
							+ "ENTER 2 TO FIND A RESIDENT\n" 
							+ "ENTER 3 TO REMOVE A RESIDENT\n"
							+ "ENTER 4 TO ADD NEW RESIDENT\n" 
							+ "ENTER 5 TO EXITt\n");

	}

	
	/**
	 * Shows the menu for  viewing clients accounts information
	 */
	public void showAccountsMenu() 
	{

		System.out.println("ENTER 1 TO CHECK BALANCE\n" 
							+ "ENTER 2 TO MAKE DEPOSIT\n" 
							+ "ENTER 3 TO MAKE WITHDRAWAL\n" 
							+ "ENTER 4 TO EXIT");

	}

	
	/*
	 * Shows calculator menu information
	 */
	public  void calculatorMenu() 
	{

		System.out.println("SELECT OPERATION: \n" + "EBTER 1 FOR ADDITION \n" 
							+ "ENTER 2 FOR SUBTRACTION \n" + "ENTER 3 FOR MULTIPLICATION \n"
							+ "ENTER 4 FOR DIVISION \n" + "ENTER 5 FOR EXPONENT \n" 
							+ "ENTER 6 FOR SQUAROOT \n" + "TYPE EXIT TO QUIT");
	}



	/**
	 * Shows residents' records menu
	 */
	public void showRecordsMenu() 
	{
		String residentsRecordMenu = "*****************************\n" +
		 "ENTER 1 TO VIEW ALL RESIDENTS: \n" 
		 +  "ENTER 2 TO VIEW A RESIDENT: \n" 
		 + "ENTER 3 TO REMOVE A RESIDENT: \n"
		 + "ENTER 4 TO ADD NEW RESIDENT: \n" 
		 + "ENTER 5 TO EXIT\n" +  "*****************************\n" ;
		
		System.out.println(residentsRecordMenu);
	}
	
	/**
	 * Shows menu for client's payment operations
	 */
	public static void showMenu() {
	String	menu = "ENTER 0 TO MAKE PAYMENT\n" 
					+ "ENTER 1 TO DELETE ALL RECORDS" 
					+ "\nENTER 2 TO VIEW ALL PAYMENTS" 
					+ "\nENTER 3 TO SAVE PAYMENT TO TEXT FILE" 
					+ "\nENTER 4 TO VIEW PAYMENT IN TEXT FILE" 
					+  "\nENTER 5 TO EXIT\n";
	
	System.out.println(menu);
	}
	
	/**
	 * Shows access operations into apartment blocks
	 */
	public static void showGateAccessMenu() {
	
		String gateAccessMenu = ("\nENTER 1 TO ENTER APT. BUILDING\n" 
								+ "ENTER 2 TO ADD NEW GATE PASS\n" 
								+ "ENTER 3 TO DELETE A GATE PASS\n" 
								+ "ENTER 4 TO VIEW ALL GATE PASS, \nINSERF YOUR 10-DIGIT STAFF PASS CODE\n" 
								+ "ENTER 5 TO EXIT\n" 
								+ "STAFF ACCESS PASS IS: staffaj719");

		System.out.println(gateAccessMenu);
	}
	
	/**
	 * Shows employees menu options
	 */
	public static void showEmployeeMenu() {
		String employeeMenu = "ENTER 1 FOR HR MANAGER:\n" 
							  + "ENTER 2 FOR MAINTENANCE MANAGER:\n" 
							  + "ENTER 3 FOR HR STAFF:\n"
							  + "ENTER 4 FOR MAINTENANCE:\n" 
							  + "ENTER 5 FOR OTHER STAFF:\n" 
							  + "ENTER 0 TO EXIT:\n";
		
		System.out.println(employeeMenu);
	}
	
	public static void tempConversionMenu() {
		
		String tempMenu = "ENTER 1 TO CONVERT TO FAHRENHEIT\n" 
						+ "ENTER 2 TO CONVERT TO CELSIUS\n" 
						+ "ENTER 3 TO EXIT\n";
		System.out.println(tempMenu);
	}

	public void showRecetptionistSchedule() {
		String scheduleMenu  = "This position works day shift. \n" 
								+ "Schedule is Monday to Friday, 7:00 AM - 3:30 PM\n";
		System.out.println(scheduleMenu);
	}
	
	public void showLeasingSchedule() {
	String leasingSchedule = "LEASING works day shift, Monday to Saturday, 7:00 AM - 3:30 PM";
	System.out.println(leasingSchedule);
	}
	
	public void showMaintenanceSchedule() {
		String maintenanceSchedule = "MAINTENANCE works day shift, Monday to Friday, 7:00 AM - 3:30 PM\n" + "On-call weekends";
		System.out.println(maintenanceSchedule);
		}
	
	public void showPositionsMenu()
	{
		String positions = "POSITIONS INCLUDE: \n" + "IT, HR, MARKETING, RECEPTIONIST, LEASING, MAINTENNCE ";
		
		System.out.println(positions);
	}
	
}
