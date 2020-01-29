//Name: Fiona Tong
//Date: 10/21/18
//Period: 6

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the name of a month in lowercase letters: ");
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();
        
        final String one = "january";
        final String two = "february";
        final String three = "march";
        final String four = "april";
        final String five = "may";
        final String six = "june";
        final String seven = "july";
        final String eight = "august";
        final String nine = "september";
        final String ten = "october";
        final String eleven = "november";
        final String twelve = "december";
        
        switch(month) {
			case one:
			case three:
			case five: 
			case seven:
			case eight:
			case ten:
			case twelve:
				System.out.println("The month of " + month + " has 31 days.");
				break;
				
			case four:
			case six:
			case nine: 
			case eleven:
				System.out.println("The month of " + month + " has 30 days.");
				break;
				
		    case two:
		        System.out.println("The month of " + month + " has 28 days.");
		        break;
		        
			default:
				System.out.println("That's not a real month!");
		}

    }
}
