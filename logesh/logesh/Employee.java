package logesh;
import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.FileReader;
	public class Employee {          
	    public static void main(String args[]) throws IOException {
	        BufferedReader rf = new BufferedReader(new FileReader("employee.txt"));
	        int visitorsCount[][][];
	        visitorsCount = new int[12][][];
	        int daysOfMonth[] = {31,29,31,30,31,30,31,31,30,31,30,31};
	        for (int i = 0;i < visitorsCount.length; i++ ) {
	        	visitorsCount[i] = new int [daysOfMonth[i]][24];
				for (int j = 0;j < visitorsCount[i].length; j++ ) {
					for (int k = 0;k < visitorsCount[i][j].length; k++ ){
						visitorsCount[i][j][k] = Integer.valueOf(rf.readLine()); 
					}
				}
	        }

	    }
	}
