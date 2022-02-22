package Basic_codes;

import java.util.*;
import customerpackage.customer;
public class Solution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer c=new customer();
		Scanner sc=new Scanner(System.in);
		String cName,email,phone,dob;
		System.out.println("Enter customer name: ");
		cName=sc.nextLine();
		System.out.println("Enter email : ");
		email=sc.nextLine();
		System.out.println("Enter phone : ");;
		phone=sc.nextLine();
		System.out.println("Enter dob : ");
		dob=sc.nextLine();
		c.acceptDetails(cName,email,phone,dob);
		c.printDetails();
		
	}

}
