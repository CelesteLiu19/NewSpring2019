//@author Celeste Liu
package textExcel;
import java.util.*;

import java.io.FileNotFoundException;


// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter in a command: ");
		String userInput = scanner.nextLine();
		Spreadsheet sheet = new Spreadsheet();
		
		while(!userInput.equalsIgnoreCase("quit")) {
			System.out.println(sheet.processCommand(userInput));
			System.out.println("Enter in a command: ");
			userInput = scanner.nextLine();
		}
		scanner.close();
	    // command loop for client code 
	}
}
