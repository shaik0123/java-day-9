package day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook1 extends AddressBookDirectory{
      static Scanner sc = new Scanner(System.in);

    public static void createNewContact(ArrayList<PersonsDetails> record) {
        sc.nextLine();
        System.out.println(" create new contact");
        System.out.println("Enter your Firstname : ");
        String firstName = sc.nextLine();
        System.out.println("Enter your Lastname : ");
        String lastName = sc.nextLine();
        System.out.println("Enter your Address : ");
        String address = sc.nextLine();
        System.out.println("Enter your City : ");
        String city = sc.nextLine();
        System.out.println("Enter your State : ");
        String state = sc.nextLine();
        System.out.println("Enter your EmailId : ");
        String emailId = sc.nextLine();
        System.out.println("Enter your Zip : ");
        long zipCode = sc.nextLong();
        System.out.println("Enter your Phone Number : ");
        long phoneNumber = sc.nextLong();
        record.add(new PersonsDetails(firstName, lastName, address, city, state, emailId, zipCode, phoneNumber));
    }

    public static void displayAllContacts(ArrayList<PersonsDetails> record) {
        for (int i = 0; i < record.size(); i++) {
            System.out.println(" person contact details : ");
            System.out.println("FirstName : " + record.get(i).getfirstName());
            System.out.println(" LastName : " + record.get(i).getlastName());
            System.out.println(" Address : " + record.get(i).getAddress());
            System.out.println(" City : " + record.get(i).getCity());
            System.out.println(" State : " + record.get(i).getState());
            System.out.println(" emailId : " + record.get(i).getemailId());
            System.out.println(" ZipCode : " + record.get(i).getzipCode());
            System.out.println(" PhoneNumber : " + record.get(i).getphoneNumber());

        }
    }

    public static void editContactDetails(ArrayList<PersonsDetails> record) {
        System.out.println("Enter your Firstname to which you want to edit :");
        String firstname = sc.next();

        Iterator<PersonsDetails> iterator = record.listIterator();

        while (iterator.hasNext()) {
            PersonsDetails person = iterator.next();

            if (firstname.equals(person.getfirstName())) {

                System.out.println("select in option which you want to edit:");
                System.out.println("1. Last Name \n 2. Phone Number \n 3. City \n 4. Zip \n 5. State \n 6. address \n 7. emailId");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Change your lastname");
                        person.setlastName(sc.next());
                        break;
                    case 2:
                        System.out.println("Change your Phone Number");
                        person.setphoneNumber(sc.nextLong());
                        break;
                    case 3:
                        System.out.println("Change your City");
                        person.setCity(sc.next());
                        break;
                    case 4:
                        System.out.println("Change your Zip");
                        person.setzipCode(sc.nextInt());
                        break;
                    case 5:
                        System.out.println("Change your State");
                        person.setState(sc.next());
                        break;
                    case 6:
                        System.out.println("Change your Address");
                        person.setAddress(sc.next());
                        break;
                    case 7:
                        System.out.println("Change your EmailId");
                        person.setemailId(sc.next());
                        break;
                    default:
                        System.out.println("choose the correct number to perform changes");
                }

            } else {
                System.out.println(" Contact is not available in Address Book");
            }
        }
    }
}
