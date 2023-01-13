package day9;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonsDetails {

private String firstName, lastName, address, city, state, emailId;
private long zipCode;
private long phoneNumber;
public PersonsDetails(String firstName, String lastName, String address, String city, String state, String emailId, long zipCode, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.emailId = emailId;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        }

public String getfirstName() {
        return firstName;
        }

public void setfirstName(String firstName) {
        this.firstName = firstName;
        }

public String getlastName() {
        return lastName;
        }

public void setlastName(String lastName) {
        this.lastName = lastName;
        }

public String getAddress() {
        return address;
        }

public void setAddress(String address) {
        this.address = address;
        }

public String getCity() {
        return city;
        }

public void setCity(String city) {
        this.city = city;
        }

public String getState() {
        return state;
        }

public void setState(String state) {
        this.state = state;
        }

public String getemailId() {
        return emailId;
        }

public void setemailId(String emailId) {
        this.emailId = emailId;
        }

public long getzipCode() {
        return zipCode;
        }

public void setzipCode(int zipCode) {
        this.zipCode = zipCode;
        }

public long getphoneNumber() {
        return phoneNumber;
        }

public void setphoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        }
        }

class AddressBookDirectory {
    public static ArrayList<PersonsDetails> record = new ArrayList<PersonsDetails>();
    public static void main(String[] args) {
        AddressBook1 addressBook = new AddressBook1();
        System.out.println("--------------WELCOME TO ADDRESS BOOK-------------");
        addressBook.createNewContact(record);
    }
}
class AddressBook extends AddressBookDirectory {
    public static void createNewContact(ArrayList<PersonsDetails> record) {
        Scanner sc = new Scanner(System.in);
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
}