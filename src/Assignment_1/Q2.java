package Assignment_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {

	public static List<String> readUserInput() {
		List<String> userData = new ArrayList<>();
		System.out.println("Please enter your data below: (send 'xdone' to exit) ");
		Scanner input = new Scanner(System.in);
		while (true) {
			String line = input.nextLine();
			if ("xdone".equalsIgnoreCase(line)) {
				break;
			}
			userData.add(line);
		}
		input.close();
		return userData;
	}

	public static void main(String[] args) {
		List<String> userData = readUserInput();
		System.out.printf("User Input Data:\n%s", String.join("\n", userData));
	}
}
