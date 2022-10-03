package LockedMe;

public class LockedMeMain {

	public static void main(String[] args) {
		// Create the "main" folder if not present in the current folder structure so that the application may work accordingly
		
					FileOperations.createMainFolderIfNotPresent("main");
						
					MenuOptions.printWelcomeScreen("LockedMe", "Matthew Yuki");
						
					HandleOptions.handleWelcomeScreenInput();

	}

}
