package LockedMe;

		import java.util.List;
		import java.util.Scanner;

		public class HandleOptions {
			public static void handleWelcomeScreenInput() {
				boolean running = true;
				Scanner scan = new Scanner(System.in);
				do {
					try {
						MenuOptions.displayMenu();
						int userInput = scan.nextInt();

						switch (userInput) {
						case 1:
							FileOperations.displayAllFiles("main");
							break;
						case 2:
							HandleOptions.handleFileMenuOptions();
							break;
						case 3:
							System.out.println("The program was exited successfully.");
							running = false;
							scan.close();
							System.exit(0);
							break;
						default:
							System.out.println("Please select a valid option from above.");
						}
					} catch (Exception e) {
						System.out.println(e.getClass().getName());
						handleWelcomeScreenInput();
					} 
				} while (running == true);
			}
			
			public static void handleFileMenuOptions() {
				boolean running = true;
				Scanner scan = new Scanner(System.in);
				do {
					try {
						MenuOptions.displayFileMenuOptions();
						FileOperations.createMainFolderIfNotPresent("main");
						
						int input = scan.nextInt();
						switch (input) {
						case 1:
							// To add File/Folder
							System.out.println("Enter the name of the file to be added to the \"main\" folder");
							String fileToAdd = scan.next();
							
							FileOperations.createFile(fileToAdd, scan);
							
							break;
						case 2:
							// To delete File/Folder 
							System.out.println("Enter the name of the file to be deleted from the \"main\" folder");
							String fileToDelete = scan.next();
							
							FileOperations.createMainFolderIfNotPresent("main");
							List<String> filesToDelete = FileOperations.displayFileLocations(fileToDelete, "main");
							
							String deletionPrompt = "\nSelect the appropriate index number containg the file which you wish to delete"
									+ "\n(Enter 0 if you want to delete all elements)";
							System.out.println(deletionPrompt);
						
							int index = scan.nextInt();
							
							if (index != 0) {
								FileOperations.deleteFileRecursively(filesToDelete.get(index - 1));
							} else {
								
								// If the user desires, they may input the index number as equal to 0, to delete all the files displayed for the specified name
								for (String path : filesToDelete) {
									FileOperations.deleteFileRecursively(path);
								}
							}
							

							break;
						case 3:
							// To search for File/Folder 
							System.out.println("Enter the name of the file you wish to search from \"main\" folder");
							String fileName = scan.next();
							
							FileOperations.createMainFolderIfNotPresent("main");
							FileOperations.displayFileLocations(fileName, "main");

							
							break;
						case 4:
							// This will take you to the Previous menu
							return;
						case 5:
							// Exit
							System.out.println("Program exited successfully.");
							running = false;
							scan.close();
							System.exit(0);
						default:
							System.out.println("Please select a valid option from above.");
						}
					} catch (Exception e) {
						System.out.println(e.getClass().getName());
						handleFileMenuOptions();
					}
				} while (running == true);

	}

}
