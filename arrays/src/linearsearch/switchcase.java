package linearsearch;

import java.util.Scanner;

public class switchcase 
{
	public static void main(String[] args) {

	    String batchno;
	    Scanner jspiders = new Scanner(System.in);
	    System.out.println("enter your batchno:");
	    batchno = jspiders.next();
	    switch (batchno) {
	        case "BECA10":
	            System.out.println("you have a advance java class");
	            break;
	        case "BECA11":
	            System.out.println("you have a core java class");
	            break;
	        case "BECM44":
	            System.out.println("you have a sqlclass");
	            break;
	        default:
	            System.out.println("no batch found");
	            break;
	    }
	}

}
