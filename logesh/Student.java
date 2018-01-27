     import java.io.*;
     import java.util.Scanner;
	  public class Student {
     public static void main (String args[]){
	       Scanner scan = new Scanner(System.in);
			String rollnumber;
     //noohii
			System.out.println("Enter the rollnumber");
			rollnumber = scan.nextLine();
			String rollnum = rollnumber.toUpperCase();
			String batch = rollnumber.substring(0,2);
			char dept = rollnumber.charAt(2);
			char sec = rollnumber.charAt(3);
			String number = rollnumber.substring(4,6);
			
	if(rollnumber.length() == 6)
	        {
		//chage
	System.out.println("year of entry :" + "20" +batch);
	if (dept == 'M' ){
		System.out.println("department : MECH");
	        }
	else if(dept == 'A' ){
		System.out.println("department : AUTO");

	        }
	else if(dept == 'P' ){
		System.out.println("department : CSE");

	        }
	else if(dept == 'E' ){
		System.out.println("department : EEE");

	        }
	else if(dept == 'F' ){
		System.out.println("department : IT");

	        }
	else if(dept == 'L' ){
		System.out.println("department : ECE");

	        }
	else if(dept == 'T' ){
		System.out.println("department : ETE");

	        }
	else if(dept == 'N' ){
		System.out.println("department : EIE");

	        }
	else if(dept == 'C' ){
		System.out.println("department : CIVIL");

	        }
	else {
		System.out.println("choose valid department");

	         }
	if (sec == '1' || sec =='5')
	         {
		System.out.println("section : A");
	         }
	else if(sec == '2' || sec =='6'){
		System.out.println("section : B");
	         }
	else if(sec =='3' || sec =='7'){
		System.out.println("section : c");
	         }
	else {
		System.out.println("Enter the valid section");
	         }
	System.out.println("Roll no :"+number);
	     }
	else {
		System.out.println("Enter the valid rollnumber");
	     }
		}
	}



