import javax.swing.*;
import java.util.*;

class PersonInfo {
  public String name;
  public String address;
  public String phoneNo;
  public String emailId;

public PersonInfo(String n, String add, String phone, String email){
    name = n;
    address = add;
    phoneNo = phone;
    emailId = email;
  }

public void print(){
    JOptionPane.showMessageDialog(null, "Name:" +name+"Address:" +address+ "Phone No.:"+ phoneNo+ "emailId:"+emailId);
  }
}


class AddressBookEditContact {
   ArrayList<PersonInfo> persons;

   public void AddressBook ( ) {
     persons = new ArrayList<PersonInfo>();
   }

   public void addPerson( ) {
     String name = JOptionPane.showInputDialog("Enter name");
     String add = JOptionPane.showInputDialog("Enter address");
     String pNum = JOptionPane.showInputDialog("Enter phone no");
     String emailID=JOptionPane.showInputDialog("Enter emailId:");

     PersonInfo p = new PersonInfo(name, add, pNum, emailID);
     persons.add(p);
 }

   public void edit(String name) {
        for (int i = 0; i < persons.size(); i++) {
              PersonInfo p = (PersonInfo)persons.get(i);
            if (name.equals(p.name)) {
              String Name = JOptionPane.showInputDialog("Enter new name");
              String Add = JOptionPane.showInputDialog("Enter new address");
              String PNum = JOptionPane.showInputDialog("Enter new phone no");
              String EmailID=JOptionPane.showInputDialog("Enter new emailId:");
              }
              else {
                   JOptionPane.showMessageDialog(null, "Name Not Found!");
              }
           }
       }

public static void main(String args[]){
 AddressBook add = new AddressBook();
 int ch;
 String name;

  while(true){
   name = JOptionPane.showInputDialog("Enter 1 to add\n Enter 2 to edit\n Enter 3 to exit\n");
     ch = Integer.parseInt(name);
      switch(ch){
        case 1:
             add.addPerson();
             break;
         case 2:
             name = JOptionPane.showInputDialog("Enter The Name");
             add.edit(name);
              break;
          case 3:
              System.exit(0);
       }
      }
   }
 }