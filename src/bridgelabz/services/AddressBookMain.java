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
        addPersonDetail();
    }
    private static void addPersonDetail(){
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

        personMap.put(person.getFirstName(),person);
        System.out.println(personMap.toString());
    }
}
