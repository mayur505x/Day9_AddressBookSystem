import java.util.Scanner;
import java.util.*;

class AddressBookSystem
{
	public static void main(String args[])
	{
		System.out.println("Welcome To AddressBook !");
		Contacts.createContact();
	}
}

class Contacts
{
	static void createContact()
	{
		ArrayList<String> firstContact = new ArrayList<String>(7);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the contact details  : ");
		System.out.println("Name Address City State Zipcode PhoneNo EmailId  : ");
		
		/** adding contact using for loop and Arraylist  **/

		for(int i =0; i<7; i++)
		{
			String s = sc.nextLine();
			firstContact.add(s);
		}
		System.out.println("contact details added :");
		System.out.println(firstContact );
		
	}
}