package LockedMe;

public class MenuOptions {

		public static void printWelcomeScreen(String appName, String developerName) {
			String companyDetails = String.format("------------------------------------------------------\n"
					+ "*** Welcome to %s.com \n" 
					+ "*** This application was developed by %s \n"
					+ "------------------------------------------------------\n", appName, developerName);
			String appFunction = "You can utilize this application to:\n"
					+ "- Retrieve all existing file names in the \"main\" folder\n"
					+ "- Search, add, or delete files in the \"main\" folder\n"
					+ "\n*** Please be careful to ensure the correct filename is provided for searching or deleting files ***\n";
			System.out.println(companyDetails);

			System.out.println(appFunction);
		}
		
		public static void displayMenu() {
			String menu = "\n*** (Select and input one of the option numbers from below and press Enter) ***\n\n"
					+ "1) Retrieve all the files from inside \"main\" folder\n" 
					+ "2) Display the menu for File operations\n"
					+ "3) Exit the program\n";
			System.out.println(menu);
		}
		
		public static void displayFileMenuOptions() {
			String fileMenu = "\n*** (Select and input one of the option numbers from below and press Enter) ***\n\n"
					+ "1) Add a file to \"main\" folder\n" 
					+ "2) Delete a file from \"main\" folder\n"
					+ "3) Search for a file from \"main\" folder\n" 
					+ "4) Show the Previous Menu\n" 
					+ "5) Exit the program\n";

			System.out.println(fileMenu);
	}
}
