/**
 * Purpose: The purpose of this class to create Address Book System and add
 * multiple persons details with their state or city reference.
 * @author Rahul
 */
package bridgelabz.services;
import bridgelabz.model.Person;
import java.util.*;
public class AddressBookMain {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String ,Person> personMap = new HashMap();
    public static void main(String[] args){
        boolean isExit = false;

        do {
            System.out.println("\n\t\tAddress Book System");
            System.out.println("\n\t\tEnter A to Add Person ");
            System.out.println("\t\tEnter E to Edit Person");
            System.out.println("\t\tEnter D to Delete Person");
            System.out.println("\t\tEnter S to Show Person Detail");
            System.out.println("\t\tEnter Q to Quit ");
            System.out.print("\t\tPlease Select One Option : ");
            char userInput = scanner.nextLine().toUpperCase().charAt(0);
            switch (userInput) {
                case 'A':
                    //add
                    addPersonDetail();
                    break;
                case 'E':
                    //edit
                    break;
                case 'D':
                    //delete
                    break;
                case 'S':
                    //Show
                    System.out.println("\n\t\t" + personMap.get(personMap.size() - 1).toString());
                    break;
                case 'Q':
                    //quit
                    isExit = true;
                    break;
                default:
                    System.out.println("Please select correct option");
            }
        } while (!isExit);


    }
    private static void addPersonDetail(){
        Person person ;
        person = contactFields();
        personMap.put(person.getFirstName(),person);
        System.out.println(personMap.toString());
    }
    private static void editContact(){
        System.out.print("\nEnter the first name of the person to edit : ");
        String firstName = scanner.nextLine();
        Person newPerson = personMap.get(firstName);
        System.out.println(newPerson.toString());
        if (personMap.get(firstName) != null){
            Person person = contactFields();
            for (int j = 0; j < personMap.size(); j++) {
                if (personMap.get(firstName).getFirstName().equalsIgnoreCase(newPerson.getFirstName())) {
                    personMap.put(person.getFirstName(), person);
                }
            }
        }else {
            System.out.println("Record Not Found");
        }
        System.out.println("\n\t\t" + personMap.toString());
    }
    private static Person contactFields(){
        Person person = new Person();
        System.out.print("Enter First Name : ");
        person.setFirstName(scanner.nextLine());
        System.out.print("Enter Last Name : ");
        person.setLastName(scanner.nextLine());
        System.out.print("Enter Address : ");
        person.setAddress(scanner.nextLine());
        System.out.print("Enter City : ");
        person.setCity(scanner.nextLine());
        System.out.print("Enter ZipCode : ");
        person.setZip(scanner.nextLine());
        System.out.print("Enter Phone Number : ");
        person.setPhone(scanner.nextLine());
        return person;
    }
    private static void deletePerson() {
        System.out.print("\nEnter the first name of the person to delete : ");
        String firstName = scanner.nextLine();
        Person newPerson = personMap.get(firstName);
        System.out.println(newPerson.toString());
        if (newPerson != null) {
            personMap.remove(firstName);
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Record not exist");
        }
    }
}
