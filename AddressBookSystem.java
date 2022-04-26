import java.util.Scanner;
import java.util.*;

class AddressBookSystem {
    public static void main(String args[]) {
        
        Contacts.createContact();
        Contacts.createSecondContact();
        Contacts.editContact();
        Contacts.deleteContact();

    }
}

class Contacts {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> firstContact = new ArrayList<String>(7);
    static ArrayList<String> secondContact = new ArrayList<String>(7);

    static void createContact() {

        System.out.println("Enter first contact details:  ");
        System.out.println("name address city state zip phoneNo email  : ");

        /** adding contact details from console **/
        for (int i = 0; i < 7; i++) {
            String s = sc.nextLine();
            firstContact.add(s);
        }
        System.out.println(" -------------------------------------------");
        System.out.println("contact details added :");
        System.out.println(firstContact);
    }

    static void createSecondContact() {

        System.out.println("******************************************");
        System.out.println("Create Second Contact details: ");
        System.out.println("name address city state zip phoneNo email  : ");

        /** adding contact details from console **/
        for (int i = 0; i < 7; i++) {
            String s = sc.nextLine();
            secondContact.add(s);
        }
        System.out.println(" -------------------------------------------");
        System.out.println("contact details added :");
        System.out.println(secondContact);
    }

    static void editContact() {

        System.out.println(" ");
        System.out.println("Enter which detail you have to edit  : ");
        System.out.println("name or address or city or state or zip or phone or email  : ");

        /** editing specific detail which user want **/
        String detailToEdit = sc.nextLine();

        switch (detailToEdit) {
            case "name":
                System.out.println("Enter the name to edit  : ");
                String n = sc.nextLine();
                firstContact.set(0, n);
                break;
            case "address":
                System.out.println("Enter the address to edit  : ");
                String a = sc.nextLine();
                firstContact.set(1, a);
                break;
            case "city":
                System.out.println("Enter the name to edit  : ");
                String city = sc.nextLine();
                firstContact.set(2, city);
                break;
            case "state":
                System.out.println("Enter the name to edit  : ");
                String state = sc.nextLine();
                firstContact.set(3, state);
                break;
            case "zip":
                System.out.println("Enter the name to edit  : ");
                String zip = sc.nextLine();
                firstContact.set(5, zip);
                break;
            case "phone":
                System.out.println("Enter the name to edit  : ");
                String phone = sc.nextLine();
                firstContact.set(6, phone);
                break;
            case "email":
                System.out.println("Enter the name to edit  : ");
                String email = sc.nextLine();
                firstContact.set(7, email);
                break;
            default:
                System.out.println("no edit match  : ");

        }

        System.out.println("----------------------------------------------------- ");
        System.out.println("edited contact details are :");
        System.out.println(firstContact);
        System.out.println(secondContact);

    }

    static void deleteContact() {

        System.out.println(" ");
        System.out.println("Enter the name of contact that have to delete  : ");
        String nameToDelete = sc.nextLine();

        /**deleting the added contact using Arraylist method **/

        if (nameToDelete.equals(firstContact.get(0))) {
            firstContact.removeAll(firstContact);
            System.out.println(" ");
            System.out.println("**contact deleted successfully**");

        } else {
            System.out.println("No name found");
        }

        System.out.println(firstContact);
    }
}


