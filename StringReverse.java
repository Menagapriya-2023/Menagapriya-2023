package week3.day2.Assignments;

import java.util.ArrayList ;
import java.util.Collections;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
		        // Create a list of strings
		        List<String> companyname = new ArrayList <String>();
		        companyname.add("HCL");
		        companyname.add("Wipro");
		        companyname.add("Aspire Systems");
		        companyname.add("CTS");

		        // Sort the list
		        Collections.sort(companyname);
		        //reverse the list
		        Collections.reverse(companyname);

		        // Iterate through the sorted list and print the elements
		        for (String Str : companyname) {
		            System.out.println("The reversed strings are " +Str);
		        }
		    }
}
	