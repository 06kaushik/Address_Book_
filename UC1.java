  
import java.util.*;
class contact {
                static String firstName;
                static String lastName;
                static String adress;
                static String city;
                static String state;
                static int pincode;
                static String email;
                static String contact;

        public void aContact(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Welcome to my Address book!");
        System.out.print("\n");
        System.out.print("\n1 - Insert a New Contact" );
        System.out.print("\n");
        System.out.print("\nChoose your option: ");

        int option = sc.nextInt();

        if (option ==1)
        {
                System.out.println("add first name of person ");
                firstName = sc.next();
                System.out.println("add last name of person ");
                lastName = sc.next();
                System.out.println("add adress of person ");
                adress = sc.next();
                System.out.println("add city of person ");
                city = sc.next();
                System.out.println("add state of person ");
                state = sc.next();
                System.out.println("add pincode of person ");
                pincode = sc.nextInt();
                System.out.println("add emailId of person ");
                email = sc.next();
                System.out.println("add contact of person ");
                contact = sc.next();
        }


	}

}
public class AddressBookMain extends contact {
        public static void main (String[] args){
                System.out.println("Welcome to Addressbook Program");
		contact adressbook = new contact();
                adressbook.aContact();
		System.out.println("Adress book: " +"\n" +"Name: "+ firstName + " " + lastName + "\n" + "Adress: " + adress + "," + city +
                             "," + state + "," + pincode +"email id: "+email+"\n"+"contact number: "+contact);
        }
}